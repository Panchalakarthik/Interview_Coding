import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        
        System.out.println("Enter a number you want to reverse : ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        sc.close();
        int ans = 0;

        while (num > 0){

            int reminder = num % 10;     // it gives the last digit of given number
            ans = ans * 10 + reminder;   // addes the last degit to the ans variable 
            num /= 10;                   // remove that number 
           
        }
      System.out.println(ans);
    
    }
}  



/*
   ex : 24356 reverse this number

        | eminder = num % 10 | gives the last digit we know 

        rem = 24356 % 10 = 6 reminder is 6 
        ans is new variable  initialy ans = 0 
        now ans = 6
        next again remove that number | num /= 10; |

        now ans = 65 how 65 - - - 6 * 10 + 5 = 65 so | ans = ans * 10 + reminder; |

 */