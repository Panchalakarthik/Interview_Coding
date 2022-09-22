// Smallest letter grater then the target element

package BinarySearch;

public class SmallestChar {
    public static void main(String[] args) {

        char[] letter = { 'a', 'b', 'e', 'f', 'h' };
        // int[] arr ={120,110,100,55,44,33,12,1,0};
        for (char nums : letter) {
            System.out.print(nums + " ");
        }
        System.out.println(" ");

        char target = 'e';
        System.out.println("My Target element is :" + target);
        char ans = celinig(letter, target);
        System.out.println(ans + " ");

    }

    static char celinig(char[] letters, int target) {

        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {

            int mid = start + (end - end) / 2;

            if (target < letters[mid]) {

                end = mid - 1;

            } else {

                start = mid + 1;
            }

        }
        // System.out.println("the element not prsent in the array");
        System.out.print("the next largest element is at the index is : ");
        return letters[start % letters.length]; // ceil value gratest number >= target
        // return end; floor gratest number <= target

    }

}
