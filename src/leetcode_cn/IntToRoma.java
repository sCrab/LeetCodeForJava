package leetcode_cn;

public class IntToRoma {
    public static void main(String[] args) {
        System.out.println(a1(525));
    }

    private static String a1(int num) {
        int i=0;
        String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX",
                "V", "IV", "I"};
        int[] base = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String roman = "";
        while (num!=0) {
            if (base[i] <= num) {
                num -= base[i];
                roman += str[i];
            }else{
                i++;
            }
        }
        return roman;
    }
}
