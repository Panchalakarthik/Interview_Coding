
public class Mix {
    public static void main(String[] args) {

          // int[] findPIN = {3521,2452,1352,38};
          // System.out.println(findPIN(findPIN, findPIN, findPIN, 0));



    }
    // static int findPIN(int[] input1,int[] input2,int[] input3,int input4)
    { 

        // //  Scanner sc = new Scanner(System.in);
        //  System.out.print("Input1 :");
        //  int v = sc.nextInt();
        //  System.out.print("Input2 :");
        //  int k = sc.nextInt();
        //  System.out.print("Input3 :");
        //  int l = sc.nextInt();
        //  v = minval(input1);
        //  k = maxVal(input2);
        //  l = maxVal(input3);
        //  input4 = 39;
        //  return v*k*l+input4;
          
    }
    static int maxVal(int[] arr ){

        int maxVal = arr[0];
        for (int i = 0 ; i< arr.length; i++ ){
    
             if (arr[i] > maxVal){
               maxVal = arr[i];
             }
        }
        return maxVal;
    }
    static int minval(int[] arr ){

        int minval = arr[0];
        for (int i = 0 ; i< arr.length; i++ ){
             if (arr[i] < minval){
               minval = arr[i];
             }
        }
        return minval;
    
    }
}


