package Interview_Coding;

public class GratesAmoungNumbers {

    public static void main(String[] args) {
        
        int[] arr = { 4,6,3,1,10,66,99,101};
        System.out.println(gratest(arr));

    }
    static int gratest(int[] arr){
        int Gratestval = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > Gratestval )
            Gratestval = arr[i];
        }
        return Gratestval;
    }
    
}
