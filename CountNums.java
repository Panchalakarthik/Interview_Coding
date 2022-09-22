import java.util.Scanner;

public class CountNums {
    
     public static void main(String[] args) {
         
        System.out.print("Enter a randowm numbers that include similar numbers : ");
        Scanner sc =new Scanner (System.in);
        int ramdom =sc.nextInt();
        System.out.print("Enter a NUMBER COUNT u want: ");
        int num_count = sc.nextInt();
        sc.close();
        int count =0;
        
        while (ramdom > 0){

            int reminder = ramdom % 10;   // last digit of random number ex : 433239 ans = 9 

            if( reminder == num_count){   // the reminder is == the number count 

                count++;                 // initial the count = 0 if reminder == num_count true then count++ ;
            }
            ramdom = ramdom / 10;       // if you want to remove the  lAST DIGIT then ex: 233249 /10 = 23324
         }
       System.out.println(count);
     }

}


/*
  
    ex: 2334339  i want to check the number occurence of 3 in this number 

    we need to check each number with 3  if match then remove that number and (count ++   when the number == 3 )
    
    reminder = number % 10 gives the last digit
    we neet to check that last number is == 3 if yes count ++ { else 
                                                                  remove that number from the list so number = number / 10;   
                                                           
                                                                 }

 */