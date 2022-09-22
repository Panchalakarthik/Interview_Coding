package Interview_Coding;

public class PrimeOrNot {

    public static void main(String[] args) {
        
        int num = 4;
        int count = 0 ;
        for(int i =2;i<=num/2;i++){
            if (num %i == 0){
                count++;
            }
        }
        if(count > 0){
            System.out.println(num + " : not a prime");
        }else{
            System.out.println(num + " : prime");
        }
    }
    
}
