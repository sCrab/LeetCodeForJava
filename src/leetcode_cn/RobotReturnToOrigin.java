package leetcode_cn;

public class RobotReturnToOrigin {
    public static void main(String[] args) {

    }

    private static boolean a1(String moves) {
        char[] chars=moves.toCharArray();
        if (chars.length%2!=0) return false;
        int U=0,D=0,L=0,R=0;
        for (char c : chars) {
            switch (c) {
                case 'U':++U;break;
                case 'D':++D;break;
                case 'L':++L;break;
                case 'R':++R;break;
            }
        }
        return U == D && L == R;
    }

    private static boolean a2(String moves) {
        int x=0,y=0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':++y;break;
                case 'D':--y;break;
                case 'L':++x;break;
                case 'R':--x;break;
            }
        }
        return x==0&&y==0;
    }
}
