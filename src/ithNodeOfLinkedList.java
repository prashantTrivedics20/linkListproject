import java.util.Scanner;
//-> write a program to print the ith node of the LinkedList......
public class ithNodeOfLinkedList{
    // Node
    class Node
    {
        int data;
        Node next;
    }
    class LinkedList
    {
        Node head;
        Node tail;
        int size;
        void input(int val)
        {
            if(size==0)
            {
                Node newNode=new Node();
                newNode.data=val;
                if(newNode.data==-1)
                {
                    return;
                }
                newNode.next=null;
                head=tail=newNode;
                size++;
            }
            else
            {
                Node newNode=new Node();
                newNode.data=val;
                if(newNode.data==-1)
                {
                    return;
                }
                newNode.next=null;
                tail.next=newNode;
                tail=newNode;
                size++;
            }
        }
        public int size()
        {
            return size;
        }
        void printing(int pos)
        {
            if(pos>size)
            {
                return;
            }
            else
            {
                int i=1;
                Node temp=head;
                while(i<pos)
                {
                    temp=temp.next;
                    i++;
                }
                System.out.println(temp.data);
            }

        }
        void delete()
        {
            head=null;
            size=0;
        }
    }
}
class testithNode
{
    public static void main(String[] args) {
        ithNodeOfLinkedList obj=new ithNodeOfLinkedList();
        ithNodeOfLinkedList.Node node=obj.new Node();
        ithNodeOfLinkedList.LinkedList ith=obj.new LinkedList();
        System.out.println("Enter the number of test cases");
        Scanner readme=new Scanner(System.in);
        int t=readme.nextInt();
        for (int i = 0; i <t; i++) {
            while (true) {
                int p = readme.nextInt();
                if (p == -1) {
                    ith.input(p);
                    break;
                } else {
                    ith.input(p);
                }
            }
            int pos=readme.nextInt();
            ith.size();
            ith.printing(pos);
            ith.delete();


        }

    }
}
