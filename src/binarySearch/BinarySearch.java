package binarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        System.out.println(search(arr1, target1));

        int[] arr2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        System.out.println(search(arr2, target2));

    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            }

            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }
        return -1;
    }

}
