import java.util.Scanner;
public class ChechNoEqualOrNot
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print(sc);
        System.out.print("\nInput first number :");
        int n = sc.nextInt();
        System.out.print("Input second number :");
        int m = sc.nextInt();
        System.out.print("Input third number :");
        int o = sc.nextInt();
        if(n == m && n == o)
        {
            System.out.print("All numbers are equal");
        }
        else if((n==m)||(n==o)||(o==m))
        {
            System.out.print("Neitherr all are equal or different");
        }
        else 
        {
            System.out.print("All numbers are different");
        }
    }   
}
