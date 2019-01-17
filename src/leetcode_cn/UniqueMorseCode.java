package leetcode_cn;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCode {
    public static void main(String[] args) {
        String[] words={"gin", "zen", "gig", "msg"};
        System.out.println(a1(words));
    }

    private static int a1(String[] words) {
        Set<String> set = new HashSet<>();
        for (String s : words) {
            set.add(translate(s));
        }
        return set.size();
    }

    private static String translate(String word) {
        String[] mores={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            sb.append(mores[c-'a']);
        }
        return sb.toString();
    }
}
