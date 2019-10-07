import java.util.Scanner;

public class MinimumInteger
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    for (int i = 0; i < test; i++)
    {
      int l = sc.nextInt();
      int r = sc.nextInt();
      int d = sc.nextInt();
      if (d < l || d > r)
      {
        System.out.println(d);
      }
      else
      {
        System.out.println(r - (r % d) + d);
      }
    }
  }
}