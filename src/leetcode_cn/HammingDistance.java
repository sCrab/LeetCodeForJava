package leetcode_cn;

public class HammingDistance {
    public static void main(String[] args) {

    }

    /*
    * 1.两个数进行异或之后，相同位变为0不同位变为1，这样有几个1就知道有几位不同了
    * 2.怎么知道几个1呢？
    *       当一个二进制数－1的时候，它的最右边一个1变为0，这个0后边的所有0变为1，
    *       我们发现减1的结果是把最右边的一个1开始的所有位都取反了。
    *       这样，我们让一个数与它-1的数进行&运算，那么从原来整数最右边一个1那一位开始所有位都会变成0
    *       那么就是说，会把该整数最右边一个1变成0.那么一个整数的二进制有多少个1，就可以进行多少次这样的操作。
    * */
    private static int a1(int x, int y) {
        int count = 0;
        int n = x ^ y;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
