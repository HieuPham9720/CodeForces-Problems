import java.util.Scanner;

public class StonesOnTheTable
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String input = sc.next();
    int total = 0;
    for (int i = 0;  i < size; i++)
    {
      char save = input.charAt(i);
      while (i < size - 1 && input.charAt(i + 1) == save)
      {
        total++;
        i++;
      }
    }
    System.out.println(total);
  }
}