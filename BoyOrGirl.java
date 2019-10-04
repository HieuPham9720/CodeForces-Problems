import java.util.Scanner;

public class BoyOrGirl{

  public static void main(String[] args){
    boolean[] check = new boolean[200];
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    int count = 0;
    for (int i = 0; i < input.length(); i++){
      if (!check[input.charAt(i)]){
        count++;
        check[input.charAt(i)] = true;
      }
    }
    if (count % 2 == 0)
      System.out.println("CHAT WITH HER!");
    else
      System.out.println("IGNORE HIM!");
  }
  
}