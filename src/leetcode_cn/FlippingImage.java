package leetcode_cn;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] a = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] b = a2(a);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j]);
            }
        }
    }

    private static int[][] a1(int[][] A) {//9ms
        reverse(A);
        change(A);
        return A;
    }

    private static int[][] a2(int[][] A) {//6ms
        int[][] B = new int[A.length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                B[i][j]=A[i][A.length-1-j]^1;
            }
        }
        return B;
    }

    private static void change(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j]==1) A[i][j]=0;
                else A[i][j]=1;
            }
        }
    }

    private static void reverse(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int l=0,r=A[i].length-1;
            while (l < r) {
                swap(A[i], l++, r--);
            }
        }
    }

    private static void swap(int[] A, int l, int r) {
        int temp = A[l];
        A[l] = A[r];
        A[r] = temp;
    }
}
