package leetcode_cn;


import util.ListNode;

public class AddtwoNum {
    public static void main(String[] args) {
    }

    private ListNode a1(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(0);
        ListNode head = current;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry + (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            carry = sum / 10;
            current.next = new ListNode(sum%10);
            current = current.next;
            if (l1!=null) l1 = l1.next;
            if (l2!=null) l2 = l2.next;
        }
        if (carry>0) current.next = new ListNode(carry);
        return head.next;
    }

    /*class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }*/
}
