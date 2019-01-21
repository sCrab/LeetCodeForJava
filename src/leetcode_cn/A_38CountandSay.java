package leetcode_cn;

public class A_38CountandSay {

    public static void main(String[] args) {
        A_38CountandSay a = new A_38CountandSay();
        for (int i = 1; i < 8; i++) {
            System.out.println(a.countAndSay(i));
        }
    }

    /*
     * 1. 1
     * 2. 11
     * 3. 21
     * 4. 1211
     * 5. 111221
     * 6. 312211
     * 7. 13112221
     * 8. 1113213211
     * 题目的意思就是，前一个字符串由几个1、2、3组成的
     * */
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String ret = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int count=0;
        char c = ret.charAt(0);
        for (int i = 0; i < ret.length(); i++) {
            if (c == ret.charAt(i)) {
                count++;
            } else {
                sb.append(count).append(c);
                c = ret.charAt(i);
                count = 1;
            }
        }
        sb.append(count > 0 ? count + String.valueOf(c) : "");
        return sb.toString();

    }
}
