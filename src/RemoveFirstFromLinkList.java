import java.util.Scanner;
public class RemoveFirstFromLinkList {
    public static  class Node {
        int data;
        Node next;
    }
    public static class LinkList1 {
        Node head;
        Node tail;
        int size;
        void addLast(int val) {
            if (size == 0) {
                Node newnode = new Node();
                newnode.data = val;
                newnode.next = null;
                head = tail = newnode;
                size++;
            } else {
                Node newnode = new Node();
                newnode.data = val;
                newnode.next = null;
                tail.next = newnode;
                tail = newnode;
                size++;

            }
        }
        // add first
        public void addFirst(int val)
        {
            if(head==null)
            {
                return;
            }
            Node newNode=new Node();
            newNode.data=val;
            newNode.next=null;
            newNode.next=head;
            head=newNode;

            size++;
        }

        // remove the first element..
        public void removeFirst()
        {
            Node temp=head.next;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("NULl");
            size--;
        }
        // remove last

        public void removeLast()
        {
            if(head.next==null)
            {
                return;
            }
            Node temp=head;
            while(temp.next!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("NULL");
            size--;
        }
        // size
        public int  getSize()
        {
            return size;
        }
    }
    public void display(LinkList1 list) {
            Scanner readme = new Scanner(System.in);
            for (int i = 0; i <5 ; i++) {
                System.out.println("add the last element");
                list.addLast(readme.nextInt());
            }
            //list.removeFirst();
        //list.removeLast();
        System.out.println("add the first element");
            list.addFirst(readme.nextInt());
        //list.removeFirst();
        //System.out.println(list.getSize());
            Node temp = list.head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
        public static void main(String[] args) {
            RemoveFirstFromLinkList obj = new RemoveFirstFromLinkList();
            LinkList1 obj1 = new LinkList1();
            obj.display(obj1);
        }
    }

