package leetcode_cn;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/1/19 19:09
 * @Modified By:
 */
public class A_28ImplementstrStr {
    public static void main(String[] args) {

    }
    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) return 0;
        int len = needle.length();
        for (int i = 0;i<=haystack.length()-len;i++){
            if (needle.equals(haystack.substring(i, i + len))) {
                return i;
            }
        }
        return -1;
    }
}
