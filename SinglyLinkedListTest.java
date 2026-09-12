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

   public static <E> String toString(SinglyLinkedList<E> sll) {
       StringBuilder sb = new StringBuilder();
       while (!sll.isEmpty()) {
           sb.append(sll.first()).append(" ");
           // requires your implementation's standard traversal mechanism
       }
       return sb.toString();
   }
   
   // Removes and returns the last element of the provided list
   public static <E> E removeLast(SinglyLinkedList<E> sll) {
       if (sll.isEmpty()) {
           return null;
       }
       return sll.removeLast();
   }
   
   // Reverses the provided SinglyLinkedList instance
   public static <E> void reverse(SinglyLinkedList<E> sll) {
       sll.reverse();
   }
}
