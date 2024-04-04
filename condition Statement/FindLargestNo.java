import java.util.Scanner;
public class FindLargestNo 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(sc);
        System.out.print("\nEnter first no :" );
        int a=sc.nextInt();
        System.out.print("Enter second no :" );
        int b=sc.nextInt();
        System.out.print("Enter third no :" );
        int c=sc.nextInt();
        if((a>b) && (b>c))
        {
            System.out.println("Largest no " +a);
        }
        else if(b>c)
        {
            System.out.println("largest no " +b);
        }
        else{
            System.out.println("largest no " +c);
        }
    }  
}
