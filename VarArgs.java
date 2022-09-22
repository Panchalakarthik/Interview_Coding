import java.util.Arrays;

public class VarArgs {
        
        public static void main(String[] args) {
            
            
            //fun(12,34,2,3,4,67,8,99,66);
            multiple(12, 57, "karthik","bharu","pallavi");


        }
        static void multiple(int a ,int b, String...s){

            System.out.println(Arrays.toString( s));


        }



        static void fun(int...v){

             System.out.println(Arrays.toString(v));

        }
    
}


// variable lenght argumenths the out is default array | there the length not constant (int...any name),(String...s)...etc |