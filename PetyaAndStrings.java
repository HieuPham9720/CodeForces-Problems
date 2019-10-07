import java.util.Scanner;

public class PetyaAndStrings extends Object{
  
  /**
   * Compares two strings lexicographically
   * @param s1 the first input string
   * @param s2 the second input string
   * @return (1 if s1 > s2) (-1 if s1 < s2) (0 if s1 = s2)
   */ 
  public static int compareString(String s1, String s2){
    for (int i = 0; i < s1.length(); i++){
      if (s1.charAt(i) > s2.charAt(i)) return 1;
      if (s1.charAt(i) < s2.charAt(i)) return -1;
    }
    return 0;
  }
  
  public static void main(String[] args){
    //a Scanner to read the input
    Scanner scanner = new Scanner(System.in);
    // a String to store the first gift
    String firstGift = scanner.next();
    // a String to store the second gift
    String secondGift = scanner.next();
    System.out.println(compareString(firstGift.toUpperCase(), secondGift.toUpperCase()));
  }
  
}