package List;

public class DuobleLinkedList {

    private Node head;
//---------------------------------------------------
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
//---------------------------------------------------
    public void insertLast(int value) {
        Node node = new Node(value);
        Node tail = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = node;
        node.prev = tail;
    }
//---------------------------------------------------

    public void display() {

        Node temp = head;
        Node tail = null; //last point for the reverse
        System.out.print("Start -> ");
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            tail = temp;
            temp = temp.next;

        }
        System.out.println("End");

        System.out.println();
        System.out.println("This is reverse Order \n");
        System.out.print("End <- ");
        while (tail != null) {
            System.out.print(tail.value + " <- ");
            tail = tail.prev;
        }
        System.out.println("Start");
    }
//---------------------------------------------------

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        DuobleLinkedList ll = new DuobleLinkedList();
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(6);
        ll.insertFirst(10);
        ll.insertLast(100);

        ll.display();
    }
}
