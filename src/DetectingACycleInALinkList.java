import java.util.Scanner;

// detecting a cycle in a Node...
public class DetectingACycleInALinkList {
    // Node class
    static class Node
    {
        int data;
        Node next;

    }
    static class LinkList{
        Node head;
        Node tail;
        int size;
        void  addFirst(int val)
        {
            Node newNode=new Node();
            newNode.data=val;
            newNode.next=null;
            newNode.next=head;
            head=newNode;
            size++;
        }
        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
               temp= temp.next;
            }
            System.out.println("NULL");
        }
        public boolean hasCycle(Node head)
        {
            if(head==null)
            {
                return false;
            }
            Node hare=head;//fast
            Node turtle=head;//slow
            while(hare!=null&&hare.next!=null)
            {
                hare=hare.next.next;
                turtle=turtle.next;
                if(hare==turtle)
                {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            Node head=new Node();
            LinkList obj=new LinkList();
            Scanner readme=new Scanner(System.in);
            System.out.println("Enter the number of node that you want to insert");
            int n=readme.nextInt();
            for (int i = 0; i <n; i++) {
                obj.addFirst(readme.nextInt());
            }
            obj.display();
        }


    }

}
