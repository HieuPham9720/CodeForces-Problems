import java.util.Scanner;

public class Football
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    boolean check = false;
    for (int i = 1; i < input.length(); i++)
    {
      int count = 1;
      while (i < input.length() && input.charAt(i) == input.charAt(i - 1))
      {
        count++;
        i++;
      }
      if (count >= 7)
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