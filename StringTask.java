import java.util.Scanner;

public class StringTask extends Object{
  
  public static String task(String s){
    String tmp = s.toLowerCase();
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < tmp.length(); i++){
      if (tmp.charAt(i) != 'a' && tmp.charAt(i) != 'o' && tmp.charAt(i) != 'e' &&
          tmp.charAt(i) != 'u' && tmp.charAt(i) != 'i' && tmp.charAt(i) != 'y'){
        builder.append('.');
        builder.append(tmp.charAt(i));
      }
    }
    return builder.toString();
  }

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    System.out.println(StringTask.task(input));
  }
}