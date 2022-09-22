package Interview_Coding;

public class FibonaicNtoM {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int num ;
        int count = 100;
        for(int i =2; i < count;i++){ 
            num = a + b;
            System.out.print(num + " ");          
            a = b;
            b = num;         
        }       
    }   
}
