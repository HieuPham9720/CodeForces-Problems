import java.util.Scanner;

public class MaximumContinuousRest
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] day = new int[size];
    for (int i = 0; i < size; i++)
    {
      day[i] = sc.nextInt();
    }
    int max = Integer.MIN_VALUE;
    int total = 0;
    // count rest streak from start
    for (int i = 0; i < size && day[i] == 1; i++)
    {
      total++;
    }
    // count rest streak from end
    for (int i = size - 1; i >= 0 && day[i] == 1; i--)
    {
      total++;
    }
    if (total > max)
    {
      max = total;
    }
    // check the array as normal
    for (int i = 0; i < size; i++)
    {
      total = 0; 
      while (i < size && day[i] == 1 )
      {
        total++; 
        i++;
      }
      if (total > max)
      {
        max = total;
      }
    }
    System.out.println(max);
  }
}