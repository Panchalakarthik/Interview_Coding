package BinarySearch;
public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7,9};
    //    int[] arr ={120,110,100,55,44,33,12,1,0};

        for ( int pedda : arr){
            System.out.print(pedda + " ");
        }

      
        System.out.println(" ");
     
        int target = 5;
        System.out.println("My Target element is :" + target);
    
        int ans = binarysearch(arr, target);
        System.out.println(ans);
       
       }

    static int binarysearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end){

             int mid = start + (end - start) / 2;

            //  int mid =  start + end / 2;

             if ( target < arr[mid]){

                end = mid - 1; 
               

             } else if (target > arr[mid]){

               start = mid + 1;
           
             } else {

                return mid;

             }
        }
        return end;  
    }
    
}
