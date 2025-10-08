package integers.reverseInteger;

public class Solution {
    public int reverse(int x) {
        if( x == Integer.MIN_VALUE || x == Integer.MAX_VALUE ){return 0;}

        int thresholdMAX = Integer.MAX_VALUE / 10;
        int lastDigitMAX = Integer.MAX_VALUE % 10;

        int thresholdMIN = Integer.MIN_VALUE / 10;
        int lastDigitMIN = Integer.MIN_VALUE % 10;

        int reverse = 0;
        while(x!=0){
            int lastDigit = x % 10;
            x /= 10;
            if(reverse > thresholdMAX || reverse == thresholdMAX && lastDigit > lastDigitMAX){return 0;}
            if(reverse < thresholdMIN || reverse == thresholdMIN && lastDigit < lastDigitMIN){return 0;}
            reverse = reverse * 10 + lastDigit;
        }
        return reverse;
    }
}
