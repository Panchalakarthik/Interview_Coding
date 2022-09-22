package TCS_Basics;
import java.util.*;
public class StringToArrayList {

   public static void main(String[] args) {

            String str = "Amma";
            String[] strsplit= str.split("");
            // ArrayList<String>  s= new ArrayList<>();
            Arrays.asList(strsplit);
            for(String i : strsplit){
               System.out.print(i + " ");
            }
            System.out.println();
            String one = strsplit[0];
            System.out.println(one);
   }
   

}
