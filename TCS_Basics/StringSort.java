package TCS_Basics;

import java.util.*;
public class StringSort {

    public static void main(String[] args) {
        
        String str = "bharghavi";
       String y = str.toUpperCase();
        System.out.println(y);
        
        // String tar = "iaabhhrgv";
        StringArray(str);
        System.out.println(StringArray(str));
    }

    static String StringArray(String str){

        // Converting input string to character array  
        char tempArray[] = str.toCharArray(); 
        // Sorting temp array using
        Arrays.sort(tempArray);   
        // Returning new sorted string
        return new String(tempArray);

    }
    
}


