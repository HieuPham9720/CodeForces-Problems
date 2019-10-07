import java.util.*;

public class PowerOfTwo
{

  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int sum = sc.nextInt();
    int need = sc.nextInt();
    // change the first input to reversed binary
    int tmp = sum;
    int summans = 0;
    ArrayList<Integer> binary = new ArrayList<Integer>();
    while (tmp > 0)
    {
      if (tmp % 2 == 0)
        binary.add(0);
      else
      {
        binary.add(1);
        summans++;
      }
      tmp = tmp / 2;
    }
    for (int i = binary.size() - 1; i > 0 && summans < need; i--)
    {
      while (summans < need && binary.get(i) > 0)
      {
        binary.set(i, binary.get(i) - 1);
        binary.set(i - 1, binary.get(i - 1) + 2);
        summans++;
      }
      if (binary.get(i) == 0)
      {
        binary.remove(i);
      }
    }
    // if you have enough summans
    if (summans != need)
      System.out.println("NO");
    else
    {
      System.out.println("YES");
      for (int i = 0; i < binary.size(); i++)
      {
        for (int j = 0; j < binary.get(i); j++)
        {
          System.out.print((int)(Math.pow(2, i)) + " ");
        }
      }
      System.out.println();
    }
  }
}