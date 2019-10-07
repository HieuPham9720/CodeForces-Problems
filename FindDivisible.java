import java.util.Scanner;

public class FindDivisible
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    for (int i = 0; i < test; i++)
    {
      int left = sc.nextInt();
      int right = sc.nextInt();
      System.out.println(left + " " + (left * 2));
    }
  }
}