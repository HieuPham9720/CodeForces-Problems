import java.util.Scanner;

public class Emotes
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    long total = sc.nextInt();
    long repeat = sc.nextInt();
    int[] input = new int[size];
    int indexMax = 0;
    long max = Integer.MIN_VALUE;
    // find the first max
    for (int i = 0; i < size; i++)
    {
      input[i] = sc.nextInt();
      if (input[i] > max)
      {
        max = input[i];
        indexMax = i;
      }
    }
    // find the second max
    long secondMax = Integer.MIN_VALUE;
    for (int i = 0; i < size; i++)
    {
      if (input[i] > secondMax && i != indexMax)
      {
        secondMax = input[i];
      }
    }
    
    long result = ((long)(max * repeat + secondMax) * (long)(total / (repeat + 1)))
                   + (long)(max * (total % (repeat + 1)));
    System.out.println(result);
  }
}