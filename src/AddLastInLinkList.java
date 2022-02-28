import java.util.Scanner;
// add last in LinkList
class AddLastInLinkLast {
    public static class Node {
        int data;
        Node next;
    }
    public static class LinkList {
        Node head;
        Node tail;
        int size;
        void addLast(int val) {
            if (size == 0) {
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                head = tail = temp;
                size++;
            } else {
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                tail.next = temp;
                tail = temp;
                size++;
            }
        }
    }
    public static void testList(LinkList list) {
        Scanner readme = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            list.addLast(readme.nextInt());
        }
        System.out.println(list.size);
        Node temp=list.head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        AddLastInLinkLast obj1=new AddLastInLinkLast();
        LinkList obj=new LinkList();
        testList(obj);
    }

}
