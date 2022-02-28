import java.util.Scanner;
public class testingLinkedList {
    //node->
    class Node<T>
    {
        T data;
        Node<T> next;
        public Node(T data) {
            this.data = data;
        }
    }
     class Link<T>
    {
        Node<T>head;
        int size;
        // add first
        public void addFirst(Node<T>newNode)
        {
            Node<T>temp=head;
            if(head==null)
            {
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        // add last
        public void addLast(Node<T>newNode)
        {
            if(head==null)
            {
               head=newNode;
               return;
            }
            Node<T>temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        // removeLast
        public void removeLast()
        {
            if(head.next==null)
            {
                return;
            }
            Node<T>temp=head;
            while(temp.next!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("NULL");
        }
        // removeFirst
        public void removeFirst()
        {
            if(head==null)
            {
                return;
            }
            head=head.next;
        }
        public void display()
        {
            Node<T> temp=head;
            while(temp!=null)
            {
                size++;
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("Null");
        }
        //size
        public int getSize()
        {
            return size;
        }
    }
}
class Demo
{
    public static void main(String[] args) {
        testingLinkedList obj=new testingLinkedList();
        Scanner readme=new Scanner(System.in);
        //testingLinkedList.Node<Integer>node=obj.new Node<Integer>(readme.nextInt());
//        testingLinkedList.Node<Integer>node1=obj.new Node<Integer>(readme.nextInt());
//        node.next=node1;
       testingLinkedList.Link<Integer>obj1=obj.new Link<>();
        testingLinkedList.Node<Integer>node2=obj.new Node<Integer>(readme.nextInt());
        //obj1.add(node);
        obj1.addLast(node2);
        testingLinkedList.Node<Integer>node3=obj.new Node<Integer>(readme.nextInt());
        obj1.addLast(node3);
        testingLinkedList.Node<Integer>node4=obj.new Node<Integer>(readme.nextInt());
        obj1.addFirst(node4);
        testingLinkedList.Node<Integer>node5=obj.new Node<Integer>(readme.nextInt());
        obj1.addFirst(node5);
        obj1.removeLast();
        obj1.removeFirst();
        obj1.display();
        System.out.println("size of the linked list->"+ obj1.getSize());

    }
}
