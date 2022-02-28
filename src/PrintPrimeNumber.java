// write a program to print the all the prime number of the given existing Linkedlist
import org.w3c.dom.css.CSSUnknownRule;
import java.util.Scanner;

public class PrintPrimeNumber {
    // node
    class Node
    {
        int data;
        Node next;
    }
    class LikedListTest
    {
        Node head;
        Node tail;
        int size;
        void display(int val)
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
        void removeFirst()
        {
//            if(head==null)
//            {
//                return;
//            }
//            head=head.next;
//            size--;
            head=null;
            size=0;
        }

        void printing()
        {
            Node temp=head;

            while(temp!=null)
            {
                int c=0;
                for (int i =1; i <=temp.data ; i++) {
                    if(temp.data%i==0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                    System.out.print(temp.data+"->");
                }
                temp=temp.next;
            }
            System.out.println("NULL");
        }
        public int length()
        {
            return size;
        }
    }
}
class testPrime
{
    public static void main(String[] args) {
        PrintPrimeNumber obj=new PrintPrimeNumber();
        PrintPrimeNumber.Node check=obj.new Node();
        PrintPrimeNumber.LikedListTest prime=obj.new LikedListTest();
        Scanner readme=new Scanner(System.in);
//        System.out.println("input the size of the Linked List->");
//          int n = readme.nextInt();
//          for (int j= 0; j< n; j++) {
//               prime.display(readme.nextInt());
//          }
//        prime.printing();


        System.out.println("Enter the number of test cases");
        int t=readme.nextInt();
        for (int i = 0; i <t; i++) {
            while(true)
            {
                int p=readme.nextInt();
                if(p==-1)
                {
                    prime.display(p);
                    break;
                }
                else
                {
                    prime.display(p);
                }
            }
            prime.printing();
            System.out.println("length of->"+(i+1)+"linledList is->> :- "+prime.length());
            prime.removeFirst();

        }
  }
}
