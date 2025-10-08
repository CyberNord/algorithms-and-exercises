package Hackerrank.SoftwareEngineer.Strings_and_Patterns;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

class Result {

    /*
     * https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/check-palindrome-filter-non-letters
     * Complete the 'isAlphabeticPalindrome' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts STRING code as parameter.
     */

    public static boolean isAlphabeticPalindrome(String code) {
        if(code != null){
            if(code.isEmpty()){return false;}

            StringBuilder letters = new StringBuilder();
            for(int i=0; i<code.length(); i++){
                if(Character.isLetter(code.charAt(i))){
                    letters.append(code.charAt(i));
                }
            }
            String lettersString = letters.toString().toLowerCase();
            if(lettersString.length() == 1){return true;}
            //if(lettersString.length()%2 != 0){return false;}

            int posEnd = lettersString.length()-1;
            for(int i=0; i<lettersString.length(); i++){
                if(posEnd < i){return true;}
                if(lettersString.charAt(i) != lettersString.charAt(posEnd)){
                    return false;
                }else{
                    posEnd--;
                }
            }
            return true;

        }
        return false;

    }
}

public class CheckPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String code = bufferedReader.readLine();

        boolean result = Result.isAlphabeticPalindrome(code);

        System.out.println(result ? 1 : 0);

        bufferedReader.close();
    }
}

