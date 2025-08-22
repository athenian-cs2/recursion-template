import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyTests {

  @Test
  public void testAddDigits() {
    assertEquals(4, MyMain.addDigits(1111), "The sum of the digits in 1111 should be: 4");
    assertEquals(10, MyMain.addDigits(1234), "The sum of the digits in 1234 should be: 10");
    assertEquals(18, MyMain.addDigits(9342), "The sum of the digits in 9342 should be: 18");
    assertEquals(21, MyMain.addDigits(1965), "The sum of the digits in 1965 should be: 21");
  }

  @Test
  public void testIsPalindrome() {
    assertEquals(
        true,
        MyMain.isPalindrome("racecar"),
        "Whether or not the String \"racecar\" is a palindrome should be: true");
    assertEquals(
        true,
        MyMain.isPalindrome("naan"),
        "Whether or not the String \"naan\" is a palindrome should be: true");
    assertEquals(
        true,
        MyMain.isPalindrome("step on no pets"),
        "Whether or not the String \"step on no pets\" is a palindrome should be: true");
    assertEquals(
        true,
        MyMain.isPalindrome("amanaplanacanalpanama"),
        "Whether or not the String \"amanaplanacanalpanama\" is a palindrome should be: true");
    assertEquals(
        false,
        MyMain.isPalindrome("lemon"),
        "Whether or not the String \"lemon\" is a palindrome should be: false");
    assertEquals(
        false,
        MyMain.isPalindrome("abca"),
        "Whether or not the String \"abca\" is a palindrome should be: false");
    assertEquals(
        false,
        MyMain.isPalindrome("abbcdba"),
        "Whether or not the String \"abbcdba\" is a palindrome should be: false");
  }

  @Test
  public void testReverse() {
    assertEquals(
        "rohcna",
        MyMain.reverse("anchor"),
        "The reverse of the String \"anchor\" should be: rohcna");
    assertEquals(
        "desserts",
        MyMain.reverse("stressed"),
        "The reverse of the String \"stressed\" should be: desserts");
    assertEquals(
        "abcdefgh",
        MyMain.reverse("hgfedcba"),
        "The reverse of the String \"hgfedcba\" should be: abcdefgh");
    assertEquals(
        "racecar",
        MyMain.reverse("racecar"),
        "The reverse of the String \"anchor\" should be: racecar");
  }
}
