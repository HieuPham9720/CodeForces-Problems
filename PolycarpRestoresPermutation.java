import java.util.Scanner;

public class PolycarpRestoresPermutation
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] dist = new int[size - 1];
    for (int i = 0; i < size - 1; i++)
    {
      dist[i] = sc.nextInt();
    }
    // check the distance between the i-th element and the first element
    int[] distFromStart = new int[size];
    distFromStart[0] = 0;
    // the permutation to construct
    int[] value = new int[size];
    // variable to find the min
    int min = 0;
    // varaibel to save the location of the '1' element
    int save = 0;
    // find the element with the smallest distance
    // that element would be 1
    for (int i = 1; i < size; i++)
    {
      distFromStart[i] = distFromStart[i - 1] + dist[i - 1];
      if (distFromStart[i] < min)
      {
        min = distFromStart[i];
        save = i;
      }
    }
    value[save] = 1;
    // construct the permutation from the '1' element;
    // left side of 1
    for (int i = save - 1; i >= 0; i--)
    {
      value[i] = value[i + 1] - dist[i];
    }
    // right side of 1
    for (int i = save + 1; i < size; i++)
    {
      value[i] = value[i - 1] + dist[i - 1];
    }
    // check if the array satisfy
    boolean check = true;
    boolean[] sat = new boolean[size];
    for (int i = 0; i < size; i++)
    {
      if (value[i] - 1 < size && value[i] > 0)
      {
        sat[value[i] - 1] = true;
      }
    }
    for (int i = 0; i < size; i++)
    {
      if (!sat[i])
      {
        check = false;
      }
    }
    if (!check)
    {
      System.out.println(-1);
    }
    else
    {
      // print result
      for (int i = 0; i < size; i++)
      {
        System.out.print(value[i] + " ");
      }
      System.out.println();
    }
  }
}