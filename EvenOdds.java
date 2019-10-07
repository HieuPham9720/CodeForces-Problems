import java.util.Scanner;

public class EvenOdds{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    long n = Long.parseLong(scanner.next());
    long k = Long.parseLong(scanner.next());
    // if the total number is even
    if (n % 2 == 0){
      if (k <= n/2)
        System.out.println(2*k - 1);
      else
        System.out.println(2*(k - n/2));
    }
    // if the total number is odd
    else{
      if (k <= n/2 + 1)
        System.out.println(2*k - 1);
      else
        System.out.println(2*(k - n/2 - 1));
    }
  }
}