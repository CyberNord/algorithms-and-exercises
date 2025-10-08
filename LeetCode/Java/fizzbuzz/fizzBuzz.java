package integers.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * FizzBuzz
 * Given an integer, return an array of string where:
 * arr[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * arr[i] == "Fizz" if i is divisible by 3.
 * arr[i] == "Buzz" if i is divisible by 5.
 * arr[i] == i (as a string) if none of the above conditions are true.
 */
public class fizzBuzz {
    public String[] FizzBuzz(int n) {
        String[] result = new String[n];
        if(n <= 0){
            return result;
        }
        for (int i = 1; i <= n; i++){
            StringBuilder sb = new StringBuilder();
            boolean notDivisible = true;
            if(i%3 == 0){
                sb.append("Fizz");
                notDivisible = false;
            }
            if(i%5 == 0){
                sb.append("Buzz");
                notDivisible = false;
            }
            if(notDivisible){
                sb.append(i);
            }
            result[i-1] = sb.toString();
        }
        return result;
    }
}
