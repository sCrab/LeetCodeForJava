package leetcode_cn;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/1/21 16:10
 * @Modified By:
 */
public class A_66PlusOne {
    public static void main(String[] args) {
        A_66PlusOne a = new A_66PlusOne();
        for (int i : a.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})) {
            System.out.print(i+",");
        }
        System.out.println();
    }
    private int[] plusOne(int[] digits) {
        int pos = digits.length - 1;
        while (pos >= 0) {
            if (digits[pos] != 9) {
                digits[pos] += 1;
                break;
            } else {
                digits[pos--] = 0;
                if (pos == -1) {
                    int[] digit = new int[digits.length + 1];
                    digit[0] = 1;
                    for (int i=1;i<digit.length;i++) {
                        digit[i] = digits[i - 1];
                    }
                    digits = digit;
                    break;
                }
            }
        }
        return digits;
    }
}
