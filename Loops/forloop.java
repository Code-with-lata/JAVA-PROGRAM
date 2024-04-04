public class forloop {
    public static void main(String[]args)
    {
        int i=1, sum=0;
        for(i=5;i<=10;)
        {
            if(i>10) break;
            sum += i++;

        }
        System.out.println("sum = " +sum);
    } 
}
