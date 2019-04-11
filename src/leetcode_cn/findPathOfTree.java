package leetcode_cn;

import java.util.ArrayList;

/**
 * @Author: Fly
 * @Description: 深度优先查找符合的路径，查到根节点，然后回到上一个父节点，继续搜
 * @Date: 2019/4/9 21:03
 * @Modified By:
 */
public class findPathOfTree {
    private ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    private ArrayList<Integer> path = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root==null) return list;
        findPath(root,target);
        return list;
    }

    private void findPath(TreeNode root, int target) {
        if (root==null) return;
        path.add(root.val);
        target -= root.val;
        boolean isLeaf = root.left == null && root.right == null;
        if (target==0&&isLeaf) list.add(new ArrayList<>(path));
        if (!isLeaf&&target>0){
            findPath(root.left,target);
            findPath(root.right,target);
        }
        path.remove(path.size() - 1);
    }
}
