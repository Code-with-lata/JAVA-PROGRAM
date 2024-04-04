import java.util.Scanner;
public class CheckEvenOrOdd 

{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print(sc);
    System.out.print("\nEnter any number :");
    int n= sc.nextInt();
    if(n%2==0)
    {
        System.out.println("Even no");
    }
    else
    {
        System.out.print("Odd no");

    }

  }  
}
