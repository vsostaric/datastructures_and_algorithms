package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String[] args) {

        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] arr2 = {3, 2, 4};
        int target2 = 6;

        int[] arr3 = {3, 3};
        int target3 = 6;

        int[] arr4 = {-3,4,3,90};
        int target4 = 0;

        System.out.println(Arrays.toString(twoSum(arr1, target1)));
        System.out.println(Arrays.toString(twoSum(arr2, target2)));
        System.out.println(Arrays.toString(twoSum(arr3, target3)));
        System.out.println(Arrays.toString(twoSum(arr4, target4)));

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementMap.containsKey(complement)) {
                return new int[]{i, complementMap.get(complement)};
            } else {
                complementMap.put(nums[i], i);
            }
        }
        return null;
    }

}
