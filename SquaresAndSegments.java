import java.util.Scanner;

public class SquaresAndSegments
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int need = sc.nextInt();
    int result;
    if ((int)(Math.sqrt(need)) == Math.sqrt(need))
    {
      result = (int)(Math.sqrt(need) * 2);
    }
    else
    {
      if (((int)Math.pow((int)Math.sqrt(need), 2) + (int)Math.pow((int)Math.sqrt(need) + 1, 2))/2 < need)
      {
        result = (int)(Math.sqrt(need) + 1) * 2; 
      }
      else
      {
        result = (int)(Math.sqrt(need)) * 2 + 1;
      }
    }
    System.out.println(result);
  }
}