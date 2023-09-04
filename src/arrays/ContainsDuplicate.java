package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,2,3,4};

        System.out.println(containsDuplicate(arr1));
        System.out.println(containsDuplicate(arr2));

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            if (numsSet.contains(num)) {
                return true;
            }
            numsSet.add(num);
        }
        return false;
    }
}
