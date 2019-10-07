import java.util.*;

public class Tape
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt();
    int length = sc.nextInt();
    int tape = sc.nextInt();
    int[] broken = new int[total];
    int[] distance = new int[total - 1];
    for (int i = 0; i < total; i++)
    {
      broken[i] = sc.nextInt();
      if (i > 0)
      {
        distance[i - 1] = broken[i] - broken[i - 1];
      }
    }
    Arrays.sort(distance);
    // solve
    // smallest tape length is one tape for each broken segment
    int result = total;
    int index = 0;
    while (total > tape)
    {
      result = result - 1 + distance[index];
      total--;
      index++;
    }
    System.out.println(result);
  }
}
