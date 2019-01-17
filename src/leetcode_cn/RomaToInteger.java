package leetcode_cn;

import java.util.HashMap;
import java.util.Map;

public class RomaToInteger {
    //    I<IV(Q)<V<IX(W)<X<XL(E)<L<XC(R)<C<CD(T)<D<CM(Y)<M
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(a2(s));
    }

    private static int a1(String s) {
        String a = s.replace("IV", "Q")
                .replace("IX", "W")
                .replace("XL", "E")
                .replace("XC", "R")
                .replace("CD", "T")
                .replace("CM", "Y");
        char[] res = a.toCharArray();
        int sum=0;
        for (char c : res) {
            switch (c) {
                case 'I':sum+=1;break;
                case 'Q':sum+=4;break;
                case 'V':sum+=5;break;
                case 'W':sum+=9;break;
                case 'X':sum+=10;break;
                case 'E':sum+=40;break;
                case 'L':sum+=50;break;
                case 'R':sum+=90;break;
                case 'C':sum+=100;break;
                case 'T':sum+=400;break;
                case 'D':sum+=500;break;
                case 'Y':sum+=900;break;
                case 'M':sum+=1000;break;
            }
        }
        return sum;
    }

    private static int a2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] res = s.toCharArray();
        int i = s.length() - 1;
        int count = map.get(res[i]);
        for (; i > 0; i--) {
            if (map.get(res[i - 1]) < map.get(res[i])) {
                count -= map.get(res[i - 1]);
            } else {
                count += map.get(res[i - 1]);
            }
        }
        return count;
    }
}
