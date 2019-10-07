import java.util.Scanner;
import java.util.Arrays;

public class HelpfulMaths
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    int index = 0;
    int[] summan = new int[input.length() / 2 + 1];
    for (int i = 0; i < input.length(); i = i + 2)
    {
      summan[index] = (int)(input.charAt(i)) - 48;
      index++;
    }
    Arrays.sort(summan);
    index = 0;
    for (int i = 0; i < input.length(); i++)
    {
      if (i % 2 == 0)
      {
        System.out.print(summan[index]);
        index++;
      }
      else
      {
        System.out.print("+");
      }
    }
    System.out.println();
  }
}