package leetcode_cn;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/4/18 15:20
 * @Modified By:
 */
public class CycleInListNode {
    /**
     * @return boolean
     * @Author fly
     * @Description 判断一个链表是否有环
     * @Date 2019/4/18 13:44
     * @Param [head]
     **/
    public boolean hasCycle(ListNode2 head) {
        ListNode2 a = head;
        ListNode2 b = a;
        while (a != null && a.next != null) {
            a = a.next.next;
            b = b.next;
            if (a == b) return true;
        }
        return false;
    }

    /**
     * @return leetcode_cn.ListNode2
     * @Author fly
     * @Description 判断一个链表的环入口
     * @Date 2019/4/18 13:45
     * @Param [head]
     **/
    public ListNode2 detectCycle(ListNode2 head) {
        ListNode2 walker = head;
        ListNode2 runner = head;
        while (runner != null && runner.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) break;
        }
        if (runner == null || runner.next == null) return null;
        ListNode2 headWalker = head;
        ListNode2 crossWalker = walker;
        while (headWalker != crossWalker) {
            headWalker = headWalker.next;
            crossWalker = crossWalker.next;
        }
        return headWalker;
    }

    /**
     * @return int
     * @Author fly
     * @Description 求有环链表的环长度 利用入口点再走一圈进行
     * @Date 2019/4/18 15:05
     * @Param [head]
     **/
    public int cycleLen1(ListNode2 head) {
        ListNode2 inCycle = detectCycle(head);
        ListNode2 walker = inCycle;
        int len = 1;
        while (inCycle != walker.next) {
            walker = walker.next;
            len++;
        }
        return len;
    }

    /**
     * @return int
     * @Author fly
     * @Description 求有环链表的环长度，利用快慢指针，当相遇的时候，再走到第二次相遇 or 从相遇点走到相遇点。
     * @Date 2019/4/18 15:11
     * @Param [head]
     **/
    public int cycleLen2(ListNode2 head) {
        ListNode2 walker = head;
        ListNode2 runner = head;
        int len = 1;
        while (runner != null && runner.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) break;
        }
        /*while (runner != null && runner.next != null) {
            ++len;
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) break;
        }*/
        while (runner != null && runner.next != walker) {
            runner = runner.next;
            ++len;
        }
        return len;
    }
}
