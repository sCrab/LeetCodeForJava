package leetcode_cn;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        for (String s : findWords(words)) {
            System.out.println(s);
        }
    }

    private static String[] a1(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (inRow1(words[i]) || inRow2(words[i]) || inRow3(words[i])) {
                list.add(words[i]);
            }
        }
        String[] a = new String[list.size()];
        int i = 0;
        for (String s : list) {
            a[i++] = s;
        }
        return a;
    }

    private static boolean inRow1(String word) {
        String row = "QWERTYUIOP";
        for (char c : word.toUpperCase().toCharArray()) {
            if (!row.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    private static boolean inRow2(String word) {
        String row = "ASDFGHJKL";
        for (char c : word.toUpperCase().toCharArray()) {
            if (!row.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    private static boolean inRow3(String word) {
        String row = "ZXCVBNM";
        for (char c : word.toUpperCase().toCharArray()) {
            if (!row.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList();
        String c1 = "QWERTYUIOPqwertyuiop";
        String c2 = "ASDFGHJKLasdfghjkl";
        String c3 = "ZXCVBNMzxcvbnm";
        for (String word : words) {
            int a1 = 0, a2 = 0, a3 = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c1.indexOf(c) != -1) {
                    a1 = 1;
                }
                if (c2.indexOf(c) != -1) {
                    a2 = 1;
                }
                if (c3.indexOf(c) != -1) {
                    a3 = 1;
                }
                if ((a1 + a2 + a3 )!= 1) {
                    break;
                }
            }
            if ((a1 + a2 + a3) == 1) {
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
