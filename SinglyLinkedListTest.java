// test
public class SinglyLinkedListTest {
   public static void main(String[] args) {
       SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

       System.out.println("Add First - 1");
       sll.addLast(1);
       display(sll);

       System.out.println("Remove Last");
       sll.removeLast();
       display(sll);

       System.out.println("Add First - 1");
       sll.addFirst(1);
       display(sll);

       System.out.println("Add First - 2");
       sll.addFirst(2);
       display(sll);

       System.out.println("Add Last - 3");
       sll.addLast(3);
       display(sll);

       System.out.println("Add Last - 4");
       sll.addLast(4);
       display(sll);

       System.out.println("Remove Last");
       sll.removeLast();
       display(sll);

       System.out.println("Reverse Linked List");
       sll.reverse();
       display(sll);  

      
   } 

   public static void display(SinglyLinkedList sll){
    System.out.println("Linked List : " + sll);
    System.out.println("First Element : " + sll.first());
    System.out.println("Last Element : " + sll.last());
    System.out.println();
   }

   public String toString() {
       StringBuilder sb = new StringBuilder();
       Node<E> current = head;
   
       while (current != null) {
           sb.append(current.getElement());
           current = current.getNext();
       }
   
       return sb.toString();
   }
   
   public E removeLast() {
       if (isEmpty()) {
           return null;
       }
   
       E answer = tail.getElement();
   
       if (size == 1) {
           head = null;
           tail = null;
           size = 0;
           return answer;
       }
   
       Node<E> current = head;
   
       while (current.getNext() != tail) {
           current = current.getNext();
       }
   
       tail = current;
       tail.setNext(null);
       size--;
   
       return answer;
   }
   
   public void reverse() {
       Node<E> previous = null;
       Node<E> current = head;
   
       tail = head;
   
       while (current != null) {
           Node<E> next = current.getNext();
   
           current.setNext(previous);
           previous = current;
           current = next;
       }
   
       head = previous;
   }

}
