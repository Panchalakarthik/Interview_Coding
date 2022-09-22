
public class DigitCount {


      public static void main(String[] args) {
         
        System.out.println(digit(123456));
         
      }

      static int digit(int num){

        if(num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        return(int)(Math.log10(num))+ 1;
      }
}
