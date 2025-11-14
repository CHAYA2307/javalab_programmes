import java.util.*;
public class quadraticeq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
double a=sc.nextInt();
double b=sc.nextInt();
 double c=sc.nextInt();
double dis=Math.pow(b,2)-(4*a*c);
double r1,r2;

if(dis>0){
     r1=(-b+Math.sqrt(dis))/2*a;
     r2=(-b-Math.sqrt(dis))/2*a;
     System.out.println(r1+" "+r2);
}
if(dis==0){
    r1=-b/2*a;
    r2=r1;
     System.out.println(r1+" "+r2);
}
if(dis<0){
    System.out.println("imaginary roots");
}


        
    }
}
