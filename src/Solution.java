import leetcode_cn.TreeNode;

import java.util.*;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/3/14 21:29
 * @Modified By:
 */
public class Solution {
    public static void main(String[] args) {

    }

    public TreeNode Convert(TreeNode root) {
        /*
         * 使用递归将二叉树转换为双链表
         * 1，将左子树构造双链表，并返回链表的头结点
         * 2，定位至左子树双链表最后一个节点。
         * 3.如果左子树链表不为空的话，将当前root追加到左子树链表。
         * 4.将右子树构造成双链表，并返回链表头节点。
         * 5.如果右子树链表不为空的话，将该链表追加到root节点之后。
         * 6.根据左子树链表是否为空确定返回的节点。
         * */
        if (root == null) return null;
        if (root.left == null && root.right == null) return root;

        TreeNode left = Convert(root.left);//左子树的头节点
        TreeNode p = left;
        while (p != null && p.right != null) p = p.right;//左子树的尾节点
        if (left != null) {
            p.right = root;
            root.left = p;
        }

        TreeNode right = Convert(root.right);
        if (right != null) {
            root.right = right;
            right.left = root;
        }

        return left == null ? root : left;
    }

}
