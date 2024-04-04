import java.util.Scanner;
public class prog10 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print(sc);
        System.out.print("\nEnter the sides of the triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("The triangle is equilateral.");
        } else if (a == b || b == c || c == a) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    }
}
    

