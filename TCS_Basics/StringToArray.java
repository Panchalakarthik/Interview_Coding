package TCS_Basics;
import java.util.*;
public class StringToArray {

    public static void main(String[] args) {
        
        String[] str = {"my","name","is"}; // String arry 
        
        /* 1 */  System.out.println(ArrayToString(str));
       /* 2 */   System.out.println(ConverTOStringbuilder(str));
      /* 3 */    System.out.println(UsingStringJoin(str));

    }

    //1. Using the Arrays.toString() method
    static String ArrayToString(String[] stringArray){

        return Arrays.toString(stringArray);
    }

    // 2. using Stringbuilder 
    static String ConverTOStringbuilder(String[] stringArray){
        StringBuilder str = new StringBuilder();
        for(int i =0; i<=stringArray.length-1;i++){
            str.append(stringArray[i]);
        }
        return str.toString();
    }

    // 3. Using Join 

    static String UsingStringJoin(String[] stringArray){
        String str = String.join(" ", stringArray);
        return str;
    }  
}
