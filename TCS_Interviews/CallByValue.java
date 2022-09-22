public class CallByValue {

    int a = 10;
    void call(int a) {
         
        // this local variable a is subject to change in its value
        a = a+10;
    }
     
    public static void main(String[] args) {
 
        CallByValue eg = new CallByValue();
        System.out.println("Before call-by-value: " + eg.a);

        eg.call(50510);
        System.out.println("After call-by-value: " + eg.a);              /*
                                                                            * Passing an integer 50510 to the call() method. The value of 
                                                                            * 'a' will still be unchanged since the passing parameter is a 
                                                                            * primitive type. 
                                                                        */
         
         
    }

    
}
