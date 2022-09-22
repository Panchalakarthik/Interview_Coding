package List;

public class MaxArray {

    public static void main(String[] args) {

        int[] arr = {5,3,8,19,1,7};
        System.out.println(Max(arr));
        
    }

    static int Max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }   
}

