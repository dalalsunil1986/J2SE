//Thdemo6.java
class AutoChar implements Runnable
{
String s="WELCOME TO JAVA";
AutoChar()
{
Thread t=new Thread(this);//here 'this' represents an object of current class which implements Runnable intf
t.start();
}
public void run()
{
try
{
for(int i=0;i<s.length;i++)
{
Char ch=s.charAt(i);
System.out.println("\t\t\t"+ch);
Thread.sleep(1000);
}
}catch(InterruptedException ie)
{
System.out.println("prob in thread exec...");
}
}//run()
}//AutoChar---BLC
class Thdemo6
{
public static void main(String[] args)
{
AutoChar ac=new AutoChar();
}
}