import java.util.Scanner;

public class ArrayStabilization
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] numbers = new int[size];
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    int indexMax = 0;
    int indexMin = 0;
    //read the array and find the min max
    for (int i = 0; i < numbers.length; i++)
    {
      numbers[i] = sc.nextInt();
      if (numbers[i] > max1)
      {
        max1 = numbers[i];
        indexMax = i;
      }
      if (numbers[i] < min1)
      {
        min1 = numbers[i];
        indexMin = i;
      }
    }
    for (int i = 0; i < numbers.length; i++)
    {
      if (numbers[i] > max2 && i != indexMax)
        max2 = numbers[i];
      if (numbers[i] < min2 && i != indexMin)
        min2 = numbers[i];
    }
    int instability = 0;
    if (max2 - min1 > max1 - min2)
      instability = max1 - min2;
    else 
      instability = max2 - min1;
    // print the result;
    if (size == 2)
      System.out.println(0);
    else
      System.out.println(instability);
  }
}
