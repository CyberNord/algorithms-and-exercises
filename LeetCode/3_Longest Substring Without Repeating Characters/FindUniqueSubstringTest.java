package Leetcode.fokus.strings.str_longestSubStrNoRepeatingCharacters;

import LinkedIn.java_advanced_concepts.linkedHashMap_challange.VotingSystem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindUniqueSubstringTest {

    FindUniqueSubstring findUniqueSubstring = new FindUniqueSubstring();

    @Test
    public void test() {

        assertEquals(3, findUniqueSubstring.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, findUniqueSubstring.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, findUniqueSubstring.lengthOfLongestSubstring("pwwkew"));
        assertEquals(2, findUniqueSubstring.lengthOfLongestSubstring("abbbbb"));
    }
}