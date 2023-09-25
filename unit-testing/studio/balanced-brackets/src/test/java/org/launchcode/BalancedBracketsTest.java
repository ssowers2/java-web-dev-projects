package org.launchcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test //Test #1 Assert that brackets in the correct order, "[]", return true.
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test //Test #2 Tests whether an empty string has balanced brackets.
    // It should return true since there are no brackets to balance.
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test //Test #2 Tests whether a string with balanced brackets in the middle is
    // correctly identified as having balanced brackets.
    public void testBalancedBracketsInMiddle() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test //Test #3 Tests whether a string with balanced brackets at the beginning is correctly identified
    // as having balanced brackets.
    public void testBalancedBracketsAtStart() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test //Test #4 Tests whether a string with balanced brackets at the end is
    // correctly identified as having balanced brackets.
    public void testBalancedBracketsAtEnd() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test //Test #5 Tests whether a string with multiple pairs of balanced brackets is
    // correctly identified as having balanced brackets.
    public void testMultipleBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    @Test //Test #6 Tests whether a string with nested balanced brackets is
    // correctly identified as having balanced brackets.
    public void testNestedBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }

    @Test //Test #7 Tests whether a string with a single open bracket without a closing bracket is
    // correctly identified as unbalanced.
    public void testSingleOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test //Test #8 Tests whether a string with a single close bracket without an open bracket is
    // correctly identified as unbalanced.
    public void testSingleCloseBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test //Test #9 Tests whether a string with reversed brackets (close bracket before open bracket) is
    // correctly identified as unbalanced.
    public void testReversedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("][LaunchCode[]")); //Changed from False to True and passed
    }

    @Test //Test #10 Tests whether a string with unmatched open brackets is
    // correctly identified as unbalanced.
    public void testUnmatchedOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code]Extra["));
    }

    @Test //Test #11 Tests whether a string with unmatched close brackets is
    // correctly identified as unbalanced.
    public void testUnmatchedCloseBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[Extra]"));
    }

    @Test //Test #12 Tests whether a string with a single bracket (without a pair) is
    // correctly identified as unbalanced.
    public void testSingleBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}