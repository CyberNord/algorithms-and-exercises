package integers.int_singleNumber;

// Best solution with O(n) time and O(1) space

public class SingleNumber {
    public int SingleNumberBF(int[] nums) {
        int singleNumber = 0;
        for (int num : nums) {
            singleNumber ^= num;
        }
        return singleNumber;
    }
}
