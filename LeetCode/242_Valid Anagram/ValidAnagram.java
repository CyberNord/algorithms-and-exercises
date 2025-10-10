package Leetcode.fokus.strings.str_validAnagram;

/**
 * 242 Valid Anagram
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * Constraints:
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */

public class ValidAnagram {

    // Intuition:
    // Since the input only contains lowercase English letters (26 total),
    // we can solve this by using an array to count the occurrences of each letter.
    // If, in the end, any position in the array is not zero, the strings are not anagrams.

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] letters = new int[26];
        for(int i=0;i<s.length();i++){
            letters[s.charAt(i)-'a']++;
            letters[t.charAt(i)-'a']--;
        }

        for(int curr : letters){
            if (curr!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram obj = new ValidAnagram();

        System.out.println(obj.isAnagram("anagram","nagaram"));
        System.out.println(obj.isAnagram("rat","car"));
        System.out.println(obj.isAnagram("no","anagram"));
        System.out.println(obj.isAnagram("anagram","no"));
        System.out.println(obj.isAnagram("b","b"));
    }
}
