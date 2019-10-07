import java.util.Scanner;

public class Snowball
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int weight = sc.nextInt();
    int height = sc.nextInt();
    int firstStoneW = sc.nextInt();
    int firstStoneH = sc.nextInt();
    int secondStoneW = sc.nextInt();
    int secondStoneH = sc.nextInt();
    while (height > 0)
    {
      weight = weight + height;
      if (height == firstStoneH)
      {
        weight = weight - firstStoneW;
      }
      if (height == secondStoneH)
      {
        weight = weight - secondStoneW;
      }
      if (weight < 0)
      {
        weight = 0;
      }
      height--;
    }
    System.out.println(weight);
  }
}