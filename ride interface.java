import java.util.*;
interface ride{
public double calculatefare(double amount);
public String getridetype();
}
class mini implements ride{
  public  final double rate=10.0;
          @Override    
public double calculatefare(double distance){
    return 10*distance;
} @Override 
public String getridetype(){
    return " mini";
}
}

class Prime implements ride{
    final double rate=12.0;
  @Override            
public double calculatefare(double distance){
    return rate*distance;
 } @Override 
public String getridetype(){
    return " Prime";
}
}

class SUV implements ride{
    final double rate=15.0;
             @Override 
public double calculatefare(double distance){
    return rate*distance;
} @Override 
public String getridetype(){
    return " SUV";
}
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-mini,2-prime,3-suv");
int c=sc.nextInt();
switch (c) {
    case 1:
        mini m=new mini();
        System.out.println("enter distance");
        double d=sc.nextDouble();
        System.err.println(m.calculatefare(d));
        System.out.println(m.getridetype());

        break;

       
        case 2:
       Prime pr=new Prime();
        System.out.println("enter distance");
        double d2=sc.nextDouble();
        System.out.println(pr.calculatefare(d2));
        System.out.println(pr.getridetype());

        break;
        case 3:
     SUV s=new SUV();
        System.out.println("enter distance");
        double d3=sc.nextDouble();
        System.out.println(s.calculatefare(d3));
        System.out.println(s.getridetype());

        break;
    default:
        throw new AssertionError();
}


    }
}
