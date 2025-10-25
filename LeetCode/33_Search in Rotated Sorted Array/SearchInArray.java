package Leetcode.fokus.binary_search.bs_binSearchInArray;

/**
 * 33. Search in Rotated Sorted Array
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length)
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 * For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target,
 * return the index of target if it is in nums, or -1 if it is not in nums.
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class SearchInArray {
    // Intuition
    // Treated like two arrays to search.
    public int search(int[] nums, int target) {
        int leftIdx = 0;
        int rightIdx = nums.length-1;

        // Check if target already at highest lowest position
        if(nums[leftIdx] == target){
            return leftIdx;
        }else if(nums[rightIdx] == target){
            return rightIdx;
        }

        while (leftIdx <= rightIdx) {

            // Get new mid and check if it is the target
            int midIdx = (leftIdx + rightIdx) / 2;
            if (nums[midIdx] == target) {
                return midIdx;
            }

            // if the left part of the array is the sorted one
            // check and shift either right or left index for the next iteration
            if (nums[leftIdx] <= nums[midIdx]) {
                if (nums[leftIdx] <= target && target < nums[midIdx]) {
                    rightIdx = midIdx - 1;
                } else {
                    leftIdx = midIdx + 1;
                }

            // case right side is sorted
            } else if (nums[rightIdx] >= nums[midIdx]) {
                if (nums[rightIdx] >= target && target > nums[midIdx]) {
                    leftIdx = midIdx + 1;
                } else {
                    rightIdx = midIdx - 1;
                }
            }
        }

        // target not found
        return -1;
    }
}
