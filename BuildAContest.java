import java.util.Scanner;

public class BuildAContest
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int need = sc.nextInt();
    int size = sc.nextInt();
    int[] test = new int[size];
    for (int i = 0; i < size; i++)
    {
      test[i] = sc.nextInt();
    }
    // boolean to check the number of porblem of i-th difficulty is created
    int[] created = new int[need];
    int i = 0;
    int satisfy = 0;
    // check through every tests
    while (i < size)
    {
      while (satisfy < need && i < size)
      {
        if (created[test[i] - 1] == 0)
        {
          satisfy++;
        }
        created[test[i] - 1]++;
        if (satisfy < need)
        {
          System.out.print("0");
        }
        i++;
      }
      if (satisfy == need)
      {
        System.out.print("1");
      }
      satisfy = 0;
      for (int j = 0; j < need; j++)
      {
        created[j]--;
        if (created[j] > 0)
        {
          satisfy++;
        }
      }
    }
  }
}