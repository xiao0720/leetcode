class Solution:
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if root is None:
            return []
        else:
            return list(self.inorderTraversalGen(root))

    def inorderTraversalGen(self, node):
        if node.left is not None:
            for other in self.inorderTraversal(node.left):
                yield other
        yield node.value
        if node.right is not None:
            for other in self.inorderTraversal(node.right):
                yield other
            

