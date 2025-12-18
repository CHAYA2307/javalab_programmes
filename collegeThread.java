public class collegeThread extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("BMSCE");
                Thread.sleep(10000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class deptThread extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class Threads{
    public static void main(String[] args){
        collegeThread t1=new collegeThread();
        deptThread t2=new deptThread();
        t1.start();
        t2.start();
    }
}
