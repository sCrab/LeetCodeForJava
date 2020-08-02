package leetcode_cn;


import util.ListNode;

public class AddtwoNum {
    public static void main(String[] args) {
    }

    private ListNode2 a1(ListNode2 l1, ListNode2 l2) {
        ListNode2 current = new ListNode2(0);
        ListNode2 head = current;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry + (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            carry = sum / 10;
            current.next = new ListNode2(sum%10);
            current = current.next;
            if (l1!=null) l1 = l1.next;
            if (l2!=null) l2 = l2.next;
        }
        if (carry>0) current.next = new ListNode2(carry);
        return head.next;
    }

    /*class ListNode2 {
        int val;
        ListNode2 next;

        public ListNode2(int val) {
            this.val = val;
        }
    }*/
}
