package leetcode_cn;

public class A_21MergeTwoSortedLists {
    public static void main(String[] args) {


    }

    public ListNode2 mergeTwoLists(ListNode2 l1, ListNode2 l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode2 curr;
        if (l1.val <= l2.val) {
            curr = l1;
            curr.next = mergeTwoLists(l1.next, l2);
        } else {
            curr = l2;
            curr.next = mergeTwoLists(l1, l2.next);
        }
        return curr;
    }

    public ListNode2 mergeTwoList(ListNode2 l1, ListNode2 l2) {
        ListNode2 head = new ListNode2(0);
        ListNode2 curr = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
                curr = curr.next;
            } else if (l1.val > l2.val) {
                curr.next = l2;
                l2 = l2.next;
                curr = curr.next;
            }
        }
        if (l1 == null) {
            curr.next = l2;
        } else if (l2 == null) {
            curr.next = l1;
        }
        return head.next;
    }
}
