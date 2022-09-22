package TCS;
import java.util.Scanner;
public class DistanceTravel {

    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          System.out.println("the N value is :" + n);

          int x = 0; int y = 0; int distance = 10;
          char c = 'R';
          while(n > 0){

            switch (c){

                case 'R': x = x + distance; distance = distance + 10; c = 'u'; break;
                
                case 'u': y = y + distance; distance = distance + 10; c = 'L'; break;
                
                case 'L': x = x - distance; distance = distance + 10; c = 'd'; break;
                
                case 'd': y = y - distance; distance = distance + 10; c = 'a'; break;

                case 'a': x = x + distance; distance = distance + 10; c = 'R'; break;
            }
            n--;
           
          }
          sc.close();

          System.out.println(x + " " + y);    
    }
  
}

