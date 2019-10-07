import java.util.Scanner;

public class TheatreSquare extends Object{
  
  /**
   * Returns the number of flagstones needed to fill a certain distance
   * @param n the given length (either the length or the width of the Square)
   * @param a the length of the side of the flagstones
   * @return the number of flagstone
   */ 
  public static long fit(int n, int a){
    // a long that is the final result
    long total = 0;
    if (n % a == 0) total = total + (n / a);
    else total = total + (n / a + 1);
    return total;
  }
  
  public static void main(String[] args){
    // a Scanner to read the input
    Scanner scanner = new Scanner(System.in);
    // an int to store the width of the Square 
    int squareWidth = Integer.parseInt(scanner.next());
    // an int to store the length of the Square
    int squareLength = Integer.parseInt(scanner.next());
    
    int flagstoneSize = Integer.parseInt(scanner.next());
    System.out.println(TheatreSquare.fit(squareWidth, flagstoneSize) * TheatreSquare.fit(squareLength, flagstoneSize));
  }
  
}