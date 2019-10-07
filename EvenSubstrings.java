import java.util.Scanner;

public class EvenSubstrings
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String input = sc.next();
    int sum = 0;
    for (int i = 0; i < input.length(); i++)
    {
      if (input.charAt(i) % 2 == 0)
      {
        sum += (i + 1);
      }
    }
    System.out.println(sum);
  }
}