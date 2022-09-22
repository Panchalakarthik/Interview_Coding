package List;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 9, 24 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubble(int[] arr) {
        boolean swapped;
        // ruun the steps in to n -1 times
        for (int i = 0; i < arr.length; i++) {
            swapped= false;
            // for each loop max elements comes to end
            for (int j = 1; j < arr.length - i; j++) {
                // swap the elements if smaller than the prevoius
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }       
            if(!swapped){
                break;
            }
        }
    }
}
