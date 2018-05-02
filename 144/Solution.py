class Solution:
    def preorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if root is None:
            return []
        else:
            return list(self.preorderTraversalGen(root))
    
    def preorderTraversalGen(self, node):
        yield node.val
        
        if node.left is not None:
            for other in self.preorderTraversalGen(node.left):
                yield other
        
        
        if node.right is not None:
            for other in self.preorderTraversalGen(node.right):
                yield other