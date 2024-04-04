import java.util.*;

public class switchcase{

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int botton = sc.nextInt();

        switch(botton) {
            case(1) : System.out.println("Hellow");
            break;
            case(2) : System.out.println("namaste");
            break;
            case(3) : System.out.println("bolourt");
            break;
            default : System.out.println("Invalid");
        }


        sc.close();
    }
    
}
