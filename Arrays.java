import java.util.Scanner;


public class Arrays {

      public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        // System.out.print("Enter the size of Array :");
        // int si = sc.nextInt();
        // int [] arr = new int[si];
        // for (int i =0 ; i < arr.length; i++){

        //   arr[i]  = sc.nextInt();   
        // }
        // System.out.print("The Array elements are : " );
        // System.out.println(Arrays.toString(arr));
        // int a = Arrays.toString(arr);
      



        // for (int i =0 ; i < arr.length; i++){
              
              
        //        System.out.print(arr[i] + " ");  
        // }
   

        // for(int num :arr){
        //   System.out.print(num + " ");
           
        // }
          //  int[]  arr= new int[5];
          //  arr[0]= 25;
          //  arr[1]= 59;
          //  arr[2]= 56;
          //  arr[3]= 58;
          //  arr[4]= 51;

          //  System.out.println(arr[2]);
          System.out.print("Enter the size of String array : ");
          int st = sc.nextInt();
          String[] str = new String[st];
          for (int i= 0; i < str.length; i++ ){
            str[i] = sc.nextLine(); 
          }

          for (int i= 0; i < str.length; i++ ){
            System.out.println(str[i] + " ");
          }
          // for(String num : str){
          //    System.out.print(num + " ");
          // }
          sc.close();

      }
    
  }


















//     public static void main(String[] args) {
        
//       /* datatype[] variable name = new datatype [ Size ];

//          int[] roll = new int[5];

//          int[] roll = {10,20,40,50};

//          int[] ros; // declarition of an array */

//        // int[]    ros   =   new int[5]; // object is begin created in the ( heap memory );
//       // |        |           |
//   // datatype  variable  creating object in heap memory;

//     //  compile time         run time
// /
//    // System.out.println(ros[0]);

//     // String[] numb = new String[5];
//     // System.out.println(numb[4]);
    





//     }
    





