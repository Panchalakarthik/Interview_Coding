package TCS;
import java.util.Arrays;
public class Anagram {

    class Solution {
        public boolean isAnagram(String s, String t) {

          
            
           s = sortString(s);
           t = sortString(t);
            
           if(s.length() != t.length()){
               
                return false;
           }
            
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
            char tempArray[] = inputString.toCharArray(); //s =  ['a','a','a','g','m','n','r']
     
            // Sorting temp array using
            Arrays.sort(tempArray);
     
            // Returning new sorted string
            return new String(tempArray);
        }
    
    }
    
    
}


/*
  
s = " anagram ";

t = " graanmah" ; 


s.length != t.length 

s =  aaagmnr;
t =  aaagmnr;


t [1,2,3,4,5,6,8];  


t.sort();







 */
