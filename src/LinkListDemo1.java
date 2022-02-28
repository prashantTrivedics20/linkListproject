import java.util.*;
public class LinkListDemo1 {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.add("list");//  add() is used to add the element in LinkedList at the end position..
        System.out.println(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        //list.removeFirst();
        //System.out.println(list);
       // list.removeLast();
        list.remove(3);



        System.out.println(list);
    }
}
