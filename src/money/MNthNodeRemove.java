package money; // https://leetcode.com/problems/remove-nth-node-from-end-of-list/

public class MNthNodeRemove {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null || head.next==null) {
            return null;
        }
        ListNode p=head;
        ListNode q=head;
        for (int i=0; i<n; i++) {
            q=q.next;
        }
        if (q==null) {
            return p.next;
        } else {
            q=q.next;
        }
        while (q!=null) {
            p=p.next;
            q=q.next;
        }
        q=p.next;
        p.next=q.next;

        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    // opt
    /*
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }*/
}
