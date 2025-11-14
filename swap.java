
import java.util.Scanner;

public class swap {
   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int t=a;
        a=b;
        b=t;
         System.out.println("after swaping value is"+" "+a+" "+b);
       
    }
}
