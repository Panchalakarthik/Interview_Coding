package BinarySearch;

public class CelingBinarySearch  {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 15, 79, 88, 99, 110, 120 };
        // int[] arr ={120,110,100,55,44,33,12,1,0};
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println(" ");

        int target = 191;
        System.out.println("My Target element is :" + target);
        int ans = celinig(arr, target);
        System.out.println(ans + " ");

    }

    static int celinig(int[] arr, int target) {

        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = start + (end - end) / 2;

            if (target < arr[mid]) {

                end = mid - 1;

            } else if (target > arr[mid]) {

                start = mid + 1;
            } else {

                return mid;
            }

        }
        System.out.println("the element not prsent in the array");
        System.out.print("the next largest element is at the index is : ");
        return start; // ceil value gratest number >= target
        // return end; floor gratest number <= target

    }
    
}
