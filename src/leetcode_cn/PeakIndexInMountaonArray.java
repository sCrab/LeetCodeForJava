package leetcode_cn;

public class PeakIndexInMountaonArray {
    public static void main(String[] args) {
        int[] A = {0, 1, 0};
        System.out.println(a2(A));
    }

    private static int a1(int[] A) {
        for (int i = 1; i < A.length - 1; i++) {
            if ((A[i] > A[i - 1]) && (A[i] > A[i + 1])) {
                return i;
            }
        }
        return -1;
    }

    private static int a2(int[] A) {
        int left = 0, right = A.length - 1;
        while (left < right) {
            if ((A[left] < A[left + 1]) && (A[right - 1] > A[right])) {
                left++;
                right--;
            } else break;

        }
        if (left == right) return left;
        else if (A[left] > A[left + 1]) return left;
        else return right;
    }
}
