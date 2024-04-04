import java.util.Scanner;

public class prog15 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print(sc);
        System.out.print("\nEnter the length  of the rectangle::");
        int l = sc.nextInt();
        System.out.print("Enter the width of thr rectangle ::");
        int w = sc.nextInt();
        int area;
    	area = l * w;
        int per;
        per= 2*(l + w);
        System.out.println("Area of rectangle = " + area + " units");
        System.out.println("Perimeter of a Rectangle =" + per + "units");
        if (area>per)
        System.out.println("Area of a Rectangle is Greater Then Its Perimetre");
    else
        System.out.println("Perimetre of a Rectangle is Greater Then Its Area");

    }
}

