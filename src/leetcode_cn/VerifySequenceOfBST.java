package leetcode_cn;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/4/9 18:44
 * @Modified By:
 */
public class VerifySequenceOfBST {
    public boolean VerifySquenceOfBST1(int [] sequence) {
        if (sequence.length==0) return false;
        return judge(sequence, 0, sequence.length - 1);
    }

    private boolean judge(int[] a, int l, int r) {
        if (l>=r) return true;
        int i = r;
        while (l < i && a[i-1] > a[r]) i--;
        for (int j = l; j < i; j++) {
            if (a[j]>a[r]) return false;
        }
        return judge(a, l, i-1) && judge(a, i , r - 1);
    }
}
