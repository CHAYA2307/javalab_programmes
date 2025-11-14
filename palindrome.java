import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        boolean found=true;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)) found=false;
            l++;
            r--;
        }
        if(found){
            System.out.println("palindrome");
        }else
        System.out.println("not an palindrome");

    }
}
