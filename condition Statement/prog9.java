import java.util.Scanner;
public class prog9 
{
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print(sc);
		System.out.print("\nEnter The Five Subject Marks :");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		int tot = m1+m2+m3+m4+m5;
		float per = tot/5;
		System.out.println("Total :"+tot);
		System.out.println("Percentage :"+per);	
		if(per>=90)
			System.out.println("Grade A");
		else if(per>=80)
			System.out.println("Grade B");
		else if(per>=70)
			System.out.println("Grade C");
		else if(per>=60)
			System.out.println("Grade D");
		else if(per>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}
    
