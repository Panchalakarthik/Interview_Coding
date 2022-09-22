package List;

class LinkedList {

    private Node head;   // instace variable 
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    //--------------insertFirst--------------------

    public void insertFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {

            tail = head;
        }
        size += 1;
    }

    //------------- insertLast-------------------

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

     //---------------insertaAnyware-------------------

    public void insertaAnyware(int value, int index) {

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
    // -------------deleteFirst-------------------

    public int deleteFirst() {
        int value = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return value;

    }
    // -------------deleteLast()-------------------

    public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }
    
    // -------------deleteAnyWare-------------------

    public int deleteAnyWare(int index) {

        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;

    }

    // --------------get(index)-------------------

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // ---------------Find----------------------

    public Node find(int value) {

        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // -------------display()------------------
    public void display() {

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");

    }

     // -------------Create Node Structure ------------------

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
        ll.insertFirst(10);
        ll.insertLast(38);
        ll.insertaAnyware(100, 4);

        ll.display();
        System.out.println(ll.deleteFirst());
        ll.display();
        System.out.println((ll.deleteLast()));
        ll.display();
        System.out.println((ll.deleteAnyWare(1)));
        ll.display();
        System.out.println(ll.find(1));

        System.out.println("karthik");
    }
}
