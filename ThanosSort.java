import java.util.Scanner;

public class ThanosSort
{
  //helper method: runs the Thanos sort
  // start and end are index we are running
  public static int thanosSort(int[] a, int start, int end)
  {
    // base case: if 2 index are at the same point
    if (start == end)
    {
      return 1;
    }
    // check if this part is sorted
    boolean sorted = true;
    for (int i = start; i < end; i++)
    {
      if (a[i] > a[i + 1])
      {
        sorted = false;
      }
    }
    if (sorted)
    {
      return end - start + 1;
    }
    else
    {
      return Math.max(thanosSort(a, start, (start+end) / 2), thanosSort(a, (start+end)/2 + 1, end));
    }
  }
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] input = new int[size];
    for (int i = 0; i < size; i++)
    {
      input[i] = sc.nextInt();
    }
    System.out.println(thanosSort(input, 0, input.length - 1));
  }
}