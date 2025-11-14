import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
System.out.println("enter two values of a numbers ");
int a=s.nextInt();
int b=s.nextInt();
System.out.println("enter the option 1-add 2-sub 3-mul 4-div");
int opt=s.nextInt();
switch(opt){
    case 1:
    System.out.println(a+b);
    break;
    case 2:
    System.out.println(a-b);
    break;case 3:
    System.out.println(a*b);
    break;case 4:
    System.out.println(a/b);
    break;
default:
System.out.println("invalid input");
}
    }
}
