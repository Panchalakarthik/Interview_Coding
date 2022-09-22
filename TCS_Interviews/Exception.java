public class Exception {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 0;

        try {
            divide(a,b);
        
        } catch (ArithmeticException e ){

            System.out.println(e.getMessage());
        } 
    }
    static int divide(int a, int b)throws ArithmeticException{

        if ( b == 0 ){

            throw new ArithmeticException("please don't do this ");
        }
        return a / b;
    }

}

    