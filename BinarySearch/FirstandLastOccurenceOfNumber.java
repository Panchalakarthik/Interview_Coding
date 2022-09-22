package BinarySearch;

public class FirstandLastOccurenceOfNumber {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 3, 3, 3, 3, 3, 4, 5 };
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println(" ");

        int target = 3;
        System.out.println("My Target element is :" + target);
       // int[] ans = searchRange(arr, target);

        //System.out.println(ans + " ");

    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 }; // if gthe taget is not found in the array

        // check the first occurrence of the taeget in a array

        ans[0] = search(nums, target, true);
        if (ans[0] !=-1)
            ans[1]= search(nums, target, false);
    
        return ans;
    }

    // this function returns the index of my target

    static int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {

                end = mid - 1;

            } else if (target > nums[mid]) {

                start = mid + 1;
            } else {

                // potental answer is found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {

                    start = mid + 1;
                }
            }

        }
        return ans;

    }

}

/*
 


 */
