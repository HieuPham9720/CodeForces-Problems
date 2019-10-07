import java.util.Scanner;

public class DigitalRoot
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    for (int i = 0; i < test; i++)
    {
      long k = sc.nextLong();
      int x = sc.nextInt();
      long result = x + 9 * (k - 1);
      System.out.println(result);
    }
  }
}
