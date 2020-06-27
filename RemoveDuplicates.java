
 class RemoveDuplicates{
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode current = head;
        while (current.next != null) {

            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;

    }

    public static void main(String[] args) {
        // [1,1,2]
        ListNode head = new ListNode();
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        head.val = 1;
        listNode1.val = 1;
        listNode2.val = 2;
        head.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = null;
       ListNode current =deleteDuplicates(head);
        while(current!=null){
            System.out.println(current.val);
            current=current.next;
        }
    }
}