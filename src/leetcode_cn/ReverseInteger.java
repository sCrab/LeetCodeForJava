package leetcode_cn;


public class ReverseInteger {
    public static void main(String[] args) {
        int x=123;
        System.out.println(new ReverseInteger().reverse(x));
//        System.out.println(0x7fffffff);
    }

    private int a1(int x) {
        int ret=0;
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        if (x<0) sb.deleteCharAt(0);
        StringBuilder sb2=sb.reverse();
        String s = sb2.toString();
        if (x<0) s = "-" + s;
        try {
            ret = Integer.valueOf(s);
        } catch (Exception e) {
            System.out.println(e);
        }
        return ret;
    }

    private int reverse(int x) {
        long result=0L;
        while(x!=0){
            result=result*10+(x%10);
            x/=10;
        }
        if(result>=Integer.MAX_VALUE||result<=Integer.MIN_VALUE) return 0;
        return (int)result;
    }
}
