import java.util.Scanner;
// write a program to check weather the given LinkedList is palindrome or not.....
public class PalindromeLeetCode {
    // Node class
    static class Node
    {
        int data;
        Node next;
    }
    // LinkList
    static class LinkList
    {
       Node head;
       Node tail;
       int size;
       void addLast(int val)
       {
           if(size==0)
           {
               Node newNode=new Node();
               newNode.data=val;
               newNode.next=null;
               head=tail=newNode;
               size++;
           }
           else
           {
               Node newNode=new Node();
               newNode.data=val;
               newNode.next=null;
               tail.next=newNode;
               tail=newNode;
               size++;
           }
       }
       // this is the reverse (half of the LinkList)
       public Node reverse(Node head) {
           Node pre = null;
           Node curr = head;
           while (curr != null) {
               Node next = curr.next;
               curr.next = pre;
               //update
               pre = curr;
               curr = next;
           }
           return pre;
       }
       // this is the process to find the middle of the LinkList....
       public Node findMiddle(Node head)
       {
           Node hare=head;
           Node turtle=head;
           while(hare.next!=null&&hare.next.next!=null)
           {
               hare=hare.next.next;
               turtle=turtle.next;

           }
           return turtle;
       }
       public  boolean isPalindrome(Node head)
       {
           if(head==null||head.next==null)
           {
               return true;
           }
           Node middle=findMiddle(head);
           Node secondHalfStart=reverse(middle.next);
           Node firststart=head;
           while(secondHalfStart!=null)
           {
               if(firststart.data!=secondHalfStart.data)
               {
                   return false;
               }
               firststart=firststart.next;
               secondHalfStart=secondHalfStart.next;
           }
           return true;
       }

        public static void main(String[] args) {
           Scanner readme=new Scanner(System.in);
            LinkList obj=new LinkList();
            System.out.println("Enter the number of node inside the LinkedList");
            int n=readme.nextInt();
            System.out.println("Input the LinkedList");
            for (int i = 0; i <n ; i++) {
                obj.addLast(readme.nextInt());
            }
           Node head=new Node();
           boolean b= obj.isPalindrome(obj.head);
           if(b==true)
           {
               System.out.println("Given Linked List is palaindrome");
           }
           else
           {
               System.out.println("Given Linked List is not Palindrome");
           }

        }
    }
}
