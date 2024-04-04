import java.util.Scanner;
public class prog11 
{
    public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print(sc);    
       System.out.print("\nEnter the character : ");
       char ch=sc.next().charAt(0);  
       if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
       {
            System.out.print(" is an Alphabet " +ch);
       }
       else
       {
            System.out.print(" is not an Alphabet " +ch);
       }
    }   
}
    

