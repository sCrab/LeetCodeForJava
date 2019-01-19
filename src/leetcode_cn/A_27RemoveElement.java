package leetcode_cn;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/1/19 18:53
 * @Modified By:
 */
public class A_27RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        A_27RemoveElement a = new A_27RemoveElement();
        System.out.println(a.removeElement(nums,val));
    }
    /*
     * @Author fly
     * @Description //从后向前，使用两个指针，一个指针递减，遇到nums[i]==val的时候，
     * 将nums[length]的值和nums[i]交换
     * @Date 2019/1/19 18:58
     * @Param [nums, val]
     * @return int
     **/
    public int removeElement(int[] nums, int val) {
        int length = nums.length-1;
        for (int i = nums.length-1; i>=0; i--) {
            if (nums[i] != val) {
                continue;
            } else {
                nums[i] = nums[length--];
            }
        }
        return length+1;
    }
}
