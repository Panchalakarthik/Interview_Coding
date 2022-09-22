import java.util.Scanner;
public class Swap_Reverse {

    public static void main(String[] args) {
        System.out.print("Enter the size of String array : ");
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int[] arr = new int[st];
        for (int i= 0; i < arr.length; i++ ){
          arr[i] = sc.nextInt(); 
        }

         System.out.println(maxVal(arr, 1 , 2)); //---> max 

        //------------------------------Swap------------------------------------

        System.out.print("Enter the indexes to be swapped : ");
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();


        System.out.print( "After swap: ");
        swap(arr, arr[in1],arr[in2]);
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
   
      // ---------------------------------Reverse---------------------------------
        reverse(arr);
        System.out.print("The reversed Array is: ");
        for(int num :arr){
          System.out.print(num + " ");
        }
        sc.close();
 
      }

      static void reverse(int[] arr){
         
           int start = 0;
           int end = arr.length-1;
           while(start < end){

            swap(arr, arr[start], arr[end]);
            start ++;
            end--;

          }
      }
      // ----------------------------------Swap-------------------------------------

      static void swap(int[] arr , int index1 , int index2 ){
        int temp = arr[index1-1];
        arr[index1-1]  = arr[index2-1];
        arr[index2-1]  = temp; 

    }

    // ---------------------------Max--------------------------------
   
     static int maxVal(int[] arr , int start, int end ){

          int maxVal = arr[0];
          for (int i =start ; i< end; i++ ){
    
               if (arr[i] > maxVal){
                 maxVal = arr[i];
               }
          }
          return maxVal;

     }


}
