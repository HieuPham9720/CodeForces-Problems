import java.util.Scanner;

public class KefaAndFirstSteps
{
  private static final int MAX_SIZE = 100000;
  private static int[] input = new int[MAX_SIZE];
  private static int[] dp = new int[MAX_SIZE];
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int arrayLength = sc.nextInt();
    int max = 1;
    for (int i = 0; i < arrayLength; i++)
    {
      input[i] = sc.nextInt();
      dp[i] = 1;
    }
    for (int i = 1; i < arrayLength; i++)
    {
      if (input[i] >= input[i - 1])
        dp[i] = dp[i - 1] + 1;
      if (dp[i] > max)
        max = dp[i];
    }
    System.out.println(max);
  }
  
}