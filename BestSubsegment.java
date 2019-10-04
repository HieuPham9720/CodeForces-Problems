import java.util.Scanner;

public class BestSubsegment
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] input = new int[size];
    int max = Integer.MIN_VALUE;
    for (int i = 0 ; i < size; i++)
    {
      input[i] = sc.nextInt();
      if (input[i] > max)
      {
        max = input[i];
      }
    }
    int maxSize = 1;
    for (int i = 0; i < size; i++)
    {
      int length = 0;
      while (i < size && input[i] == max)
      {
        length++;
        i++;
      }
      if (length > maxSize)
      {
        maxSize = length;
      }
    }
    System.out.println(maxSize);
  }
}