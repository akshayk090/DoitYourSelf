import java.util.Scanner;
public class MinNum {

 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + small(x, y, z)+"\n" );
    }

   public static double small(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }
}