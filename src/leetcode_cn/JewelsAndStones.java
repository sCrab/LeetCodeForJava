package leetcode_cn;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public static void main(String[] args) {
        String J = "z";
        String S = "ZZ";

        int a = solution3(J, S);
        System.out.println(a);
    }


    private static int numJewelsInStones(String J, String S) {//14ms
        int i = 0;
        for (int index = 0; index < S.length(); index++) {
            char c = S.charAt(index);
            if (J.contains(String.valueOf(c))) {
                i++;
            }
        }
        return i;
    }

    private static int solution2(String J, String S) {//14ms
        int i = 0;
        for (int j = 0; j < J.length(); j++) {
            for (int k = 0; k < S.length(); k++) {
                if (J.charAt(j) == S.charAt(k)) i++;
            }
        }
        return i;
    }

    private static int solution3(String J, String S) {//28ms
        int i = 0;
        Set set = new HashSet();
        for (char j:J.toCharArray()) set.add(j);
        for (char s : S.toCharArray()) if (set.contains(s)) i++;
        return i;
    }

}
