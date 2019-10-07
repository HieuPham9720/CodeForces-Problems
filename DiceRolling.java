import java.util.Scanner;

public class DiceRolling
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    for (int i = 0; i < test; i++)
    {
      int input = sc.nextInt();
      System.out.println(input / 7 + 1);
    }
  }
}