package integers.int_factorialTrailingZeros;

/**
 * TaskId: 172
 * Given an integer n, return the number of trailing zeroes in n!.
 * Constraints: 0 <= n <= 10^4
 * Write a solution that works in logarithmic time complexity
 */

public class FactorialTrailingZeros {
    int trailingZeroes(int number) {
        int result = 0;
        int curr = 5;
        while(curr <= number){
            result += number / curr; // count trailing zeros for current power of 5
            curr *= 5;  // next power of 5
        }
        return result;
    }
    /**
     * !5 = 1 * 2 * 3 * 4 * 5 = 120
     * !10 = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800 // 5s count trailing zeroes
     * trailing Zeros of 25! = 5,10,15,20,25 <--- 25 = 5²
     *  --> trailing zeros = Number/5 + Number/5² + Number/5³ ...
     */

    public static void main(String[] args) {
        System.out.println("Trailing Zeros of 5! = " +new FactorialTrailingZeros().trailingZeroes(5));
        System.out.println("Trailing Zeros of 25! = " +new FactorialTrailingZeros().trailingZeroes(25));
        System.out.println("Trailing Zeros of 125! = " +new FactorialTrailingZeros().trailingZeroes(125));
        System.out.println("Trailing Zeros of 700! = " +new FactorialTrailingZeros().trailingZeroes(700));
        System.out.println("Trailing Zeros of 10000! = " +new FactorialTrailingZeros().trailingZeroes(10000));

    }

}

