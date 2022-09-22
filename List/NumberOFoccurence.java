package List;

public class NumberOFoccurence {


    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,4,5,6,4,9};
        System.out.println(occurenc(arr));
        
    }

    public static int occurenc(int[] array){

        int max = 0;
        for (int i = 0; i < array.length; i++) {
               int count = 0;
               for (int j = 0; j < array.length; j++) {
                 if (array[i]==array[j])
                     count++;
           }
          if (count >= max)
              max = count;
         }
         return max;


      
    }


    
    
}
