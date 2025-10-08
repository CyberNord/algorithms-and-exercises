package integers.int_singleNumber;

import java.util.HashSet;
import java.util.Set;


// Brute Force solution with O(n) time and O(n) space

public class SingleNumberBF {

    public int SingleNumberBF(int[] nums) {
        if(nums.length == 1){return nums[0];}
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        SingleNumberBF s = new SingleNumberBF();
        System.out.println(s.SingleNumberBF(new int[]{2,2,1}));
    }
}
