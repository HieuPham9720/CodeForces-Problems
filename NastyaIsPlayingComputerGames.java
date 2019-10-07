import java.util.Scanner;

public class NastyaIsPlayingComputerGames
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int start = sc.nextInt();
    // move to toss
    int toss = 0;
    // move to walk
    int walk = 0;
    // move to collect
    int collect = 0;
    if (start == 1 || start == n)
    {
      toss = n + 1;
      walk = n - 1;
      collect = n;
    }
    else
    {
      int choice = Math.min(start - 1, n - start);
      toss = n + 1;
      walk = choice + n - 1;
      collect = n;
    }
    System.out.println(toss + walk + collect);
  }
}