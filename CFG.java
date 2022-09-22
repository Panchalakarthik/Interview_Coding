import java.util.Scanner;

class CFG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        sc.close();
        encode(str, k);
    }

     static void encode(String s, int k) {
    
          
            String newS = "";
    
          
            for (int i = 0; i < s.length(); ++i) {
        
                int val = s.charAt(i);
          
                int dup = k;
    
                if (val + k > 122) {
                    k -= (122 - val);
                    k = k % 26;
                    
                    newS += (char)(96 + k);
                } else {
                    newS += (char)(val + k);
                }
    
                k = dup;
            }
    
            System.out.println(newS);
        }
    

        
}

    