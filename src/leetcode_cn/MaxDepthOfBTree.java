package leetcode_cn;

public class MaxDepthOfBTree {
    public static void main(String[] args) {


    }

    private static int a1(TreeNode root) {
        if (root==null) return 0;
        int leftDepth = a1(root.left);
        int rightDepth = a1(root.right);
        return leftDepth > rightDepth ? (leftDepth + 1):(rightDepth+1);
    }


    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }
}
