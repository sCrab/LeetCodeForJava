package leetcode_cn;

import java.io.IOException;

class Solution {
    public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        ListNode2 l = l1;
        while (l1 != null) {
            l1.val += l2.val;
            if (l1.val >= 10) {
                l1.val %= 10;
                if (l1.next==null){
                    l1.next = new ListNode2(0);
                    l2.next = new ListNode2(0);
                }
                l1.next.val += 1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l;
    }
}

class ListNode {
      int val;
      ListNode2 next;
     ListNode(int x) { val = x; }
  }

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode2 stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode2 dummyRoot = new ListNode2(0);
        ListNode2 ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode2(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode2 node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static void main(String[] args) throws IOException {
        String line;
            ListNode2 l1 = stringToListNode("");
            ListNode2 l2 = stringToListNode("");

            ListNode2 ret = new Solution().addTwoNumbers(l1, l2);

            String out = listNodeToString(ret);

            System.out.print(out);
    }
}