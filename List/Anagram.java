package List;
import java.util.Arrays;
public class Anagram {

      public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));       
      }  
      public static boolean isAnagram(String s, String t) {      
   
           if(s.length() != t.length()){
               
                return false;
           }  
           s = sortString(s); t = sortString(t);         
           int i =0; int j = 0;    

           while(i<s.length() & j<t.length()){  

               if(s.charAt(i) == t.charAt(j)){
                   
                    i++; j++;  
                   
               } else {
                   return false;
               }    
           }
            
           if (j == s.length()){
               
               return true;       
            }
            else {
                
                return false;
            }
                
      }
        public static String sortString(String inputString)
        {
            // Converting input string to character array
            char tempArray[] = inputString.toCharArray();  
            
            System.out.println(tempArray);
            // Sorting temp array using
            Arrays.sort(tempArray);
            // Returning new sorted string
            return new String(tempArray);
        }
    
    } 

