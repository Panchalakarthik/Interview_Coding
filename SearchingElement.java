import java.util.Scanner;

public class SearchingElement {

    public static void main(String[] args) {
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i<arr.length; i++){

              arr[i] = sc.nextInt(); 
        }
    //     System.out.print("Enter the element to be search: ");
    //     int searched = sc.nextInt();
    //     System.out.println(search(arr,searched, 1,2));
    // sc.close();


    System.out.println(minVal(arr)); //---> min 

    sc.close();
    }
    // static int search (int[] arr, int searched,int start, int end) {

    //     // for(int element : arr){
    //     //     if(element == searched){
    //     //         return element-1;
    //     //     }
    //     // }
    //     for (int index = start; index <= end; index++){

    //         if (arr[index] == searched){   
    //           return index;
    //         }
    //     }
    //    return -1;
    // }
    static int minVal(int[] arr ){

        int minVal = arr[0];
        for (int i =0 ; i< arr.length; i++ ){
  
             if (arr[i] < minVal){
               minVal = arr[i];
             }
        }
        return minVal;

   }
    
}
