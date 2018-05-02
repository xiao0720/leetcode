class Solution:
    def postorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if root is None:
            return []
        else:
            return list(self.postorderTraversalGen(root))
    
    def postorderTraversalGen(self, node):
        
        if node.left is not None:
            for other in self.postorderTraversalGen(node.left):
                yield other
        
        if node.right is not None:
            for other in self.postorderTraversalGen(node.right):
                yield other

        yield node.val