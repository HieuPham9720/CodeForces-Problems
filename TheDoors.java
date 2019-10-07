import java.util.Scanner;

public class TheDoors 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] open = new int[size];
    int lastLeft = 0;
    int lastRight = 0;
    for (int i = 0; i < size; i++)
    {
      open[i] = sc.nextInt();
      if (open[i] == 1)
      {
        lastRight = i + 1;
      }
      else
      {
        lastLeft = i + 1;
      }
    }
    System.out.println(Math.min(lastLeft, lastRight));
  }
}