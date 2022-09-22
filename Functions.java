import java.util.Arrays;

//import java.util.Scanner;

/* 


public class Functions{

     public static void main(String[] args) {
         sum();

     }

     static void sum(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println("the sum is : " + res);
        sc.close();
    
    }
}

*/

/* 


public class Functions{


    public static void main(String[] args) {
        
        int ans = sum();
        System.out.println(ans);
    }

    static int sum(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        sc.close();
        return sum;
       


    }
}


*/


/* 

public class Functions{

    public static void main(String[] args) {
        
        String tex = Greeting();
        System.out.println(tex);

    }

    static String Greeting(){

        Scanner sc = new Scanner (System.in);
        String Greeting = sc.nextLine();
        sc.close();
        return Greeting;


    }

    
}

*/

/* 

public class Functions{

    public static void main(String[] args) {
        
          Scanner sc = new Scanner (System.in);
          System.out.print("Enter you name: " );
          String name = sc.next();
          String message = greet(name);
          System.out.println(message);
          sc.close();
    }

    static String greet(String name){

        String greeting = "Hello " + name;
        return greeting;
    }

}

*/

/* 

public class Functions{

    public static void main(String[] args) {
         
        String name = "Karthik";
        String ch = chageName(name) ;
        System.out.println(ch);

    }
     static String chageName(String naam) {

              naam = "ravi";
              return naam;

    }
   
}

*/


/* 

public class Functions{

    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        swap(a,b);
        System.out.println( a  + " " + b);
        
    }

    static void swap(int a, int b){

        int temp =a;
        a = b;
        b = temp;
        


    }
}

*/


/* 

public class Functions{
   
     public static void main(String[] args) {
         
         String name = " karthik ";
         changeName(name);
         System.out.println(name);


     }

     static void changeName(String naam){

        naam =" Raghava ";
     }

}

*/

public class Functions{
      public static void main(String[] args) {
        int[] arr ={10,20,50,30};
        changeNum(arr); //call by value 
        System.out.println(Arrays.toString(arr));
      }
    static void changeNum(int[] values){

        values[0] = 20;
    }

    
}