import java.util.Scanner;
import java.util.LinkedList;

public class BookQueries
{
  
  private static int numQueries;
  private static String type;
  private static int element, travel;
  private static LinkedList<Integer> list = new LinkedList<Integer>();
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    numQueries = sc.nextInt();
    for (int i = 0; i < numQueries; i++)
    {
      type = sc.next();
      element = sc.nextInt();
      if (type.equals("L"))
        list.addFirst(element);
      else if (type.equals("R"))
        list.addLast(element);
      else
      {
        for(travel = 0; travel < list.size(); travel++)
        {
          if (list.get(travel) == element)
            break;
        }
        if (travel < list.size() - travel - 1)
          System.out.println(travel);
        else System.out.println(list.size() - travel - 1);
      }
    }
  }
}