import java.util.Scanner;
public class prog17 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(sc);
        System.out.println("**App for Basic Calculator**");
        System.out.println("--------------");
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("enter second no. :");
        int b = sc.nextInt();
        System.out.print("Enter Operater :");
        String operator = sc.next();
        switch(operator)
        {
            case "+":
            System.out.print("Your Addition result is :" +(a+b));
            break;
            case "-":
            System.out.print("Your substraction result is :" +(a-b));
            break;
            case "*":
            System.out.print("Your Multiplication result is :" +(a*b));
            break;
            case "/":
            System.out.print("Your Division result is :" +(a/b));
            break;
            default:
            System.out.print("operation is not recognising");
        }
    }
}
