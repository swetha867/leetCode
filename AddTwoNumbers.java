public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(-1), curt = null;
       int sum = 0, carry = 0;
       curt = dum;
       while (l1 != null || l2 != null || carry != 0) {
           sum = 0;
           if (l1 != null) {
               sum += l1.val;
               l1 = l1.next;
           }
           if (l2 != null) {
               sum += l2.val;
               l2 = l2.next;
           }
           sum += carry;
           carry = sum / 10;
           ListNode temp = new ListNode(sum % 10);
           curt.next = temp;
           curt = curt.next;
       }
       return dum.next;    }
    public static void main(String[] args) {
        
    }
    
}