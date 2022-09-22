public class PassingMes {

    public static void main(String[] args) {
        
        String msg = "Karthik raj";
        greet(msg);
    }
    
    static void greet(String name){

        System.out.println(name);
    }
}


/*
    
   in this msz = " karthi raj "  that will be passed in the greet (msz) function after.. here " msg "is reference variable 
   | the name is passed in this method the values is padded | there is no call by reference in java
   the greet function greet(String name) the msg and this name are pointing to the same object called karthik raj 


 */