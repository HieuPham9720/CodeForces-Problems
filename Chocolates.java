import java.util.Scanner;

public class Chocolates 
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
    long sum = 0;
    // to store the amount bought the day before
    int bought = 0;
    for (int i = size - 1; i >= 0; i--)
    {
      // Greedy: always buy full the last one
      if (i == size - 1)
      {
        sum += input[i];
        bought = input[i];
      }
      // 
      else if (bought != 0)
      {
        if (input[i] >= bought - 1)
        {
          sum += (bought - 1);
          bought--;
        }
        else
        {
          sum += input[i];
          bought = input[i];
        }
      }
      //System.out.println(bought);
    }
    System.out.println(sum);
  }
}