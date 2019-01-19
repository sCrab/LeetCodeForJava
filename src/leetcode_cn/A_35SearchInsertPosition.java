package leetcode_cn;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/1/19 19:26
 * @Modified By:
 */
public class A_35SearchInsertPosition {
    public static void main(String[] args) {
        A_35SearchInsertPosition a = new A_35SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(a.searchInsert(nums, target));
    }
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        int mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (nums[mid]<target) lo = mid+1;
            else if (nums[mid]>target) hi = mid;
            else return mid;
        }
        return lo;
    }
}
