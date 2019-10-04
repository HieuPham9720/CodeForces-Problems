import java.util.Scanner;

public class BePositive
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] input = new int[size];
    for (int i = 0; i < size; i++)
    {
      input[i] = sc.nextInt();
    }
    int max = Integer.MIN_VALUE; 
    for (int j = -1000; j <= 1000; j++)
    {
      int count = 0;
      if (j != 0)
      {
        for (int i = 0; i < size; i++)
        {
          double divide = input[i] / j;
          if (divide > 0)
          {
            count++;
          }
        }
      }
      double extra = size;
      if (count >= Math.ceil(extra / 2) && max < j)
      {
        max = j;
      }
    }
    if (max == Integer.MIN_VALUE)
    {
      max = 0;
    }
    System.out.println(max);
  }
}