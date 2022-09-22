package TCS;

import java.util.Scanner;

public class Vechiles {

    public static void main(String[] args) {
        
          
          Scanner sc = new Scanner(System.in);

          int v = sc.nextInt();
          int w = sc.nextInt();

          int x = (( v * 4) - w)/2;
          if(2 <=w && (w%2==0) && v<w){

            System.out.println( " TW = " + x + " FW = "+ (v - x));
          }
          else{
            System.out.println("INVALID INPUT");
          }
        sc.close();     

    }
    
}
