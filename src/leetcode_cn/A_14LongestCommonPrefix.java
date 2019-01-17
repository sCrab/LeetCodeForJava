package leetcode_cn;

public class A_14LongestCommonPrefix {
    public static void main(String[] args) {
        A_14LongestCommonPrefix a = new A_14LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        System.out.println(a.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        else if (strs.length == 1) return strs[0];

        String minStr = strs[0];
        for (String str : strs) {
            if (str.length() < minStr.length()) {
                minStr = str;
            }
        }

        String ret = "";
        while (minStr.length() != 0) {
            for (int i = 0; i < strs.length; i++) {
                if (!strs[i].startsWith(minStr)) break;
                if (i == strs.length - 1) {
                    ret = minStr;
                    return ret;
                }
            }
            minStr = minStr.substring(0, minStr.length() - 1);
        }
        return ret;
    }
}

