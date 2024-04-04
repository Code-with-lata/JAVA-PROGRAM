import java.util.Scanner;
public class array2
{
     public static void main(String[] args)
      {
          int[][] arr1 = new int[3][3];
          arr1[0][0] =1;
          arr1[0][1] =2;
          arr1[0][2] =3;
          arr1[1][0] =4;
          arr1[1][1] =5;
          arr1[1][2] =6;
          arr1[2][0] =7;
          arr1[2][1] =8;
          arr1[2][2]=9;
          //for(int i=0;i<arr1.length;i++)
          //{
            //for(int j=0;j<arr1[i].length;j++)
            //{
              //   System.out.println("Enter arr1["+(i+1)+"]+["+(j+1)+"] :");
                // arr1[i][j]= sc.nextInt();
            //}
          //}
             for(int i=0;i<arr1.length;i++)
             {
               for(int j=0;j<arr1[i].length;j++)
               {
                System.out.println(" " +arr1[i][j]);
               }

                System.out.println();
        }   
        }
}
    

