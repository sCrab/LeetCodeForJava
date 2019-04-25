package leetcode_cn;

import java.util.HashSet;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/4/23 19:11
 * @Modified By:
 */
public class 链表相关 {
    /**
     * @return leetcode_cn.ListNode2
     * @Author fly
     * @Description 反转链表
     * @Date 2019/4/23 16:39
     * @Param [head]
     **/
    public ListNode2 reverseListNode(ListNode2 head) {
        ListNode2 pre = null;
        while (head != null) {
            ListNode2 temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

    /**
     * @return boolean
     * @Author fly
     * @Description 判断链表是否有环   使用set，如果接下来的node和set中重复了，那么就证明出现了环
     * @Date 2019/4/23 16:42
     * @Param [head]
     **/
    public boolean hasCycle1(ListNode2 head) {
        HashSet<ListNode2> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }

    /**
     * @return boolean
     * @Author fly
     * @Description 使用快慢指针判断链表是否有环，如果有环，快指针早晚会追到慢指针
     * @Date 2019/4/23 16:44
     * @Param [head]
     **/
    public boolean hasCycle2(ListNode2 head) {
        ListNode2 walker = head, runner = head;
        while (runner != null && runner.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) return true;
        }
        return false;
    }

    /**
     * @return leetcode_cn.ListNode2
     * @Author fly
     * @Description 通过set判断有环链表的入口，如果某个点重复了，那么这个点就是入口点
     * @Date 2019/4/23 16:47
     * @Param [head]
     **/
    public ListNode2 NodeInCycle1(ListNode2 head) {
        HashSet<ListNode2> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) return head;
            set.add(head);
            head = head.next;
        }
        return null;
    }

    /**
     * @return leetcode_cn.ListNode2
     * @Author fly
     * @Description 通过快慢指针判断链表的入口，令快指针与慢指针相遇的时候的点C（cross），入口点A，那么
     * 从head到A的距离为L，从A到C的距离为S，环的一圈为R。慢指针跑了L+S的距离，快指针跑了L+nR+S的距离，
     * 快指针的速度是慢指针的2倍，那么就有以下公式：2(L+S)=L+nR+S--->L+S=nR--->L=nR-s
     * 当一个指针从head出发，另一个指针从C出发，那么当第一个指针从Head跑到A，走了L距离。
     * 另一个指针从C跑了L的距离，即跑了nR-S的距离。相当于跑了n圈之后到了入口点A。这个时候两指针相遇。
     * @Date 2019/4/23 16:50
     * @Param [head]
     **/
    public ListNode2 detectCycle(ListNode2 head) {
        if (head == null) return null;
        ListNode2 i = head, j = head;
        boolean flag = false;
        while (j != null && j.next != null) {
            i = i.next;
            j = j.next.next;
            if (i == j) {
                flag = true;
                break;
            }
        }
        if (!flag) return null;
        j = head;
        while (j != i) {
            j = j.next;
            i = i.next;
        }
        return j;
    }

    /**
     * @return leetcode_cn.ListNode2
     * @Author fly
     * @Description 交换链表中相邻的两个元素
     * @Date 2019/4/23 17:21
     * @Param [head]
     **/
    public ListNode2 swapPairs(ListNode2 head) {
        if (head == null || head.next == null) return head;
        ListNode2 pre = new ListNode2(0);
        ListNode2 t = pre;
        ListNode2 a, b;
        pre.next = head;
        while (pre.next != null && pre.next.next != null) {
            a = pre.next;
            b = a.next;
            ListNode2 temp = b.next;
            pre.next = b;
            b.next = a;
            a.next = temp;
            pre = a;
        }
        return t.next;
    }

    /**
     * @return leetcode_cn.ListNode2
     * @Author fly
     * @Description 上一题的升级版，每k个相邻元素逆序
     * @Date 2019/4/23 17:50
     * @Param [head, k]
     **/
    public ListNode2 reverseKGroup(ListNode2 head, int k) {
        if (head == null) return head;
        ListNode2 curr = head;
        for (int i = 0; i < k - 1; i++) {
            curr = curr.next;
            if (curr == null) {
                return head;
            }
        }

        curr.next = reverseKGroup(curr.next, k);
        ListNode2 ans = swap(head, curr);
        return ans;
    }

    private ListNode2 swap(ListNode2 head, ListNode2 tail) {
        ListNode2 s = head;
        while (s != tail) {
            ListNode2 temp = s.next;
            s.next = tail.next;
            tail.next = s;
            s = temp;
        }
        return tail;
    }
}
