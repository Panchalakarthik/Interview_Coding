package Patterns;
public class P5 {
    public static void main(String[] args) {

        pattern5(5);
        
    }
    static void pattern5(int n){

        for(int row =1; row<=n;row++){

            for(int col=1; col<=row; col++){

                System.out.print(col);
            }
            System.out.println();
        }
    }
   
}
