public class prog2 {
    public static void main (String[]args)
    {
        int num = 531, rev=0;
        int sum = 0;
        int mul = 1;
        for(int i=0;i<num;i++)
        {
            int r =num%10;
            sum= sum+num;
            mul = mul*num;
            rev =r*10+num;


        }
        System.out.print("sum " +sum);
        System.out.print("rev" +rev);
        System.out.print("mul " +mul);
    }
    
}
