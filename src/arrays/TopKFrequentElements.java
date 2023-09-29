package arrays;

/*
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 * */

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;

        int[] nums2 = {1};
        int k2 = 1;

        System.out.println(Arrays.toString(topKFrequent(nums1, k1)));
        System.out.println(Arrays.toString(topKFrequent(nums2, k2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // create map containing numbers as keys and frequency as values
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // PriorityQueu is a minHeap

        /*
         * MinHeap is a tree structure where every node is smaller and equal to its children.
         * Basically, it's a tree where the smallest element is on top
         * */
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, Comparator.comparingInt(frequencyMap::get));

        for (int num : frequencyMap.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        Collections.reverse(result);
        return result.stream()
                .mapToInt(Integer::valueOf)
                .toArray();
    }
}
