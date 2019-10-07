import java.util.Scanner;

public class EqualizePricesAgain
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    for (int i = 0; i < test; i++)
    {
      int n = sc.nextInt();
      int sum = 0;
      for (int j = 0; j < n; j++)
      {
        sum += sc.nextInt();
      }
      if (sum % n == 0)
      {
        System.out.println(sum / n);
      }
      else
      {
        System.out.println(sum / n + 1);
      }
    }
  }
}