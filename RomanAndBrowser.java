import java.util.Scanner;

public class RomanAndBrowser
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int distance = sc.nextInt();
    int[] type = new int[size];
    for (int i = 0; i < size; i++)
    {
      type[i] = sc.nextInt();
    }
    //
    int[] test = new int[size];
    int max = Integer.MIN_VALUE;
    for (int i = 0 ; i < distance; i++)
    {
      for (int j = 0; j < size; j++)
      {
        test[j] = type[j];
      }
      int start = i;
      while (start < size)
      {
        test[start] = 0;
        start += distance;
      }
      int study = 0;
      int chat = 0;
      for (int j = 0; j < size; j++)
      {
        if (test[j] == 1)
        {
          study++;
        }
        if (test[j] == -1)
        {
          chat++;
        }
      }
      if (Math.abs(study - chat) > max)
      {
        max = Math.abs(study - chat);
      }
    }
    System.out.println(max);
  }
}