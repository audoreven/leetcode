package paid; // https://leetcode.com/problems/swap-nodes-in-pairs/

// paid 4/25

public class MSwapPairs {
    public static ListNode swapPairs(ListNode head) {

        if (head==null || head.next==null) {
            return head;
        }

        ListNode prev=head;
        ListNode cur=head.next;
        ListNode next=cur.next;
        ListNode last=new ListNode(0);
        last.next=head;
        head=cur;

        while (cur!=null) {
            last.next=cur;
            cur.next=prev;
            prev.next=next;

            last=prev;
            prev=next;
            cur=(next==null)? null : next.next;
            next=(next==null)? null : (next.next==null)? null : next.next.next;

        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);

        head=swapPairs(head);
        ListNode q=head;

        while (q!=null) {
            System.out.print(q.val);
            q=q.next;
        }

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
