package Interview_Coding;

public class SumOfDigitOfNumber {

    public static void main(String[] args) {
         
         int num =  876 ;
         int sum = 0;
         for(int i = 0;i<num-1;i++){

             int reminder = num % 10;
             sum = sum + reminder;
             num = num / 10;
         }
         System.out.println(sum);
    }
    
}
