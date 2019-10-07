import java.util.Scanner;

public class GotAnyGrapes
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int andrew = sc.nextInt();
    int dmitry = sc.nextInt();
    int michal = sc.nextInt();
    int green = sc.nextInt();
    int purple = sc.nextInt();
    int black = sc.nextInt();
    int total = green + purple + black;
    boolean check = true;
    if (green < andrew)
    {
      check = false;
    }
    else
    {
      green -= andrew;
      if (green + purple < dmitry)
      {
        check = false;
      }
      else
      {
        total -= (andrew + dmitry);
        if (total < michal)
        {
          check = false;
        }
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