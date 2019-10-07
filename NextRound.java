import java.util.Scanner;

public class NextRound extends Object{
  
  public static void main(String[] args){
    //a Scanner to read the input
    Scanner scanner = new Scanner(System.in);
    // an int to store the number of competitors
    int n = Integer.parseInt(scanner.next());
    // an int to store the place that everybody has to pass
    int k = Integer.parseInt(scanner.next());
    // an int to store the score of a participant
    int score;
    // an int to store the score at the kth place
    int scoreAtKth = 0;
    // an int to store the output
    int numFinalist = 0;
    for (int i = 0; i < n; i++){
      score = Integer.parseInt(scanner.next());
      if (i == k - 1) scoreAtKth = score;
      if (i <= k - 1 && score != 0) numFinalist++;
      else if (score == scoreAtKth && score != 0) numFinalist++; 
    }
    System.out.println(numFinalist);
  }
  
}