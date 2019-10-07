import java.util.Scanner;

public class DetectiveBook
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] solve = new int[size];
    for (int i = 0; i < size; i++)
    {
      solve[i] = sc.nextInt();
    }
    int day = 0;
    int toRead = 0;
    for (int i = 0; i < size; i++)
    {
      if (toRead < solve[i])
      {
        toRead = solve[i];
      }
      if ((i + 1) == toRead)
      {
        day++;
      }
    }
    System.out.println(day);
  }
}