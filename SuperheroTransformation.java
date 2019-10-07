import java.util.Scanner;

public class SuperheroTransformation
{
  private static boolean isVowel(char c)
  {
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String first = sc.next();
    String second = sc.next();
    if (first.length() != second.length())
    {
      System.out.println("No");
    }
    else
    {
      boolean check = true;
      for (int i = 0 ; i < first.length(); i++)
      {
        if (isVowel(first.charAt(i)) && !isVowel(second.charAt(i)))
        {
          check = false;
        }
        if (!isVowel(first.charAt(i)) && isVowel(second.charAt(i)))
        {
          check = false;
        }
      }
      if (check)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
  }
}