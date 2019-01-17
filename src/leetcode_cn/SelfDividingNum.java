package leetcode_cn;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNum {
    public static void main(String[] args) {
        List<Integer> list = a1(1, 22);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
//        System.out.println('1'-48);
    }

    private static List<Integer> a1(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <=right ; i++) {
            if (isSDN(i)) list.add(i);
        }
        return list;
    }

    private static boolean isSDN(int num) {
        var temp = num;
        while (temp!=0){
            var value=temp%10;
            if (value==0||num%value!=0) return false;
            temp/=10;
        }
        return true;
    }
}
