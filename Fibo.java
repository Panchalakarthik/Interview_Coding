import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        
        System.out.print("Enter the 'n' fibo you want : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a =0;
        int b =1;
        int count = 2;  // already count 0 and 1 are counted 

        while (count <= n){

           int temp = b;
            b = b + a;
            a = temp;
            count = count + 1;
        }
       System.out.println(b);

    }
    
}



/*

    a | b |  FIBO
  --------------------------- 
                    0
                    1
    0 | 1 | 0 + 1 = 1
    1 | 1 | 1 + 1 = 2
    2 | 1 | 2 + 1 = 3
    3 | 2 | 3 + 2 = 5
    5 | 3 | 5 + 3 = 8
    8 | 5 | 8 + 5 = 13

    
  --- 0 1 1 2 3 5 8 13......

 */