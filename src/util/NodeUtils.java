package util;

import java.util.List;

public class NodeUtils {
    public static ListNode getListNodeByArray(int[] a) {
        if (a == null || a.length < 1) return null;
        ListNode node = new ListNode(a[0]);
        ListNode temp = node;
        for (int i = 1; i < a.length; i++) {
            temp.next = new ListNode(a[i]);
            temp = temp.next;
        }
        return node;
    }

    public static void printNode(ListNode node) {
        if (node == null) return;
        while (true) {
            System.out.print(node.val);
            node = node.next;
            if (node == null) {
                System.out.println();
                return;
            }
            System.out.print("-->");
        }
    }
}
