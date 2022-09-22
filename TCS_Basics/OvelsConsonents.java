package TCS_Basics;
import java.util.Scanner;
public class OvelsConsonents {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("String 1 : ");
        String  str = sc.nextLine();
      

        System.out.print("String 2 : ");
        String str2 = sc.nextLine();
        

        System.out.print("String 3 : ");
        String str3 = sc.nextLine();

        str3 = str3.toUpperCase();
        System.out.println();
        str = str.toLowerCase();
        str2 = str2.toLowerCase();
        
        char ch[]=str.toCharArray();
        char vh[]= str2.toCharArray();
    
        for(int i =0;i<ch.length;i++){

            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                ch[i] = '"';
            }
            else if(vh[i]>= 'a' && vh[i]<='z'){
                vh[i] = '*';       
            }    
        }
        for (int i = 0; i < ch.length-1; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();

        for (int i = 0; i < vh.length-1; i++) {
            System.out.print(vh[i]);
        }
        System.out.println();

         System.out.println(str3);
         sc.close();
       
    }
    
}
