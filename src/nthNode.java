import java.util.Scanner;

public class nthNode {
    // Node
    static class Node
    {
        int data;
        Node next;

    }
    static class Linklist
    {
        Node head;
        Node tail;
        int size;
        void addLast(int val)
        {
            Node newNode=new Node();
            newNode.data=val;
            newNode.next=null;
            if(size==0)
            {

                head=tail=newNode;
            }
            else
            {
                tail.next=newNode;
                tail=newNode;

            }
            size++;
        }
    }
    public void display(Linklist  list,int n)
    {
        Scanner readme=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            list.addLast(readme.nextInt());
        }
        Node temp=list.head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
        // by using this technique we can find the size of our LinkedList
//        Node curr=list.head;
//        while(curr!=null)
//        {
//            list.size++;
//            curr=curr.next;
//        }

        System.out.println(list.size);

        Node temp1=list.head;
        int i=1;
        while(i<list.size-n+1)
        {
            temp1=temp1.next;
            i++;
        }
        System.out.println("N th element from the last of the LinkedList");
        System.out.println(temp1.data);


    }

    public static void main(String[] args) {
        nthNode obj=new nthNode();
        Linklist ll=new Linklist();
        System.out.println();
        obj.display(ll,5);
    }


}
