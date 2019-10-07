import java.util.Scanner;

public class YuhaoAndAParenthesis
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] balance = new int[size];
    String[] brackets = new String[size];
    for (int i = 0; i < size; i++)
    {
      brackets[i] = sc.next();
      for (int j = 0; j < brackets[i].length(); j++)
      {
        if (brackets[i].charAt(j) == '(')
        {
          balance[i]--;
        }
        else
        {
          balance[i]++;
        }
      }
      // check if it is possible to make a pair with the string
      // for example, it is not possible to create a pair with ")("
      int openCount = 0;
      int closeCount = 0;
      // test from the front
      boolean front = false;
      for (int j = 0; j < brackets[i].length(); j++)
      {
        if (brackets[i].charAt(j) == '(')
        {
          openCount++;
        }
        else
        {
          closeCount++;
        }
        if (openCount < closeCount)
        {
          break;
        }
      }
      if (openCount < closeCount)
      {
        front = true;
      }
      //test from the back
      boolean back = false;
      openCount = 0;
      closeCount = 0;
      for (int j = brackets[i].length() - 1; j >= 0; j--)
      {
        if (brackets[i].charAt(j) == '(')
        {
          openCount++;
        }
        else
        {
          closeCount++;
        }
        if (openCount > closeCount)
        {
          break;
        }
      }
      if (openCount > closeCount)
      {
        back = true;
      }
      //check if not possible
      if (front && back)
      {
        balance[i] = Integer.MAX_VALUE;
      }        
    }
    // check for pair
    Arrays.sort(balance);
    int total = 0;
    // search for an opposite
    boolean[] used = new boolean[size];
    for (int i = 0; i < size - 1; i++)
    {
      pivot = size / 2;
      int save;
      while (balance[pivot] != balance[i])
      {
        if (balance[pivot] > balance[i])
        {
          pivot = (size + pivot) / 2;
        }
        else
        {
          pivot = size
        }
      }
    }
    System.out.println(total);
  }
}