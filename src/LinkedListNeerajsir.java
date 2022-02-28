public class LinkedListNeerajsir {
    public static class Node<T>
    {
        T data;
        Node<T> next;
        Node(T data)
        {
            this.data=data;
        }
    }
    class LinkedListuse {
        public static void print(Node<Integer> head) {
            Node<Integer> temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp=temp.next;
            }
            System.out.println("Null");
        }
        // main method
        public static void main(String[] args) {
            LinkedListNeerajsir obj=new LinkedListNeerajsir();
            Node<Integer> node1 = new LinkedListNeerajsir.Node<Integer>(10);
            Node<Integer> node2 = new Node<Integer>(20);
            node2.next=node1;
            print(node2);
        }
    }
}
