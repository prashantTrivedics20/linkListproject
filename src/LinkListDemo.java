public class LinkListDemo {
    Node head;

//    public LinkListDemo() {
//        this.size = 0;
//    }

    int size;

    //Node Class
    class Node{
        String data;
        Node next;
        public Node(String data) {
            this.data = data;
            this.next=null;
            size++;
        }
    }
    //add-first,last
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add last
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    // delete first
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    // delete last
    public void deleteLast()
    {
        if(head==null)
    {
        System.out.println("list is empty");
        return;
    }
        if(head.next==null)
        {
            head=null;
            return;
        }
        size--;
        Node secondLast=head;
        Node lastNode=head.next;//   if(lastNode.next=null)
        while(lastNode.next!=null)//(null!=null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }
    // size
    public int getSize()
    {
        return size;
    }
    public void reverseIterative()
    {
        if(head==null||head.next==null)
        {
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    //  print
    public void printList(){
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
//        LinkListDemo list=new LinkListDemo();
//        list.addFirst("a");
//        list.addFirst("is");
//        list.addLast("list");
//        list.addFirst("this");
//        list.deleteFirst();
//        list.deleteLast();
//        //System.out.println(list.getSize());
//        list.addFirst("this");
//        System.out.println(list.getSize());
//        list.printList();
        LinkListDemo list=new LinkListDemo();// reverse approach
        list.addLast("a");
        list.addLast("is");
        list.addLast("list");
        list.addLast("this");
       // list.addLast("this");
        list.printList();
        list.reverseIterative();
        list.printList();



    }
}
