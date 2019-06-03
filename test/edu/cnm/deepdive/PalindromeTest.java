package edu.cnm.deepdive;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import org.junit.Test;

public class PalindromeTest {

  @Test
  public void isPalindrome() {
    String [] testArray = {"radar", "race car", "A man, a plan, a canal - Panama!"};

    for (int i = 0; i < testArray.length; i++) {
      String testValue = testArray[i];
      assertTrue(Palindrome.isPalindrome(testValue));
    }
    String [] testFalseArray = {"test", "Bob's Burgers", "Palindrome"};

    for (int i = 0; i < testFalseArray.length; i++) {
      String testFalseValue = testFalseArray[i];
      assertFalse(Palindrome.isPalindrome(testFalseValue));
    }


  }
}