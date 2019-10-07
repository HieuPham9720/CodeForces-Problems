import java.util.Scanner;

public class Watermelon extends Object{
  
  public static void main(String[] args){
    // A Scanner to read input
    Scanner scanner = new Scanner(System.in);
    // A string to store the only input
    String input = scanner.next();
    // An int that is the integer representation of the input string
    int w = Integer.parseInt(input);
    if (w % 2 == 1 || w == 2) System.out.println("NO");
    else System.out.println("YES");
  }
}