import java.util.Scanner;

public class YouAreGivenTwoBinaryStrings
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    for (int i = 0; i < test; i++)
    {
      /**
       * Algo: Try to make the furthest '1' bit to the right most match
       * If the '1' bits match, adding f(x) and f(y) at that position will create a '0' bit
       * and in reverse, it would be more lexicographically minimal
       * On the other hand, 2^k is represented as 1000...0 
       * -> multiplying by 2^k will push the '1' bit to the left
       * Example: 11 * 10 = 110 -> 11 is pushed to the left by one '0' digit.
       */
      
      // the 1st binary string
      String x = sc.next();
      // the second binary string
      String y = sc.next();
      // int to store the location of the furthest '1' from the right of the 2nd input
      // Need to find placeY before placeX 
      // case of 10001000 and 1100000
      int placeY = 1;
      while (y.charAt(y.length() - placeY) != '1')
      {
        placeY++;
      }
      // int to store the location of the furthest '1' from the right of the 1st input
      int placeX = placeY;
      while (x.charAt(x.length() - placeX) != '1')
      {
        placeX++;
      }
      // k = # of '0' that need to be added = placeX - placeY
      System.out.println(placeX - placeY);
    }
  }
}