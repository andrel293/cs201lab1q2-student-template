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

  @Override
    public String toString() {
        if (head == null) {
            return ""; 
        }

        String str = "[";
        Node<E> cur = head;
        while (cur != null) {
            str += cur.getElement();
            if (cur.getNext() != null) {
                str += ", ";
            }
            cur = cur.getNext();
        }
        str += "]";
        return str;
    }

    public E removeLast() {
        if (head == null) {
            return null; 
        }

        E removedElement;

        if (head == tail) {
            removedElement = head.getElement();
            head = null;
            tail = null;
        } else {
            Node<E> cur = head;
            while (cur.getNext() != tail) {
                cur = cur.getNext();
            }
            removedElement = tail.getElement();
            cur.setNext(null); 
            tail = cur;
        }

        size--;
        return removedElement;
    }

    public void reverse() {
        if (head == null) {
            return; 
        }

        Node<E> prev = null;
        Node<E> cur = head;
        tail = head; // old head becomes new tail

        while (cur != null) {
            Node<E> next = cur.getNext(); 
            cur.setNext(prev);           
            prev = cur;                   
            cur = next;                   
        }

        head = prev; 
    }

}
