import java.util.Scanner;

public class GridGame
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    // grid[row][column]
    int[][] grid = new int[4][4];
    for (int i = 0; i < input.length(); i++)
    {
      // if vertical: apply to the nearest vertical spot to the left
      if (input.charAt(i) == '0')
      {
        boolean found = false;
        while (!found)
        {
          for (int col = 0; col < 4; col++)
          {
            for (int row = 0; row < 3; row++)
            {
              if (grid[row][col] == 0 && grid[row + 1][col] == 0)
              {
                grid[row][col] = 1;
                grid[row + 1][col] = 1;
                found = true;
                System.out.println((row + 1) + " " + (col + 1));
                break;
              }
            }
            if (found)
            {
              break;
            }
          }
        }
      }
      // if horizontal: apply to the nearest horizontal spot from top
      if (input.charAt(i) == '1')
      {
        boolean found = false;
        while (!found)
        {
          for (int row = 0; row < 4; row++)
          {
            for (int col = 0; col < 3; col++)
            {
              if (grid[row][col] == 0 && grid[row][col + 1] == 0)
              {
                grid[row][col] = 1;
                grid[row][col + 1] = 1;
                found = true;
                System.out.println((row + 1) + " " + (col + 1));
                break;
              }
            }
            if (found)
            {
              break;
            }
          }
        }
      }
      // Delete:
      boolean[] delRow = new boolean[4];
      for (int j = 0; j < 4; j++)
      {
        delRow[j] = false;
      }
      boolean[] delCol = new boolean[4];
      for (int j = 0; j < 4; j++)
      {
        delCol[j] = false;
      }
      //delete row if needed
      for (int row = 0; row < 4; row++)
      {
        if (grid[row][0] == 1 && grid[row][1] == 1 && grid[row][2] == 1 && grid[row][3] == 1)
        {
          delRow[row] = true;
        }
      }
      // delete col if needed
      for (int col = 0; col < 4; col++)
      {
        if (grid[0][col] == 1 && grid[1][col] == 1 && grid[2][col] == 1 && grid[3][col] == 1)
        {
          delCol[col] = true;
        }
      }
      // The actual delete
      for (int k = 0; k < 4; k++)
      {
        if (delRow[k])
        {
          for (int j = 0; j < 4; j++)
          {
            grid[k][j] = 0;
          }
        }
        if (delCol[k])
        {
          for (int j = 0; j < 4; j++)
          {
            grid[j][k] = 0;
          }
        }
      }
    }
  }
}
