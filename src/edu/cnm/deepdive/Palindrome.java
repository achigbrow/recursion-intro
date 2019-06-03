package edu.cnm.deepdive;

public class Palindrome {

  public static boolean isPalindrome(String s) {
    return isSimplePalindrome(s.replaceAll("[\\W_]+", "").toLowerCase());
  }

    //TODO Strip out punctuation & spaces, convert result to lower case, and compute and return
    //a result indicating whether resulting string is a palindrome. Use any necessary upper methods.
    private static  boolean isSimplePalindrome(String s) {
      return s.length() <=1
          || (s.charAt(0) == s.charAt(s.length()-1))
          && isPalindrome(s.substring(1, s.length()-1)
      );
  }
}
