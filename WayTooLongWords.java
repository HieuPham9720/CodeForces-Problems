import java.util.Scanner;

public class WayTooLongWords extends Object{
  
  /**
   * Shortens the input word accordingly to the given description
   * and prints it out
   * @param s the String that needs shortening
   */ 
  public static void shorten(String s){
    if (s.length() <= 10) System.out.println(s);
    else{
      // a StringBuilder to create the output
      StringBuilder result = new StringBuilder();
      result.append(s.charAt(0));
      result.append(s.length() - 2);
      result.append(s.charAt(s.length() - 1));
      System.out.println(result.toString());
    }
  }
  
  public static void main(String[] args){
    // a Scanner to read the input
    Scanner scanner = new Scanner(System.in);
    // an int to store the number of input words
    int n = Integer.parseInt(scanner.next());
    // a String to store the input word
    String input;
    for (int i = 0; i < n; i++){
      input = scanner.next();
      shorten(input);
    }
  }
  
}