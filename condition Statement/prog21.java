import java.util.Scanner;
public class prog21 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(sc);
      	System.out.print("\nEnter a character : ");
	    char ch=sc.next( ).charAt(0);
    
        switch (ch) 
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
    
