package TCS;
import java.util.*;
public class Compare {

    public static void main(String[] args) {

            String[] nums = {"eat","tea","tan","ate","nat","bat"};
            String[] res = group(nums);
            HashMap<String, List<String>> map = duplicates(nums,res);  
            System.out.println(map.values().toString());
    }

    public static HashMap<String, List<String>> duplicates(String[] nums ,String[] res ) { 

        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
              if(map.containsKey(res[i])){
                  List<String> temp=map.get(res[i]);
                  temp.add(nums[i]);
                  map.put(res[i], temp);
              }
              else{
                List<String> temp2 =new ArrayList<>();
                  temp2.add(nums[i]);
                  map.put(res[i], temp2);
              }
           

            }
        return map;
        }
          
    
  
    public static String[] group(String[] strs) {
        String[] sortarr= new String[strs.length];
        for(int i = 0; i<strs.length;i++){
                
                String each = strs[i];
                each = sortString(each);
                sortarr[i] =each;   
            }
            
            // for(String i:sortarr){
                
            //     System.out.print( i + " ");
            // }
            // System.out.println( " ");
          return sortarr;
        }

        
    public static String sortString(String inputString){
            
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
     
        // Sorting temp array using
        Arrays.sort(tempArray);
     
        // Returning new sorted string
        return new String(tempArray);
        }
    }
    

