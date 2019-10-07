import java.util.Scanner;

public class LunarNewYearAndCrossCounting
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String[] matrix = new String[size];
    int count = 0;
    for (int i = 0; i < size; i++)
    {
      matrix[i] = sc.next();
    }
    for (int i = 1; i < size - 1; i++)
    {
      for (int j = 1; j < size - 1; j++)
      {
        if (matrix[i].charAt(j) == 'X'
           && matrix[i - 1].charAt(j - 1) == 'X'
           && matrix[i + 1].charAt(j - 1) == 'X'
           && matrix[i - 1].charAt(j + 1) == 'X'
           && matrix[i + 1].charAt(j + 1) == 'X')
        {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}