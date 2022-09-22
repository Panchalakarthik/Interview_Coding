package TCS;

import java.util.Scanner;
public class MatrixDiagnalAdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new  int[3][3];

        int d1 =0; int d2 = 0;

        for (int row = 0; row<arr.length; row++){
            
            for(int col = 0; col<arr[row].length;col++){

                arr[row][col] = sc.nextInt();

                if (row == col)
                   d1 += arr[row][col];

                if (row == n - col - 1)
                    d2 += arr[row][col];
            }
        }
    System.out.println(Math.abs( d1-d2));
    sc.close(); 
    
      
    }
}