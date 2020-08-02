import util.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int x = 5;
        ArrayUtils.print(m.count1(x));
        ArrayUtils.print(m.count2(x));
    }

    public int[] count1(int x) {
        int[] res = new int[x + 1];
        for (int i = 0; i < x + 1; i++) {
            res[i] = popCount(i);
        }
        return res;
    }

    private int popCount(int x) {
        int res = 0;
        while (x != 0) {
            if ((x & 1) == 1) res++;
            x = x >> 1;
        }
        return res;
    }

    public int[] count2(int x) {
        int[] res = new int[x + 1];
        for (int i = 1; i <= x; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }

}
