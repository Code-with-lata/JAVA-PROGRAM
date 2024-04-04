public class pattern4
{
    public static void main(String[]args)
    {
        for(int i=1; i<=5; i+=2)
        {
            for(int j=i;j<5;j++)
            {
                if(j>5-i)
                    System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            System.out.println("* ");
            System.out.println();
        }
    }
    
}
