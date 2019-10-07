import java.util.Scanner;

public class Postcard
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     String input = sc.next();
     int need = sc.nextInt();
     /**
       * Check for cane and snowflake
       * '?' = 63
       * '*' = 42
       */
     int letterCount = 0;
     int caneCount = 0;
     int flakeCount = 0;
     for (int i = 0 ; i < input.length(); i++)
     {
       // if cane
       if (input.charAt(i) == '?')
       {
         caneCount++;
       }
       else if (input.charAt(i) == '*')
       {
         flakeCount++;
       }
       else
       {
         letterCount++;
       }
     }
     int min = letterCount - flakeCount - caneCount;
     int max = letterCount;
     if (flakeCount > 0)
     {
       max = Integer.MAX_VALUE;
     }
     // check if it's possible
     if (need < min || need > max)
     {
       System.out.println("Impossible");
     }
     else
     {
       StringBuilder result = new StringBuilder();
       /* Case 1: if the string has enough letter */
       if (letterCount == need)
       {
         for (int i = 0; i < input.length(); i++)
         {
           if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
           {
             result.append(input.charAt(i));
           }
         }
       }
       /* Case 2: if the string has too many letters */
       if (letterCount > need)
       {
         int index = 0;
         // remove until done
         while (letterCount > need)
         {
           // if it's a letter
           if (input.charAt(index) >= 'a' && input.charAt(index) <= 'z')
           {
             // if it cannot be removed
             if (input.charAt(index + 1) != '?' && input.charAt(index + 1) != '*')
             {
               result.append(input.charAt(index));
             }
           }
           // if it's a cane or a flake -> remove
           else
           {
             letterCount--;
           }
           index++;
         }
         //add the rest
         while (index < input.length())
         {
           if (input.charAt(index) >= 'a' && input.charAt(index) <= 'z')
           {
             result.append(input.charAt(index));
           }
           index++;
         }
       }
       /* Case 3: if the string has too little letter */
       if (letterCount < need)
       {
         int index = 0;
         //search for the first flake
         while (input.charAt(index) != '*')
         {
           if (input.charAt(index) >= 'a' && input.charAt(index) <= 'z')
           {
             result.append(input.charAt(index));
           }
           index++;
         }
         // duplicate the letter before the flake
         while (letterCount < need)
         {
           result.append(input.charAt(index - 1));
           letterCount++;
         }
         index++;
         //add the rest
         while (index < input.length())
         {
           if (input.charAt(index) >= 'a' && input.charAt(index) <= 'z')
           {
             result.append(input.charAt(index));
           }
           index++;
         }
       }
       System.out.println(result);
     }
  }
}