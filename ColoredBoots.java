import java.util.Scanner;

public class ColoredBoots
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // inputs
    int size = sc.nextInt();
    String first  = sc.next();
    String second = sc.next();
    //change all the strings to int
    int[] firstToInt = new int[size];
    for (int i = 0; i < size; i++)
    {
      firstToInt[i] = (int)(first.charAt(i));
    }
    int[] secondToInt = new int[size];
    for (int i = 0; i < size; i++)
    {
      secondToInt[i] = (int)(second.charAt(i));
    }
    // sort them
    // '?' = 63 so always in front
    Arrays.sort(firstToInt);
    Arrays.sort(secondToInt);
    // matching process:from end to start
    
  }
}