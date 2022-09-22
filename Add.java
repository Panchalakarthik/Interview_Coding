import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        // float inp1 =input.nextFloat();
        // float inp2 = input.nextFloat();
        // float sum =  inp1 + inp2;
        // System.out.println("the sum is " + sum );
       

        //------------- type conversion and casting takes place --------------------------


        //   int inp = input.nextFloat();    // it  will give me arror beacuse the inger is smaller then the float 
        //  float val = input.nextInt();


        //if you want to convert the integer to float the ntha casting is takes place
        // compressing a biger number in to a small type is called type casting

        //int valuess = 68.0;
        // int values =(int)( 68.0);
        // System.out.println("the sum is " + values );


        //-------------Automatica type promotion i expression--------------------------
        
        int  a = 257;
        byte b = (byte)(a); //257 % 256 =1

        System.out.println(b );  // it gives the reminder of the byte

        byte b1 = 60;
        byte b2 = 40;
        byte b3 = 100;
        int exp = b1 * b2 / b3;    //  in this case the b1 and b2 are bytes the product is is 2,400 the size of byte is 256 
                                  //   but in exp it converts the byte to  integer  then only its products
        System.out.println(exp);


       // byte b9 =10;
        //b9 =b9*40;   // in byte evalution the byte before perfome it will convertint into integer then how ot will assign the
                    // integer value to byte thats wwhy it show error
  
    


        input.close();
   }
    
}




    