public class MaxWelth {

    public static void main(String[] args) {

        int[][] arr = {

                 {1,2,4},
                 {8,4},
                 {1,4,6,7}
        };
        System.out.println(maximunWealth(arr));
        
    }

    static int maximunWealth(int[][] arr){

        int ans = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length;row++){
            int rowsum= 0;
            for(int col= 0; col< arr[row].length;col++){
               
                rowsum += arr[row][col];
                

            }
            // System.out.println(rowsum);
            if (rowsum > ans){
                ans = rowsum;
            }
        }
      return ans;
    }
    
}


