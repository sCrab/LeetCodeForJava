package leetcode_cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Fly
 * @Description: 给定前序中序遍历重建二叉树
 * @Date: 2019/4/8 16:03
 * @Modified By:
 */
public class ConstructBinaryTree {
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        ConstructBinaryTree c = new ConstructBinaryTree();
        TreeNode bTree = c.reConstructBinaryTree(pre, in);
        List<Integer> list = new ArrayList<>();
        c.bianli(bTree, list);
        System.out.println(list);

    }
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    private TreeNode reConstructBinaryTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart>preEnd||inStart>inEnd) return null;
        TreeNode node = new TreeNode(pre[preStart]);
        for (int i = inStart; i <= inEnd ; i++) {
            if (in[i] == pre[preStart]) {
                node.left = reConstructBinaryTree(pre, preStart + 1, preStart + i - inStart, in, inStart, i - 1);
                node.right = reConstructBinaryTree(pre, preStart + i - inStart + 1, preEnd, in, i + 1, inEnd);
                break;
            }
        }
        return node;
    }

    private void bianli(TreeNode treeNode,List list) {
        //输出该树的中序遍历
        if (treeNode==null) return;
        list.add(treeNode.val);
        bianli(treeNode.left, list);
        bianli(treeNode.right, list);
    }
}
