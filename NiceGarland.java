import java.util.Scanner;

public class NiceGarland
{
  private static String arrange(char a, char b, char c, String input)
  {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < input.length(); i++)
    {
      if (i % 3 == 0)
      {
        result.append(a);
      }
      else if (i % 3 == 1)
      {
        result.append(b);
      }
      else
      {
        result.append(c);
      }
    }
    return result.toString();
  }
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String input = sc.next();
    // all possible arrangement:
    String[] possible = new String[6];
    //RGB
    possible[0] = arrange('R', 'G', 'B', input);
    //RBG
    possible[1] = arrange('R', 'B', 'G', input);
    //BGR
    possible[2] = arrange('B', 'G', 'R', input);
    //BRG
    possible[3] = arrange('B', 'R', 'G', input);
    //GBR
    possible[4] = arrange('G', 'B', 'R', input);
    //GRB
    possible[5] = arrange('G', 'R', 'B', input);
    int min = Integer.MAX_VALUE;
    int save = 0;
    for (int i = 0; i < 6; i++)
    {
      int change = 0;
      for (int j = 0; j < input.length(); j++)
      {
        if (possible[i].charAt(j) != input.charAt(j))
        {
          change++;
        }
      }
      if (change < min)
      {
        min = change;
        save = i;
      }
    }
    System.out.println(min);
    System.out.println(possible[save]);
  }
}