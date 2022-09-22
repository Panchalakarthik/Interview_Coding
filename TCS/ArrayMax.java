package TCS;

import java.util.Scanner;

public class ArrayMax {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int max =  arr[0];
        for (int i=0; i >=max; i++){

                max = arr[i];
                count ++;
       
          System.out.println(count);
        }
        sc.close();
        
    }
    
}
