import java.util.Scanner;

public class MinimumTriangulation
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    long result = 0;
    for (int i = 2; i < size; i++)
    {
      result += i * (i + 1);
    }
    System.out.println(result);
  }
}