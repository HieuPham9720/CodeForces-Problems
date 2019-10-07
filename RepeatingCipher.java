import java.util.Scanner;

class RepeatingCipher
{ 
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    String msg = sc.next();
    StringBuilder str = new StringBuilder();
    int count = 1;
    int counter = 0;
    while (counter < msg.length())
    {
      str.append(msg.charAt(counter));
      counter += count;
      count++;
    }
    System.out.println(str.toString());
  }
}