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

    public String toString(SinglyLinkedList<Integer> sll){
        String s = "";

        Integer cur = sll.first();
        
        if (cur == null){
            return null;
        }

        while (cur != null){
            s = s + Integer.toString(cur.getElement());
            cur = cur.getNext();
        }

        return s;

   }

    public static void removeLast(SinglyLinkedList<Integer> sll){

        if (sll.isEmpty()){
            return;
        }

        if (head.getElement() == tail.getElement()){
            head = null;
            tail = null;
            return;
        }

        tail = null;
        return;

   }

    public void reverse(SinglyLinkedList<Integer> sll){ \

        if (sll.isEmpty()){
          return;  
        }

        E prev = head;
        E cur = head.getNext();

        while (cur != null){
            cur.setNext(prev);
            prev = prev.getNext();
            cur = cur.getNext();
        }

        return;
    }

}
