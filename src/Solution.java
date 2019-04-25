import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/3/14 21:29
 * @Modified By:
 */
public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {-4, -1, 0, 3, 10};
        int[] b = s.trap(a);
        for (int i : b) {
            System.out.println(i);
        }
    }

    public String customSortString(String S, String T) {
        int[] count = new int[26];
        for(char c:T.toCharArray()) ++count[c-'a'];
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray())
            while (count[c-'a']-->0) sb.append(c);
        for (char c='a';c<='z';c++)
            while (count[c-'a']-->0) sb.append(c);
        return sb.toString();
    }
}
