package List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupSnagram {

    public static void main(String[] args) {

      String[] strs = {"eat","tea","tan","ate","nat","bat"};
      System.out.println(groupAnagrams(strs));
        

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            
            char[] charA = str.toCharArray();
            Arrays.sort(charA);
            String keyStr = String.valueOf(charA);
            
            
            if (!map.containsKey(keyStr)) 
                map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}