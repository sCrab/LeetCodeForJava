package leetcode_cn;

public class ReverseWordsInString3 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(a2(s));
    }

    private static String a1(String s) {
        String[] S = s.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < S.length; i++) {
            sb2.append(sb.append(S[i]).reverse() + " ");
            sb.delete(0, sb.length());
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    private static String a2(String s) {
        char[] chars = s.toCharArray();
        int start = 0, end = 0;
        while (start < chars.length) {
            end = s.indexOf(' ', start);
            if (end == -1) {
                reverse(chars, start, chars.length-1);
                break;
            }
            reverse(chars, start, end - 1);
            start=end+1;
        }
        return String.valueOf(chars);
    }


    private static void reverse(char[] chars, int l, int r) {
        char t;
        while (l < r) {
            t = chars[l];
            chars[l] = chars[r];
            chars[r] = t;
            l++;
            r--;
        }
    }

    private static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < (chars.length + 1) / 2; i++) {
            exch(chars, i, (chars.length) - 1 - i);
        }
        return String.valueOf(chars);
    }

    private static void exch(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
