// check weather the given list is palindrome or not
import java.util.List;
import java.util.Scanner;

public class isPalindromeLinkList {
    static class Node {
        int data;
        Node next;
    }
    static class Linklist {
        Node head;
        Node tail;
        int size;
        void addLast(int val) {
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;
            if (size == 0) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }
        public void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("NULL");
        }
        public Node reverse(Node head)
        {
            Node pre=null;
            Node curr=head;
            while (curr!=null)
            {
                Node next=curr.next;
                curr.next=pre;
                pre=curr;
                curr=next;
            }
            return pre;

        }
        public  Node findMiddle(Node head)
        {
            Node hare=head;
            Node turtle=head;
            while (hare.next!=null&&hare.next.next!=null)
            {
                hare=hare.next.next;
                turtle=turtle.next;
            }
            return turtle;

        }

        boolean palindrome(Node head)
        {
            if(head==null||head.next==null)
            {
                return true;
            }
            Node middle=findMiddle(head);
            Node secondHalfStart=reverse(middle.next);
            Node firstHalfStart=head;
            while(secondHalfStart!=null)
            {
                if(firstHalfStart.data!=secondHalfStart.data)
                {
                    return false;
                }
                firstHalfStart=firstHalfStart.next;
                secondHalfStart=secondHalfStart.next;
            }
            return true;
        }


    }

    public static void main(String[] args) {
        Node obj=new Node();
        Linklist ll=new Linklist();

        Scanner readme=new Scanner(System.in);
        for (int i = 0; i <4 ; i++) {
            ll.addLast(readme.nextInt());
        }
        ll.display();
        boolean b=ll.palindrome(ll.head);
        if(b==true)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }

    }
}
