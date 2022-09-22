package TCS_lanchpad;
import java.util.*;
public class Even {

    public static void main( String[] args){
        
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n]; 
            for(int i=0;i<n;i++)
            {
             arr[i]=sc.nextInt();
            }
            sc.close();
        	int count=0;
            for( int ite : arr){
                
                  if (ite %2==0){
                    count++;
                     System.out.println(ite);   
                      
                  }
              
      }
      if(count==0){
        
         System.out.println("No Even Elements Found.");

     }
        
}
}
