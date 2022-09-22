public class OverLoading {

     public static void main(String[] args) {
         
        fun(67);
        fun(45,67);
     }

     static void fun(int a){
         System.out.println("first one");
         System.out.println(a);

     }
     static void fun(int s,int e){
         System.out.println("second one");
         System.out.println(s + " " + e);

     }
    
}
