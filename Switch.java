import java.util.Scanner;

public class Switch {

      public static void main(String[] args) {
          
         System.out.print("Enter a fruit name: ");
         Scanner sc = new Scanner(System.in);
        // String fruit = sc.next();

        //  switch(fruit){

        //     case "apple":
        //         System.out.println("King of fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("the fruit is good");
        //         break;
        //     case "grapes":
        //         System.out.println("very small one");
        //     default:
        //         System.out.println("enter right One");   
               
        //  }
         
        
        String day = sc.next();

         
         switch (day){

            case "1" -> System.out.println("monday");
            case "2" -> System.out.println("tuesday");





            // case "2":
            //     System.out.println("Tuesday");
            //     break;
            // case "3":
            //     System.out.println("Wednesday");
            //     break;
            // default:
            //     System.out.println("wrong");
         }

        sc.close();
      }
    
}
