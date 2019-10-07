import java.util.Scanner;

public class NNAndTheOpticalIllusion
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int need = sc.nextInt();
    int radius = sc.nextInt();
    double halfAngle = (2 * Math.PI / need) * 0.5;
    // math
    System.out.println(radius / (1 / Math.sin(halfAngle) - 1));
  }
}