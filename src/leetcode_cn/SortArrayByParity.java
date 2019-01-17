package leetcode_cn;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4};
        int[] B = a2(A);
        for (int i = 0; i < A.length; i++) {
            System.out.println(B[i]);
        }
    }

    private static int[] a1(int[] A) {//60ms
        int n = A.length;
        int[] B = new int[n];
        int l = 0, r = n - 1;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) B[l++] = A[i];
            else B[r--] = A[i];
        }
        return B;
    }

    private static int[] a2(int[] A) {
        int l = 0, r = A.length - 1;
        while (l < r) {
            if (A[l] % 2 == 0) l++;
            else swmp(A, l, r--);
        }
        return A;
    }

    private static void swmp(int[] A, int l, int r) {//23ms
        int temp = A[l];
        A[l] = A[r];
        A[r] = temp;
    }
}
