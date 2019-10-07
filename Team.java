import java.util.Scanner;

public class Team
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int problems = sc.nextInt();
    int possible = 0;
    int total = 0;
    for (int i = 0; i < problems; i++)
    {
      int canDo = 0;
      for (int j = 0; j < 3; j++)
      {
        possible = sc.nextInt();
        if (possible == 1)
        {
          canDo++;
        }
      }
      if (canDo >= 2)
      {
        total++;
      }
    }
    System.out.println(total);
  }
}