package Leetcode.fokus.strings.str_integerToWord;

/**
 * 273. Integer to English Words
 * Convert a non-negative integer num to its English words representation.
 * 0 <= num <= 2^(31) - 1
 */
public class IntegerToWords {

    private final String[] SPECIAL = {"Zero", " Hundred "};
    private final String[] BASE_NUM = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TEN_NUM = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] HIGH_NUM = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if(num == 0) return SPECIAL[0];
        int i = 0;
        StringBuilder str = new StringBuilder();

        while (num > 0) {
            // split the number into three-digit chunks recursively
            if(num % 1000 != 0) {
                str.insert(0, convertChunk(num % 1000) + HIGH_NUM[i] + " ");
            }
            num /= 1000; // next chunk
            i++;
        }
        return str.toString().trim();
    }

    private String convertChunk(int number) {
        if(number == 0){
            return "";
        }else if(number < 20){
            return BASE_NUM[number] + " ";
        }else if(number < 100){
            return TEN_NUM[number / 10] +
                    " " +
                    convertChunk(number % 10);
        }else{
            return BASE_NUM[number / 100] + SPECIAL[1] +
                    convertChunk(number % 100);
        }
    }
}
