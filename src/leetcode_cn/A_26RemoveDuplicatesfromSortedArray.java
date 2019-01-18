package leetcode_cn;

public class A_26RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        A_26RemoveDuplicatesfromSortedArray a = new A_26RemoveDuplicatesfromSortedArray();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(a.a(nums));
    }

    /*
     * 另外一种写法
     * */
    public int a(int[] nums) {
        int len = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[len] == nums[i]) {
                continue;
            } else {
                nums[++len] = nums[i];
            }
        }
        return len + 1;
    }
    /*
     * 使用i和j两个快慢指针，当nums[i]=num[j]的时候，j+1，跳过这些重复的项。
     * 当！=的时候，将i+1和j交换位置，i++
     * */
    public int removeDuplicate(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[++i] = nums[j++];
            }
        }
        return i + 1;
    }

    /*
     * 这是一个效率极低的方法
     * */
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; ) {
            if (nums[i] == nums[i + 1]) {
                deleteAtIndex(nums, i + 1);
                len--;
            } else i++;
        }
        return len;
    }

    private void deleteAtIndex(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }
}
