import java.util.Scanner;
public class prog0
{

    public static void main(String [] args)
    {
   
        Scanner sc= new Scanner(System.in);
        System .out.print(sc);
        System.out.print("Principal:");
        int p=sc.nextInt();
        System.out.print("Time :");
        int t=sc.nextInt();
        System.out.print("Rate of Interest :");
        int r=sc.nextInt();
        float SI =(p*t*r)/100;
        System.out.print("Simple Interest is :" +(SI));

    }
    
}
