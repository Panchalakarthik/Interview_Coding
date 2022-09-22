package List;

// i/p :  A B C D  E
// o/p : A C E B D

public class Example {

    public static void main(String[] args) {

        String sc = "ABCDE";
        for(int i= 0; i<sc.length();i= i+2){
             char c = sc.charAt(i);
               System.out.print(c + " ");
             }
        for(int j = 1; j< sc.length();j=j+2){
             char c = sc.charAt(j);
             System.out.print(c + " ");

        }    
    }   
}
