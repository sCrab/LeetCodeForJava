package leetcode_cn;

public class ToLowerCase {
    public static void main(String[] args) {
        String s ="AEIOY";
        System.out.println(tooLowerCase(s));
    }
    private static String tooLowerCase(String str) {

        return str.toLowerCase();
    }
    private static String toLowerCase(String str) {
        if (str==null) return null;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                c= (char) (c+32);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
