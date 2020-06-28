/*
Keep track  of two pointers in the linkedlist,and start them at the
beginning of the linkedlist.
At each iteration of the algorithm,move the first pointer by 
one node and the second pointer by two nodes.
If the two pointers are ever the same(other than at the beginning of the algorithm),
then there is a cycle.
If a pointer ever reaches the end of the linkedlist before the pointers are the same,
then there is nocycle.This takes O(n)
time.


/
*/


public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode firstPointer = head;
        ListNode secondPointer = head;

        while (secondPointer.next != null && secondPointer.next.next != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next.next;
            if (firstPointer == secondPointer) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 10;
        ListNode node = new ListNode();
        node.val = 20;
        head.next = node;
        node.next = head;
        System.out.println(hasCycle(head));
    }
    
}