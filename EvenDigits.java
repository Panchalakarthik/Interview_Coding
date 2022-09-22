public class EvenDigits {

    public static void main(String[] args) {
        
    //    int[] nums = {12,345,1323,9872};

       //    System.out.println(findnumber(nums));
      //    System.out.println(digit(987654));

    }
    static int findnumber(int[] nums){
         int count = 0;
         for (int num : nums){
              if(even(num)){         // even numbers count
                count ++;
              }
         }
         return count;    
    }

    static boolean even(int num){

        int numberOfdigits = digit(num);
        // if ( numberOfdigits % 2 == 0){
          
            return numberOfdigits % 2 ==0;  // check the nymber even or odd
     //     }
    //     return false;
    }

    static int digit(int num){

        if (num < 0){

            num = num * -1;     // even negative number also allowed to count 
        }
        if ( num == 0 ){
            return 1;           // if there is a case of zero " zero is one of the digit"
        }


        int count = 0 ;
        while(num > 0){

            count++;
            num = num / 10;   // digit count
        }
        return count;

    /*------ alternate way to find the digits ---------


     static int digit(int num){

        if (num < 0){

            num= num* -1;
        }
        return (int)(Math.log10(num)) + 1;
     }

    ---------------------------------------------------*/

    }

    
}
