package leetcode_cn;

public class SortArrayByParity2 {
    public static void main(String[] args) {

    }

    private static int[] a1(int[] A) {
        int i=0,j=1;
        int[] B = new int[A.length];
        for (int k = 0; k < A.length; k++) {
            if (A[k]%2==0){
                B[i] = A[k];
                i+=2;
            }else {
                B[j] = A[k];
                j+=2;
            }
        }
        return B;
    }
}
