package List;


public class Doubleqouts {

    public static void main(String[] args) {
         
        String str = "My name is karthik ";
        String[] arr = str.split(" ");
        for(String s : arr){
            System.out.print("\" "+ s + "\" ");
        }
    }
    
}
