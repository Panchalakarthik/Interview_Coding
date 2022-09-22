package List;

public class MinArray{

      public static void main(String[] args) {

        int[] arr = {5,3,8,19,1,7};
        System.out.println(min(arr));
        

      }
      public static int min(int[] arr){

             int small = arr[0];
             for(int i = 0; i< arr.length;i++){
                if(arr[i] < small){
                    small = arr[i];
                }
             }
            return small;
      }
}