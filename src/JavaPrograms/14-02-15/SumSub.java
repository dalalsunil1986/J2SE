//SumSub.java
import java.util.Scanner;
class Sum extends Thread
{
int a,b,c;
void set(int a,int b)
{
this.a=a;
this.b=b;
}
public void run()
{
c=a+b;
System.out.println("Sum="+c);
}
}//Sum-----BLC
class Sub implements Runnable
{
int a,b,c;
void set(int a,int b)
{
this.a=a;
this.b=b;
}
public void run()
{
c=a-b;
System.out.println("Sub="+c);
}
}//Sub---BLC
class SumSub
{
public static void main(String[] args)
{
//accept two values dynamically
Scanner s=new Scanner(System.in);
System.out.println("Enter First value");
int x1=Integer.parseInt(s.nextLine());
System.out.println("Enter Second value");
int x2=Integer.parseInt(s.nextLine());
//create threads for computing Sum and Sub
Sum s1=new Sum();
Sub s2=new Sub();
//set the values to threads
s1.set(x1,x2);
s2.set(x1,x2);
//dispatch the threads for computing Sum and Sub
s1.start();
//s2.start();Invalid
Thread s22=new Thread(s2);//Converting an object of Runnable intf into Thread class object.
s22.start();
//join the multiple threads as a single Unit
try
{
s1.join();
s22.join();
}catch(InterruptedException ie)
{
System.out.println("prob in thread exec...");
}
System.out.println("exec status of s1 after join()="+s1.isAlive());
System.out.println("exec status of s22 after join()="+s1.isAlive());
}
}
	