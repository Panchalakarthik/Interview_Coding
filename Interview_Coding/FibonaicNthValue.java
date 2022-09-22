package Interview_Coding;

public class FibonaicNthValue {
       
    public static void main(String[] args) {
        int num = 6;
        int a = 0;
        int b = 1;
        int count = 2;
    while(count <= num){
        
        int temp = b;
        b = b + a;
        a = temp;
        count = count + 1;

    }
    System.out.print(b);
    
    }
    

} 

