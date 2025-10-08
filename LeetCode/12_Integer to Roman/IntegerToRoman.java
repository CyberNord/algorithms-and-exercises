package Leetcode.integers.int_integerToRoman;

//12. Integer to Roman

public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] intValue = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanValue = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < intValue.length; i++) {
            while(num >= intValue[i]){
                num -= intValue[i];
                result.append(romanValue[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman sol = new IntegerToRoman();
        System.out.println(sol.intToRoman(3749) + " MMMDCCXLIX");
        System.out.println(sol.intToRoman(58) + " LVIII");
        System.out.println(sol.intToRoman(1994)+ " MCMXCIV");

    }
}
