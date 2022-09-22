import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {

        Scanner te= new Scanner(System.in);
        System.out.print("Enter the temperature in C :");
        float tempC = te.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
        te.close();
        
        
    }
    
}
