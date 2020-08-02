package util;

public class ArrayUtils {
    public static void print(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i!=a.length-1) System.out.print(",");
        }
        System.out.print("]");
    }
}
