import java.util.Scanner;
public class array3 {
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
        System.out.println("the number of post");
        int post=sc.nextInt();
        System.out.print("print the like");
        int like[]=new int[post];
        for(int i =0;i<post;i++){
            like[i]=sc.nextInt();
        }
        int postno=0;
        int count=0;
        for(int i=0;i<like.length;i++){
            if(count<like[i]){
                count=like[i];
             }
            postno=i;
            
        }
        System.out.println(count);
        System.out.println("post" +postno);
        int count2=0;
        System.out.print("print the comment");
        int comment[]=new int[post]; 
        for(int i =0;i<post;i++){
            comment[i]=sc.nextInt();
        }

        for(int i=0;i<comment.length;i++){
            if(count2<comment[i]){
                count2=comment[i];
            }
            postno=i;
        } 
        System.out.println(count2);
        System.out.println("post" +postno);
    }

}    

