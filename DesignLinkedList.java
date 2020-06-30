public class DesignLinkedList {
  class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }
    public Node(Node next, int val){
        this.next=next;
        this.val=val;
    }           
}
private Node head;
private int size;

/** Initialize your data structure here. */
public DesignLinkedList() {
    size=0;
    head=null;
}

 /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
 public int get(int index) {
  if (index >= size) return -1;
  Node current = head;
  for (int i = 0; i < index; i++) {
      current = current.next;
  }
  return current.val;
}

/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
public void addAtHead(int val) {
  
  Node newNode1=new Node(val);
  if(head!=null){
       newNode1.next=head;
  }
  head=newNode1;
  size++;
  
}

/** Append a node of value val to the last element of the linked list. */
public void addAtTail(int val) {
  Node current=head;
  while(current!=null){
      if(current.next==null){
      Node next=null;
      Node newNode =new Node(val);
      current.next=newNode;
      size++;
      return;
      }
      current=current.next;
  }
  
}

/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
public void addAtIndex(int index, int val) {
    if (index > size) return;
  if (index == 0) {
      addAtHead(val);
  } else {
      size++;
      Node current = head;
      for (int i = 0; i < index - 1; i++) {
          current = current.next;
      }
      Node node = new Node(val);
      node.next = current.next;
      current.next = node;
  }
}

/** Delete the index-th node in the linked list, if the index is valid. */
public void deleteAtIndex(int index) {
  if (index >= size) return;
  size--;

  if (index == 0) {
      head = head.next;
      return;
  }

  Node current = head;
  for (int i = 0; i < index - 1; i++) {
      current = current.next;
  }
  current.next = current.next.next;

  

}
public static void main(String[] args) {
  
 DesignLinkedList obj = new DesignLinkedList();
  int param_1 = obj.get(0);
  obj.addAtHead(5);
  obj.addAtTail(6);
  obj.addAtIndex(1,7);
  obj.deleteAtIndex(2);
  obj.addAtHead(57);

   param_1 = obj.get(2);

  System.out.println(param_1);
 
    
}


    
}