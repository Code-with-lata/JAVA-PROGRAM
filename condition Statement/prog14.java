import java.util.Scanner;
public class prog14 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in); 
    System.out.print(sc);    
    System.out.print("\nEnter the character for find case : d");
    char ch=sc.next().charAt(0);
    if(ch>=65 && ch<=90)
    {
        System.out.println(ch+" is an upper case letter ");
    }
    else if(ch>=97 && ch<=122)
    {
        System.out.println(ch+" is a lower case letter ");
    }
    else
    {
        System.out.println(ch+" is not an Alphabets ");
    }
    }
}

    

