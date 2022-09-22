package TCS_lanchpad;

import java.util.Scanner;
public class ReverseSring {
    public static void main(String[] args) {
        
        System.out.println("Enter a number you want to reverse : ");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        char tempArray[] = str.toCharArray();
        String rev = " ";
        for(int i =0;i<tempArray.length;i++){

           char ch= str.charAt(i);
           rev = ch+rev;
            
        }
        System.out.println(rev + " ");
        sc.close();
    
    }
    
    
}
