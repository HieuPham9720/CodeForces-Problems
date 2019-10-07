import java.util.Scanner;

public class Haiku
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String first = sc.nextLine();
    String second = sc.nextLine();
    String third = sc.nextLine();
    boolean check = true;
    int countFirst = 0;
    for (int i = 0; i < first.length(); i++)
    {
      if (first.charAt(i) == 'a' || 
          first.charAt(i) == 'e' ||
          first.charAt(i) == 'i' ||
          first.charAt(i) == 'o' ||
          first.charAt(i) == 'u')
      {
        countFirst++;
      }
    }
    //System.out.println(first);
    int countSecond = 0;
    for (int i = 0; i < second.length(); i++)
    {
      if (second.charAt(i) == 'a' || 
          second.charAt(i) == 'e' ||
          second.charAt(i) == 'i' ||
          second.charAt(i) == 'o' ||
          second.charAt(i) == 'u')
      {
        countSecond++;
      }
    }
    //System.out.println(second);
    int countThird = 0;
    for (int i = 0; i < third.length(); i++)
    {
      if (third.charAt(i) == 'a' || 
          third.charAt(i) == 'e' ||
          third.charAt(i) == 'i' ||
          third.charAt(i) == 'o' ||
          third.charAt(i) == 'u')
      {
        countThird++;
      }
    }
    //System.out.println(third);
    if (countFirst != 5 || 
        countSecond != 7 || 
        countThird != 5)
    {
      check = false;
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