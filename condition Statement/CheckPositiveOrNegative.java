import java.util.Scanner;
public class CheckPositiveOrNegative 
{
        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(sc);
        System.out.print("\nInput a number: ");
        int n = sc.nextInt();
        if (n > 0)
        {
            System.out.print("Number is positive");
        }
        else if (n < 0)
        {
            System.out.print("Number is negative");
        }
        else
        {
            System.out.print("Number is zero");
        }    
    }
}   
    
    
    

