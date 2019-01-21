package leetcode_cn;
/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/1/21 15:42
 * @Modified By:
 */
public class A_58LengthOfLastWord {
    public static void main(String[] args) {
        A_58LengthOfLastWord a = new A_58LengthOfLastWord();
        System.out.println(a.lengthOfLastWord(" "));
    }
    private int lengthOfLastWord(String s) {
        if (s==null||s.length()==0||s.trim().length()==0) return 0;
        while (" ".equals(String.valueOf(s.charAt(s.length()-1)))) s=s.substring(0, s.length() - 1);
        String word = s.substring(s.lastIndexOf(" ")+1);
        return word.length();
    }

}
