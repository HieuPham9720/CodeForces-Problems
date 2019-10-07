import java.util.Scanner;

public class NewYearAndTheChristmasOrnament
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int min = Integer.MAX_VALUE;
    int y = sc.nextInt();
    if (y < min)
    {
      min = y;
    }
    int b = sc.nextInt();
    if (b - 1 < min)
    {
      min = b - 1;
    }
    int r = sc.nextInt();
    if (r - 2 < min)
    {
      min = r - 2;
    }
    System.out.println(min * 3 + 3);
  }
}