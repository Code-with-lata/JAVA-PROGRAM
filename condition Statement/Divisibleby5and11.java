import java.util.Scanner;
public class Divisibleby5and11
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print(sc);
       System.out.print("\nEnter any number to check whether it is divisible by 5 or 11 :");
       int n =sc.nextInt();
       if((n%5 == 0) && (n%11 == 0))
       {
        System.out.print(("Given no " +n+ "is Divisible by 5 and 11"));
       }
       else
       {
        System.out.print("Given no " +n+ "is not Divisible by 5 and 11");
       }
    }
    
}
