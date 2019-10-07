import java.util.Scanner;

public class Elephant
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    if (size % 5 == 0)
    {
      System.out.println((size / 5));
    }
    else
    {
      System.out.println((size / 5 + 1));
    }
  }
}