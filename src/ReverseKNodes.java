public class ReverseKNodes {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=head;
        ListNode cur=head.next;
        ListNode next=cur.next;
        ListNode counter=head.next;
        //

        while (next!=null) {
            for (int i=0; i<k; i++) {
                cur.next=prev;

            }
        }

        return head;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

}
