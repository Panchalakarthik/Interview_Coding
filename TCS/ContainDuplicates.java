package TCS;
import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 1 };
        for (int arr : nums) {

            System.out.print(arr + " ");

        }
        System.out.println();
        boolean ans = remove(nums);
        System.out.println(ans);
    }

    static boolean remove(int[] nums) {

        Set<Integer> karthik = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!karthik.add(nums[i])) {

                System.out.println("Array Contain Duplicates");
                return true;
            }
        }
        return false;

    }
}
