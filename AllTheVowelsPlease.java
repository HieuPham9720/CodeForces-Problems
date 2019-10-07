import java.util.Scanner;

public class AllTheVowelsPlease
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    char[] vowel = {'a', 'e', 'i', 'o', 'u'};
    int k = sc.nextInt();
    boolean check = false;
    int row = 1;
    int column = 1;
    // find divisor greater than 5
    for (int i = 5; i <= k/5; i++)
    {
      if (k % i == 0 && k / i >= 5)
      {
        check = true;
        row = i;
        column = k / i;
      }
    }
    if (!check)
    {
      System.out.println(-1);
    }  
    else
    {
      StringBuilder result = new StringBuilder();
      //System.out.println(column + " " + row);
      for (int i = 0; i < k; i++)
      {
        //append the vowel
        if (column == 5)
        {
          result.append(vowel[(i % column + i / column) % 5]); 
        }
        else
        {
          result.append(vowel[i % 5]);
        }
      }
      System.out.println(result.toString());
    }
  }
}