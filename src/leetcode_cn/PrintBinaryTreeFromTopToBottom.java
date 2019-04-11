package leetcode_cn;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: Fly
 * @Description: 将二叉树从上到下遍历，广度优先
 * @Date: 2019/4/8 17:29
 * @Modified By:
 */
public class PrintBinaryTreeFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root==null) return list;
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.left!=null) queue.offer(temp.left);
            if (temp.right!=null) queue.offer(temp.right);
            list.add(temp.val);
        }
        return list;
    }
}
