

import java.util.Scanner;

public class addFirstElementInLinkedList {
    // Node
    class Node<T>
    {
       T data;
       Node<Integer>next;

        public Node(T data) {
            this.data = data;
        }

    }
      class singlyLinkedList<T> {
         Node<Integer> head;

        public singlyLinkedList()
        {
            head=null;
        }
          public void add(Node<Integer> head) {
//             if (head == null) {
//                 return;
//             }
             Node<Integer> temp = head;
             while (temp != null) {
                 temp = temp.next;
             }
        }
         // addFirst
          public void addFirst()
         {
             System.out.println("add the first in the element");
             Scanner readme = new Scanner(System.in);
             addFirstElementInLinkedList obj = new addFirstElementInLinkedList();
             Node<Integer> newNode = new Node<>(readme.nextInt());

//             if(head==null)
//             {
//                 return;
//             }
             newNode.next=head;
             head=newNode;
         }
         
         // addLast...
         public void addLast() {
             System.out.println("add the Last of element");
             Scanner readme = new Scanner(System.in);
             addFirstElementInLinkedList obj = new addFirstElementInLinkedList();
             Node<Integer> newNode = new Node<>(readme.nextInt());
             if (head == null) {
                 head = newNode;
             }
             Node<Integer> temp = head;
             while (temp!= null) {
                 System.out.println();
                 temp = temp.next;
             }
             temp = newNode;

         }
         public void display()
         {
             System.out.println("Display the element");
             Node<Integer> temp=head;
             while(temp!=null)
             {
                 System.out.print(temp.data+"->");
                 temp=temp.next;
             }
             System.out.println("Null");
         }
     }


}
class test
{
    public static void main(String[] args) {
        addFirstElementInLinkedList obj=new addFirstElementInLinkedList();
        addFirstElementInLinkedList.singlyLinkedList<Integer> sin=obj.new singlyLinkedList<Integer>();
            sin.addFirst();
            sin.addLast();
            sin.addLast();
            sin.addFirst();
//            sin.addLast(sin.head);
            sin.display();

            //adding the last element of head...
    }
}
