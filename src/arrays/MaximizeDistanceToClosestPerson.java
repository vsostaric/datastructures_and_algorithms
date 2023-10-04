package arrays;

/*
*
You are given an array representing a row of seats where seats[i] = 1 represents a person sitting in the ith seat,
and seats[i] = 0 represents that the ith seat is empty (0-indexed).
*
There is at least one empty seat, and at least one person sitting.
*
Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized.
*
* */
public class MaximizeDistanceToClosestPerson {

    public static int maxDistToClosest(int[] seats) {

        int maxDistance = 0;
        int previousPerson = -1;

        int index = 0;
        while (index < seats.length) {

            if (seats[index] == 1) {
                if (previousPerson == -1) {
                    maxDistance = index;
                } else {
                    maxDistance = Math.max(maxDistance, (index - previousPerson) / 2);
                }
                previousPerson = index;
            }
            index++;
        }

        maxDistance = Math.max(maxDistance, (seats.length - 1 - previousPerson));

        return maxDistance;

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 0, 1, 0, 1};
        int[] arr2 = {1, 0, 0, 0};
        int[] arr3 = {0, 1};
        int[] arr4 = {1, 0, 0, 1};

        System.out.println(maxDistToClosest(arr4));
        System.out.println(maxDistToClosest(arr1));
        System.out.println(maxDistToClosest(arr2));
        System.out.println(maxDistToClosest(arr3));

    }


}
