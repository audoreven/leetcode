package money; // https://leetcode.com/problems/merge-two-sorted-lists/

public class EMergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode track = ans;

        while (p != null && q != null) {
            if (p.val <= q.val) {
                track.next = new ListNode(p.val);
                p = p.next;
            } else {
                track.next = new ListNode(q.val);
                q = q.next;
            }
            track = track.next;
        }

        track.next = (l1 == null) ? l2 : l1;

        return ans.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
