package leetcode_cn;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(a1("hello"));
    }

    private static String a1(String s) {
        char[] chars=s.toCharArray();
        for (int i = 0; i < (chars.length+1) / 2; i++) {
            exch(chars, i, (chars.length)-1-i);
        }
        return String.valueOf(chars);
    }

    private static void exch(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

}
