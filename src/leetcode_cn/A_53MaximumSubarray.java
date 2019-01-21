package leetcode_cn;

/**
 * @Author: Fly
 * @Description: 最大子序和问题，当sum加上下一个数为正的时候，我们就可以继续加（如果为副，我们就舍弃前边的）每加一位，
 * 就重新计算最大的和，然后继续
 * @Date: 2019/1/21 15:27
 * @Modified By:
 */
public class A_53MaximumSubarray {
    public static void main(String[] args) {
        A_53MaximumSubarray a = new A_53MaximumSubarray();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(a.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum>0) sum += num;
            else sum = num;
            max = Math.max(max, sum);
        }
        return max;
    }
}
