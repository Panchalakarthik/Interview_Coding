package List;

public class SumOfArray {

    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,4,5,6,4,9};
        System.out.println(Arrasum(arr));
        
    }
    static int Arrasum(int[] arr){

        int sum=0;
        for(int i = 0; i< arr.length;i++){

            sum = sum+arr[i];
        }
        return sum;
    }
    
}
