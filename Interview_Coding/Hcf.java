package Interview_Coding;

public class Hcf {

    public static void main(String[] args) {
        int a = 12;
        int b =8;
        int hcf = 0;
         
        for(int i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
               hcf = i;
        }
        System.out.println("HCF of given two numbers is : " + hcf);
  
  }
} 
/*
GCD & HCF both are same 
 
12 → 1, 2, 3, 4, 6, 12
16 → 1, 2, 4, 8, 16

The common factors are 1, 2, 4 and the highest common factor is 4.

 */