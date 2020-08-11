public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        
        // reverse and compare
        ListNode reverseNode= reverse(head);
        return isEqual(head,reverseNode);
        
        
    }
    public boolean isEqual(ListNode oneNode,ListNode reverseNode){
        while(oneNode!=null && reverseNode!=null){
            if(oneNode.val!=reverseNode.val){
                return false;
            }
            oneNode=oneNode.next;
            reverseNode=reverseNode.next;
        }
        return true;
    }
    
    
   public ListNode reverse(ListNode node){
       ListNode head=null;
       while(node!=null){
           ListNode n= new ListNode(node.val);
           n.next=head;
           head=n;
           node=node.next;
       }
       return head;
   }
}