package Leetcode.fokus.strings.str_integerToWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerToWordsTest {

    IntegerToWords convert = new IntegerToWords();

    @Test
    public void testLeetCode() {

        int case1 = 123;
        String solCase1 = "One Hundred Twenty Three";

        int case2 = 12345;
        String solCase2 = "Twelve Thousand Three Hundred Forty Five";

        int case3 = 1234567;
        String solCase3 = "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven";

        assertEquals(solCase1, convert.numberToWords(case1));
        assertEquals(solCase2, convert.numberToWords(case2));
        assertEquals(solCase3, convert.numberToWords(case3));
    }

    @Test
    public void testBasics() {
        IntegerToWords s = new IntegerToWords();
        assertEquals("Zero", s.numberToWords(0));
        assertEquals("Five", s.numberToWords(5));
        assertEquals("Ten", s.numberToWords(10));
        assertEquals("Nineteen", s.numberToWords(19));
        assertEquals("Twenty", s.numberToWords(20));
        assertEquals("Twenty One", s.numberToWords(21));
    }

    @Test
    public void testHundreds() {
        IntegerToWords s = new IntegerToWords();
        assertEquals("One Hundred", s.numberToWords(100));
        assertEquals("One Hundred One", s.numberToWords(101));
        assertEquals("One Hundred Ten", s.numberToWords(110));
        assertEquals("One Hundred Twenty Three", s.numberToWords(123));
    }

    @Test
    public void testThousandsMillionsBillions() {
        IntegerToWords s = new IntegerToWords();
        assertEquals("One Thousand", s.numberToWords(1000));
        assertEquals("One Thousand One", s.numberToWords(1001));
        assertEquals("Twelve Thousand Three Hundred Forty Five", s.numberToWords(12345));
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
                s.numberToWords(1234567));
        assertEquals("Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Seven",
                s.numberToWords(2147483647));
    }

}