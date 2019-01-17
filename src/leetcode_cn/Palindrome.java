package leetcode_cn;


public class Palindrome {
    public static void main(String[] args) {
        System.out.println(new Palindrome().a1(121));
    }

    private boolean a1(int x) {
        if (x < 0) return false;
        else if (x==0) return true;

        int y=0,temp=x;
        while (temp != 0) {
            y = y * 10 + temp % 10;
            temp /= 10;
        }
        return x == y;
    }

    private int reverse(int x) {
        long ret = 0L;
        while (x != 0) {
            ret = ret * 10 + x % 10;
            x /= 10;
        }
        return (int) ret;
    }
}
