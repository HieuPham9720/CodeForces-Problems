import java.util.Scanner;

public class DuffAndMeat{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    // number of days to feed
    int n = scanner.nextInt();
    // amount of needed meat on the day
    int[] meat = new int[n + 1];
    // the price of the meat on the day
    int[] price = new int[n + 1];
    // the minimum price
    int minPrice = 100;
    // the total meat needed
    int totalMeat = 0;
    // th optimized price
    int finalPrice = 0;
    // read the input
    for (int i = 0; i < n; i++){
      meat[i] = Integer.parseInt(scanner.next());
      price[i] = Integer.parseInt(scanner.next());
      if (price[i] < minPrice)
        minPrice = price[i];
    }
    // solve
    price[n] = Integer.MAX_VALUE;
    meat[n] = 0;
    for (int i = 0; i < n; i++){
      int save = price[i];
      int count = 0;
      totalMeat = 0;
      while (i < n && price[i + 1] > save)
      {
        count++;
        totalMeat += meat[i];
        i++;
      }
      totalMeat += meat[i];
      if (count > 0)
      {
        finalPrice += save * totalMeat;
      }
      else
      {
        finalPrice += meat[i] * price[i];
      }
      //System.out.println(finalPrice + " " + count);
    }
    System.out.println(finalPrice);
  }
  
}