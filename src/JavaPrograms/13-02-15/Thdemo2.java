//Thdemo2.java
class  Th1 extends Thread
{
public void run()
{
for(int i=1;i<10;i++)
{
System.out.println("val of i in run()="+i);
}
}//run()
}//Th1----BLC
class Thdemo2
{
public static void main(String[] args)
{
Th1 t1=new Th1();//new state
System.out.println("exec status of t1 after start="+t1.isAlive());
try
{
t1.join();
}catch(InterruptedException ie)
{
System.out.println("prob in thread exec....");
}
System.out.println("exec status of t1 after completion="+t1.isAlive());
}
}