package leetcode_cn;

import java.util.*;

public class LongestSubstringWithoutRepeatCharacter {
    public static void main(String[] args) {
        String s = "tmmzuxt";
//        System.out.println(new LongestSubstringWithoutRepeatCharacter().a4(s));
        System.out.println(new Character('c'));
    }

    public int a1(String s) {
        int max = 0;
        Queue<Character> queue = new LinkedList();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (queue.contains(chars[i])) {
                max = max > queue.size() ? max : queue.size();
                while (queue.poll()!=chars[i]){}
            }
            queue.offer(chars[i]);
        }
        max = max > queue.size() ? max : queue.size();
        return max;
    }

    public int a2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, ans = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(set.size(), ans);
            } else set.remove(s.charAt(i++));
        }
        return ans;
    }

    public int a3(String s) {
        int ans = 0, n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0,j=0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j))+1, i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j);
        }
        return ans;
    }

    public int a4(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
