package List;

public class SwapWithout {

    int a,b;

    static void swap(SwapWithout p){

        p.a = p.a + p.b;
        p.b = p.a - p.b;
        p.a = p.a - p.b;
        return;
    }
    public static void main(String[] args) {
        SwapWithout s = new SwapWithout();
        System.out.println(s);
        s.a=10;
        s.b=20;
        
        System.out.println("before swapping numbers: "+ s.a +" "+ s.b);
        swap(s);
        System.out.println("after swapping numbers: "+ s.a +" "+ s.b);
 
        
    }
    
    
}
