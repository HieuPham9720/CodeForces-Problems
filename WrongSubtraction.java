import java.util.Scanner;

public class WrongSubtraction
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    for (int i = 0; i < k; i++)
    {
      if (n % 10 != 0)
      {
        n--;
      }
      else
      {
        n = n / 10;
      }
    }
    System.out.println(n);
  }
}