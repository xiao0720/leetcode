public class MaximumDepthOfBinaryTree {
  // public static void main(String[] args) {

  // }

  // Solution 1: set instance varibale
  int currentDepth, depth;

  public int maxDepthWithIV(TreeNode root) {
    if (root != null) {
      currentDepth++;

      if (currentDepth >= depth) {
        depth = currentDepth;
      }

      maxDepthWithIV(root.left);
      maxDepthWithIV(root.right);

      currentDepth--;
    }

    return depth;
  }

  // Solution 2: Top - bottom approach
  public int maxDepthTB(TreeNode root) {
     return depth(root, 0);
  }

  public int depth(TreeNode node, int n) {
    if (node != null) {
      n++;

      int leftDepth = depth(node.left, n);
      int rightDepth = depth(node.right, n);

      return leftDepth >= rightDepth ? leftDepth : rightDepth;
    }
    
    return n;
  }

  // Solution 3: Bottom - top approach - pending
}