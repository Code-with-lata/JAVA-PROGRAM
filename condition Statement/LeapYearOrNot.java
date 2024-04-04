import java.util.Scanner;
public class LeapYearOrNot 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(sc);
        System.out.print("\nEnter the year do you want to check :");
        int year = sc.nextInt();
        if(year%400 ==0)
           {
                System.out.print(" is a leap year "  +year);
           }
        else if(year%100==0)
            {
                System.out.print("is not a leap year " +year);
            }
        else if(year%4 == 0)
            {
                System.out.print("is a leap year " +year);
            }
        else
            {
                System.out.print("is Not a leap year " +year);
            }   
    }   
}
