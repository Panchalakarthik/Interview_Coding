package Interview_Coding;

public class Reverse_String {

     public static void main(String[] args) {
        

        String str = "dod";
        String sc ="";
        String tem = str;
        for (int i = 0; i<str.length();i++){
         char temp = str.charAt(i);
         sc = temp + sc; 
      }
      if (tem.equals(sc)){
         System.out.println("String is pallendrome ");
      }else{
        System.out.println("not a pallendrome");
      }
    //   System.out.print(sc);
 
    }

}
