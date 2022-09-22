import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        System.out.print("Enter employ ID : ");
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String management = sc.next();
        switch (empId){

          case 1 :
              System.out.println("karthik");
              break;
          case 2 :
              System.out.println("Bharu");
              break;
          case 3 :
              System.out.println("Pallavi");
           
              switch(management){


                case "IT":
                    System.out.println("Karrhik CEO");
                    break;

                case "Management":
                   System.out.println("Bharu HR");
                   break;

                case "employ" :
                    System.out.println("pallavi employ");

              }
            break;  
            default :
                System.out.println(" Enter correct id");
        }
        sc.close();
    }
}
