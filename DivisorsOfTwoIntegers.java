import java.util.*;

public class DivisorsOfTwoIntegers
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] divisor = new int[size];
    int max = Integer.MIN_VALUE;
    int save = 0;
    for (int i = 0; i < size; i++)
    {
      divisor[i] = sc.nextInt();
      if (divisor[i] > max)
      {
        max = divisor[i];
        save = i;
      }
    }
    /*
     * Find all the divisor of max and count them out
     **/
    ArrayList<Integer> ofMax = new ArrayList<Integer>();
    for (int i = 1; i <= max; i++)
    {
      if (max % i == 0)
      {
        ofMax.add(i);
        //System.out.print(i + " ");
      }
    }
    boolean[] checkMax = new boolean[ofMax.size()];
    boolean[] check = new boolean[size];
    for (int i = 0; i < size; i++)
    {
      if (ofMax.contains(divisor[i]) && !checkMax[ofMax.indexOf(divisor[i])])
      {
        checkMax[ofMax.indexOf(divisor[i])] = true;
        check[i] = true;
      }
    }
    int second = 1;
    for (int i = 0; i < size; i++)
    {
      if (!check[i] && divisor[i] > second)
      {
        second = divisor[i];
      }
    }
    System.out.println(max + " " + second);
  }
}