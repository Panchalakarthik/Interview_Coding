
class Linked {

    private Node head;
    private Node tail;
    private int size;

    public Linked() {
        this.size = 0;
    }

    public void insertFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {

            tail = head;
        }
        size += 1;
    }

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

    public void display() {

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");

    }

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

        ll.display();
    }
}
