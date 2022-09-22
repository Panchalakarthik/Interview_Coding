package Linked_List;

public class MainLinked {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(6);
        ll.insertFirst(8);
        ll.insertFirst(9);
        ll.insertFirst(32);
        ll.insertLast(45);
        ll.insertAnyware(100, 2);

        ll.display();

    }

}
