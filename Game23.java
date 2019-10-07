import java.util.Scanner;

public class Game23
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    if (m % n != 0)
    {
      System.out.println(-1);
    }
    else
    {
      int time = m / n;
      // if n = m -> no steps needed
      if (time == 1)
      {
        System.out.println(0);
      }
      else
      {
        int count = 0;
        while (time % 2 == 0)
        {
          count ++;
          time = time / 2;
        }
        while (time % 3 == 0)
        {
          count++;
          time = time / 3;
        }
        // if time has other factors than 2 and 3
        if (time != 1)
        {
          System.out.println(-1);
        }
        else
        {
          System.out.println(count);
        }
      }
    }
  }
}