import java.util.Scanner;

public class VovaAndTrain
{
  private static int numOfTests;
  private static int length, distance, left, right; //L, v, l, r
  private static int totalLan, blockedLan;
  
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    numOfTests = scanner.nextInt();
    for (int i = 0; i< numOfTests; i++)
    {
      length = scanner.nextInt();
      distance = scanner.nextInt();
      left = scanner.nextInt();
      right = scanner.nextInt();
      if (left % distance != 0)
        left = left + (distance - left % distance);
      if (right % distance != 0)
        right = right - right % distance;
      totalLan = length / distance;
      blockedLan = (right - left)/distance + 1;
      System.out.println(totalLan- blockedLan);
    }
  }
}