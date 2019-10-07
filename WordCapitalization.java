import java.util.Scanner;

public class WordCapitalization
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    System.out.println(Character.toUpperCase(input.charAt(0)) + input.substring(1, input.length()));
  }
}