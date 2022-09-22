package List;
//sum of digits each with power of the number of the digits in the number
public class ArmstrongNumber {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 10000;
        System.out.println(ams(num1, num2));
        
    }
    static boolean ams(int num1, int num2){
        for(int i = num1; i< num2; i++){
            int sum=0;
            int num = i;
            while(num > 0){
               int reminder = num % 10;
                sum =sum + reminder *  reminder * reminder ;
                num = num / 10;
            }
            if(sum == i){
                System.out.println(sum);
            }    
        }
        return true;
    }
}
