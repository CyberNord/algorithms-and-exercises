package Leetcode.fokus.binary_search.bs_binarySearch;

/** 704. Binary Search
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 * Constraints:
 * 1 <= nums.length <= 104
 * -104 < nums[i], target < 104
 * All the integers in nums are unique.
 * nums is sorted in ascending order.
 */

public class BinSearch {
    public int search(int[] nums, int target) {
        int lowIdx = 0;
        int highIdx = nums.length-1;
        if(nums[lowIdx] == target){
            return lowIdx;
        }else if(nums[highIdx] == target){
            return highIdx;
        } else if (target < nums[lowIdx] || target > nums[highIdx]) {
            return -1;
        }
        while (lowIdx <= highIdx) {
            int midIdx = (lowIdx+highIdx)/2;
            if (target > nums[midIdx]){
                lowIdx = midIdx+1;
            }else if (target < nums[midIdx]){
                highIdx = midIdx-1;
            }else{ // mid is target
                return midIdx;
            }
        }
        return -1;
    }
}
