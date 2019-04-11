package leetcode_cn;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/4/8 15:58
 * @Modified By:
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2==null||root1==null) return false;
        return isSubtree(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    private boolean isSubtree(TreeNode rootA, TreeNode rootB) {
        if (rootB==null) return true;
        if (rootA==null) return false;
        if (rootA.val == rootB.val) {
            return isSubtree(rootA.left, rootB.left) && isSubtree(rootA.right, rootB.right);
        } else return false;
    }
}
