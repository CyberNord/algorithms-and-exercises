package Leetcode.fokus.strings.str_longestSubStrNoRepeatingCharacters;

import java.util.HashMap;

/**
 * 3. Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without duplicate characters.
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */

public class FindUniqueSubstring {
    public int lengthOfLongestSubstring(String s) {
//         Intuition:
//         for each character in s check to the left if there is no recurring character
//         if a duplicate is found, update ans and shift pointer +1
//         Hashmap contains the current Character as Key and its position as value
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int left = 0;
        int right = 0;
        while(right<s.length()){
            char currChar = s.charAt(right);
              if(map.containsKey(currChar)){
                  left = Math.max(map.get(currChar) +1,left);// shift left
                  map.put(currChar,right);// update Char key
              }  else {// New Character
                  map.put(currChar,right);
              }
              ans = Math.max(ans,right-left+1);
              right++;
        }
        return ans;
    }
}
