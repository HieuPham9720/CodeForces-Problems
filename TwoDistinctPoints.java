import java.util.Scanner;

public class TwoDistinctPoints
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    for (int i = 0; i < test; i++)
    {
      int l1 = sc.nextInt();
      int r1 = sc.nextInt();
      int l2 = sc.nextInt();
      int r2 = sc.nextInt();
      if (l2 == l1)
      {
        System.out.println(l1 + " " + r2);
      }
      else
      {
        System.out.println(l1 + " " + l2);
      }
    }
  }
}