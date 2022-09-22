package BinarySearch;
//  OrderAgnosticBinarySearch means we dont know wether the array is ascending or descending or not 

public class OrderAgnosticBS {
    public static void main(String[] args) {

      //  int[] arr = {1,2,3,4,5,15,79,88,99,110,120};
            int[] arr ={120,110,100,55,44,33,12,1,0};
            for (int nums: arr){
                System.out.print( nums + " "); 
            }
            System.out.println(" ");
            int target = 99;
            System.out.println("My Target element is :" + target);
            int ans = OrderAgnosticBinarySearch(arr, target);
            System.out.println(ans + " ");
        
    }
    static int  OrderAgnosticBinarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

       // check the array is ascending order or descending order or not.
        boolean isAsn = arr[start] < arr[end];

        while (start <= end){

             int mid = start + (end - start) / 2;

             if(arr[mid]==target){     // this condission is same for both ascending and desecending order 
                return mid;
             }

             if(isAsn){

                if( target < arr[mid]){    // ascending order

                    end = mid - 1; 
                 } else {
                   start = mid + 1;
                 }

             }else{
                if ( target > arr[mid]){  //decending order 

                    end = mid - 1; 
                 } else {
    
                   start = mid + 1;
                 }
             }
        }
        return -1;  
    }
   
    
}



/*

the array is  [ 1 2 3 4 5 6 7 66 77 88 ]
target is 77
start = 0 index 1
end = arr.length-1 // last index 
mid = start + ( end - start ) / 2;

some mid = 6 
start         mid          end
  1   2 3 4 5  6  7 66 77  88

  if target element grater  > then the arr[mid] start = mid + 1;
  other wise less than  < the end = mid - 1;

 */