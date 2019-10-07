import java.util.Scanner;

public class ImportantExam
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    String[] answer = new String[n];
    for (int i = 0; i < n; i++)
    {
      answer[i] = sc.next();
    }
    int[] point = new int[m];
    for (int i = 0; i < m; i++)
    {
      point[i] = sc.nextInt();
    }
    int best = 0;
    // run through all the question 
    for (int i = 0; i < m; i++)
    {
      // A = 65
      int[] num = new int[5];
      int max = 0;
      // run through all student
      for (int j = 0; j < n; j++)
      {
        num[answer[j].charAt(i) - 65]++; 
        if (num[answer[j].charAt(i) - 65] > max)
        {
          max = num[answer[j].charAt(i) - 65];
        }
      }
      best += max * point[i];
    }
    System.out.println(best);
  }
}