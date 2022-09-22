public class Shadowing {

    static int x = 99;
    public static void main(String[] args) {
        
        int x =80;
        System.out.println(x);
        sum();

    }

    static void sum(){
        System.out.println(x);
    }
    
}
