import java.util.*;

public class PetrAndACombinationLock
{
  private static int size;
  private static int[] turn = new int[size];
  private static ArrayList<Integer> sum = new ArrayList<Integer>();
  private static int count ;
  
  public static void addFrom(int index)
  {
    count = Math.getExponent(index + 1);
    if (count < size)
    {
      sum.set(index * 2 + 1, sum.get(index) + turn[count]);
      sum.set(index * 2 + 2, sum.get(index) - turn[count]);
      addFrom(index * 2 + 1);
      addFrom(index * 2 + 2);
    }
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    boolean check = false;
    // read the input
    size = sc.nextInt();
    turn = new int[size];
    for (int i = 0; i < size; i++)
    {
      turn[i] = sc.nextInt();
    }
    // make a big enough arraylist
    for (int i = 0; i < Math.pow(2, size + 1) - 1; i++)
    {
      sum.add(0);
    }
    // start to do addition and subtraction
    addFrom(0);
    for (int i = (int)(Math.pow(2, size)) - 1; i < (int)(Math.pow(2, size + 1)) - 1; i++)
    {
      if (sum.get(i) % 360 == 0)
      {
        check = true;
      }
    }
    if (check)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}