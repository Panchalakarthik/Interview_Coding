
public class NewArray {

    public static void main(String[] args) {
         
        int[] arr = {1,2,3,4,5};
        for(int num :arr){
            System.out.print(num + " ");
         
        }
        change(arr);
        for(int num :arr){
            System.out.print(num + " ");
        }

    }
    static void change(int[] arr){
        arr [1] =99;
    }
        
}
    

