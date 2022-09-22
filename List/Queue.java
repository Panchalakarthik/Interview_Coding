package List;

public class Queue {

    private int[] data;
    private static final int DEFAULT_SIZE = 0;
    int end = 0;

    public Queue() {
        this(DEFAULT_SIZE);
    }

    public Queue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {

        if (isFull()) {
            System.out.println(" QUEUE is full ");
            return false;
        }
        data[end++] = item;
        return true;

    }

    public int remove(){
        if(isEmpty()){
            System.out.println(" QUEUE is empty ");
            
        }
        int remove = data[0];
        for(int i = 1; i < end;i++){
            data[i-1] = data[i];
        }
        end--;
        return remove;
    }

    public int front(){
        if(isEmpty()){
            System.out.println(" QUEUE is empty ");    
        }
        return data[0];

    }

    public void display(){

        for(int i =0;i < end;i++){
            System.out.print(data[i]+ " <- ");
        }
        System.out.println("End");
    }

    public boolean isFull() {
        return end == data.length ; // pointer at last index ;
    }

    public boolean isEmpty() {
        return end == 0; // empty Queue ;
    }

    public static void main(String[] args) {
        
        Queue que = new Queue(10);
        que.insert(10);
        que.insert(2);
        que.insert(30);
        que.insert(12);
        que.insert(19);

        que.remove();

        que.display();

    }

}
