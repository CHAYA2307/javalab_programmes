import java.util.*;
public class prime {
    public static boolean isprime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;

        }return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        boolean found=false;
        for(int i=2;i<=a/2;i++){
            if(isprime(i) && isprime(a-i)){
                 System.out.println(a+"can be expressed a sum of two prime"+i+" "+(a-i));
           found=true;
        }

        }
        if(!found){
            System.out.println("cant be expressed");
        }
        
    }
}
