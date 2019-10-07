import java.util.Scanner;

public class GennadyAndACardGame
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    String[] hand = new String[5];
    boolean check = false;
    for (int i = 0; i < 5; i++)
    {
      hand[i] = sc.next();
      if (hand[i].charAt(0) == input.charAt(0) || hand[i].charAt(1) == input.charAt(1))
      {
        check = true;
      }
    }
    if (check)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}