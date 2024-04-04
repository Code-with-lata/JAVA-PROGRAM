public class array1
{
    static int[] sum(int []ar, int []br)
    {
        int cr[] = new int [Math.max(ar.length,br.length)];
        for(int i=0;i<ar.length;i++){
            cr[i]=ar[i]+br[i];
        }
        return cr;
           
    }
    public static void main(String[] args)
    {
        int tr[] = sum(new int[]{1,2,5,6},new int[]{3,5,6,8});
        for(int i:tr){
           System.out.println(" " + i);
        }
    }
    
}
