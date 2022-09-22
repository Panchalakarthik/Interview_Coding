import java.util.Scanner;
public class Largest {

    public static void main(String[] args) {
        System.out.print("Enter 3 numbers :");
        Scanner lg = new Scanner(System.in);
        int a = lg.nextInt();
        int b = lg.nextInt();
        int c = lg.nextInt();
        lg.close();

       
    /*   
        int max =a;

        if (b > max){

            max = b;
        } 
        if(c > max){

            max = c;

        }
       System.out.println(max);

    */    
     
     int max = Math.max(c, Math.max( a, b ));
     System.out.println(max);

     //System.out.println(Math.max(98,99));

    }
    
}
