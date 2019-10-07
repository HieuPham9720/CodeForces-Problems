import java.util.Scanner;

public class ZuhairAndStrings
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int need = sc.nextInt();
    String input = sc.next();
    // index is int value of lower case characters
    int[] result = new int[123];
    for (int i = 0; i < input.length(); i++)
    {
      int count = 0;
      int start = i;
      for (int j = 0; j < need && i < input.length(); j++)
      {
        if (input.charAt(start + j) == input.charAt(start))
        {
          count++;
          i++;
        }
        else
        {
          break;
        }
      }
      i--;
      if (count == need)
      {
        result[input.charAt(start)]++;
      }
    }
    int max = 0;
    for (int i = 97; i <= 122; i++)
    {
      if (result[i] > max)
      {
        max = result[i];
      }
    }
    System.out.println(max);
  }
}