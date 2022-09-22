package List;

public class Stack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item) {

        if (isFull()) {
            System.out.println(" Stack is full ");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("You can't pop te element");
        }
        return data[ptr--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("You can't peek from empty element");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // pointer at last index ;
    }

    public boolean isEmpty() {
        return ptr == -1; // empty stack ;
    }

    public static void main(String[] args) {

        Stack sc = new Stack(5);
        sc.push(5);
        sc.push(1);
        sc.push(7);
        sc.push(3);
        sc.push(10);

        System.out.print(sc.pop() + ",");
        System.out.print(sc.pop() + ",");
        System.out.print(sc.pop() + ",");
        System.out.print(sc.pop() + ",");
        System.out.print(sc.pop() + ",");

    }

}
