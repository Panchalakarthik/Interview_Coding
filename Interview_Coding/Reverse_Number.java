package Interview_Coding;
public class Reverse_Number {

    public static void main(String[] args) {
        
        int num = 34543;
        int reverse = 0;
        int temp = num;
        while(num > 0){ 
             int reminder = num % 10;
             reverse = reverse * 10 + reminder;
             num = num / 10;  
        }
        System.out.println(reverse);
        if(temp ==  reverse){
            System.out.print("Pallendrome");
        }else{
            System.out.println("Not  pallendrome");
        }
       
       


    }
    
}
