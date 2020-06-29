public class LinkedListmiddleNode {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 10;
        ListNode node = new ListNode();
        node.val = 20;
        ListNode node1 = new ListNode();
        node1.val = 20;
        head.next = node;
        node.next = node1;
        System.out.println(middleNode(head));
    }
    
}