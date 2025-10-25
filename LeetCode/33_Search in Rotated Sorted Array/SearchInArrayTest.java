package Leetcode.fokus.binary_search.bs_binSearchInArray;

import Leetcode.fokus.strings.str_longestSubStrNoRepeatingCharacters.FindUniqueSubstring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInArrayTest {

    SearchInArray searchInArray = new SearchInArray();

    @Test
    public void test() {

        assertEquals(4, searchInArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(-1, searchInArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        assertEquals(-1, searchInArray.search(new int[]{1}, 0));

    }
}