import java.util.*;
class Palindrome1 {
  public static void main(String[] args) {
    
    int num = 4334, reversedNum = 0, remainder;
    
     int originalNum = num;
    
     while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
     if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }
}