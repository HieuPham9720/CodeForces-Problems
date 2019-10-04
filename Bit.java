import java.util.Scanner;

public class Bit
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int line = sc.nextInt();
    int result = 0;
    String input = new String();
    for (int i = 0; i < line; i++)
    {
      input = sc.next();
      if (input.charAt(2) == '+' || input.charAt(0) == '+')
      {
        result++;
      }
      else
      {
        result--;
      }
    }
    System.out.println(result);
  }
}