package Leetcode.fokus.strings.str_palindromeSubstring;

/**
 * 5. Longest Palindromic Substring
 * Given a string s, return the longest palindromic substring in s.
 * Constraints:
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */

public class FindLongestPalindrome {

    /**
     * Intuition:
     * for each character in s check the right and left neighbors iteratively
     * always save the largest palindrome found and return it.
     */

    int start = 0;
    int end = 0;
    public String longestPalindrome(String s) {
        start = 0; // purge
        end = 0; // purge
        if (s.isEmpty()) return "";
        if (s.length() == 1) return s;

        for(int i = 0; i < s.length(); i++){
            // once for one letter (uneven) once for two letters (even)
            findPalindrome(s, i, i);
            findPalindrome(s, i, i+1);
        }
        return s.substring(start, end+1);
    }


    private void findPalindrome(String s, int posLeft, int posRight) {
        while (posLeft >= 0 && posRight < s.length() && s.charAt(posLeft) == s.charAt(posRight)){
            posLeft--;
            posRight++;
        }
        // the last increment needs to be undone as it is either out of bonds or no palindrome
        posLeft++;
        posRight--;

        if (end - start < posRight-posLeft){
            start = posLeft;
            end = posRight;
        }
    }

    public static void main(String[] args) {
        FindLongestPalindrome bloodhound = new FindLongestPalindrome();

        System.out.println("Input: xwbabadwx --> " + bloodhound.longestPalindrome("babad")+ " expect aba or bab");
        System.out.println("Input: babad --> " + bloodhound.longestPalindrome("babad")+ " expect aba or bab");
        System.out.println("Input: cbbd --> " + bloodhound.longestPalindrome("cbbd")+ " expect bb");
        System.out.println("Input: ac --> " + bloodhound.longestPalindrome("ac") + " expect a");
        System.out.println("Input: c --> " + bloodhound.longestPalindrome("c") + " expect c");
        System.out.println("Input: _ --> " + bloodhound.longestPalindrome("") + " expect _");
    }
}
