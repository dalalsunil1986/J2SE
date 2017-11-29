//Thdemo5.java
class Autoinc implements Runnable
{
public void run()
{
//Thread t20=Thread.currentThread()
//String str=t20.getName();
//OR
System.out.println("name of FGT in run()="+Thread.currentThread().getName());//sathya
int i=0;
try
{
while(true)
{
++i;
System.out.println("val of i="+i);
Thread.sleep(1000);
}//while
}catch(InterruptedException ie)
{
System.err.println("prob in thread exec...");
}
}//run()
}//Autoinc-----BLC
class Thdemo5
{
public static void main(String[] args)
{
Autoinc ao=new Autoinc();
//Runnable ao=new Autoinc();
//ao.start();Invalid
Thread t1=new Thread(ao,"sathya");
System.out.println("i am from main()---Name of FGT="+t1.getName());//sathya
t1.start();
}
}