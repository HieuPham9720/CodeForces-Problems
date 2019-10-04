import java.util.Scanner;
import java.util.PriorityQueue;

public class Brutality
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int combo = sc.nextInt();
    int limit = sc.nextInt();
    int[] dam = new int[combo];
    for (int i = 0; i < combo; i++)
    {
      dam[i] = sc.nextInt();
    }
    String input = sc.next();
    long dmg = 0;
    for (int i = 0; i < input.length(); i++)
    {
      int count = 1;
      dmg += dam[i];
      PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
      while (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1))
      {
        heap.add(dam[i]);
        count++;
        i++;
        dmg += dam[i];
      }
      heap.add(dam[i]);
      while (heap.size() > limit)
      {
        dmg -= heap.poll();
      }
    }
    System.out.println(dmg);
  }
}