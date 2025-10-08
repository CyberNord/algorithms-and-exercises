package integers.palindromeNumber;

/**
 * TaskId: 9
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * Constraints:
 * -231 <= x <= 231-1
 * Could you solve it without converting the integer to a string?
 */

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {return false;}
        if (x != 0 && x % 10 == 0) {return false;}
        int curr = x;
        int reverse = 0;

        while (curr > reverse) {
            reverse = reverse * 10 + curr % 10;
            curr /= 10;
        }
        if (curr == reverse || curr == reverse / 10) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(1234321));
    }
}