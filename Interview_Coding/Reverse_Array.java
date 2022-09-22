package Interview_Coding;




public class Reverse_Array {

    public static void printReverse(String[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n/2;i++)
        {
            String temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        String[] arr = {"one","two","three","four","five"};
        printReverse(arr);
    }
    
}
