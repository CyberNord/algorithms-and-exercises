package integers.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        if(n <= 0){
            return result;
        }
        for (int i = 1; i <= n; i++){
            boolean notDivisible = true;
            if(i%3==0 && i%5 == 0){
                result.add("FizzBuzz");
            }else if(i%5 == 0){
                result.add("Buzz");
            }else if(i%3 == 0){
                result.add("Fizz");
            }else{
                result.add(i + "");
            }

        }
        return result;
    }
}