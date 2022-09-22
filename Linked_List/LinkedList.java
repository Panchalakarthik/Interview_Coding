// 0(n)

class LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public LinkedList() {
        this.size = 0;
    }

    // ---------insert at first-----------------

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // ----------indert at last----------------

    public void insertLast(int value) {

        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;

    }

    // --------------------------------------

    // ----------inset any Ware--------------

    public void insertAnyware(int value, int index) {

        if (index == 0) {

            insertFirst(value);
            return;

        }
        if (index == size) {

            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {

            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size += 1;

    }
    // ---------------------------------------

    // ...........display----------------------

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    // -----------------------------------------------

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {

            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) { 

        LinkedList ll = new LinkedList();
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(6);
        ll.insertFirst(8);
        ll.insertFirst(9);
        ll.insertFirst(32);
        ll.insertLast(40);
        ll.insertAnyware(100, 2);

        ll.display();

    }
}

