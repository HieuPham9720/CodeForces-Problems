import java.util.Scanner;

public class SalemAndSticks
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] stick = new int[size];
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < size; i++)
    {
      stick[i] = sc.nextInt();
      if (stick[i] > max)
      {
        max = stick[i];
      }
    }
    int t = 0;
    int total;
    int result = 0;
    int min = Integer.MAX_VALUE;
    for (int i = 1; i <= max; i++)
    {
      total = 0;
      for (int j = 0 ; j < size; j++)
      {
        // find the minimum case
        int test = Integer.MAX_VALUE;
        if (Math.abs(stick[j] - i) < test)
        {
          test = Math.abs(stick[j] - i);
        }
        if (Math.abs(stick[j] - i - 1) < test)
        {
          test = Math.abs(stick[j] - i - 1);
        }
        if (Math.abs(stick[j] - i + 1) < test)
        {
          test = Math.abs(stick[j] - i + 1);
        }
        total += test;
      }
      if (total < min)
      {
        min = total;
        result = total;
        t = i;
      }
    }
    System.out.println(t + " " + result);
  }
}