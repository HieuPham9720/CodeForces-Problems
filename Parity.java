import java.util.Scanner;

public class Parity 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int size = sc.nextInt();
    int[] digit = new int[size];
    int remainder = 0;
    for (int i = 0; i < size; i++)
    {
      digit[i] = sc.nextInt();
      if (i < size - 1)
      {
        remainder += ((digit[i] * base) % 2);
      }
      else
      {
        remainder += digit[i];
      }
    }
    if (remainder % 2 == 0)
    {
      System.out.println("even");
    }
    else 
    {
      System.out.println("odd");
    }
  }
}