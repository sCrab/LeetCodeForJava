import leetcode_cn.TreeNode;
import 剑指offer.Singleton_1;

import java.util.*;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/3/14 21:29
 * @Modified By:
 */
public class Solution {
    public static void main(String[] args) {
        Singleton_1 s1 = Singleton_1.getInstance();
        Singleton_1 s2 = Singleton_1.getInstance();
        System.out.println(s1 == s2);
    }
}
