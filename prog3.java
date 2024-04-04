import java.util.Scanner;
public class prog3
{
    public static void main(String[] args) 
    {
        System.out.print("Enter 3 integers :");
        Scanner sc = new Scanner(System.in);
        System.out.print(sc);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("The sum of 3 integers is: " +(a+b+c));
    }
    
}
