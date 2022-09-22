package List;
import java.util.Arrays;   


public class KthLargest {

    public static void main(String[] args) {

        int[] nums= {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
       
   } 
    static int findKthLargest(int[] nums, int k) {
        int n =nums.length ;
        Arrays.sort(nums);  //O(n log(n))
        return nums[n-k] ;
      }
    
}
