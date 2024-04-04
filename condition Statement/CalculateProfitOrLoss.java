import java.util.Scanner;
public class CalculateProfitOrLoss
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner (System.in);
        System.out.print(sc);
        System.out.print("\nEnter the cost price : ");
        double cp = sc.nextDouble();
        System.out.print("Enter the selling price : ");
        double sp = sc.nextDouble();
        if(sp<cp) 
        {
            System.out.print("loss : " +(cp-sp));
        }
        else if(sp>cp) 
        {
            System.out.print("profit : " +(sp-cp));
        }
        else
        {
            System.out.print("No Profit No Loss");
        }
    }
}