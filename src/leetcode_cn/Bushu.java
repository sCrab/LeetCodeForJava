package leetcode_cn;

public class Bushu {
    public static void main(String[] args) {

    }

    private static int a1(int num) {
        int mask=~0;
        while ((mask & num) != 0) {
            mask=mask>>1;
        }
        return (~mask) & (~num);
    }
}
