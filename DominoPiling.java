import java.util.Scanner;

public class DominoPiling{
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int m = Integer.parseInt(scanner.next());
    int n = Integer.parseInt(scanner.next());
    System.out.println(m*n/2);
  }
  
}