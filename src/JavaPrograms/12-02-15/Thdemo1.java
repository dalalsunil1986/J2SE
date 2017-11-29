//Thdemo1.java
class Thdemo1
{
public static void main(String[] args)
{
Thread t1=Thread.CurrentThread();
System.out.println("default threads="+1);//Thread[main,5,main]
String dfgt=t1.getName();
System.out.println("default FGT="+dfgt);//main
ThreadGroup tgp=t1.getthreadgroup();
System.out.println("Thread group name="+tgp);//ThreadGroup[name=main]
boolean state=t1.isAlive();
System.out.println("exec status of default threads="+state);//true
Thread t2=new Thread();//new state
String pfgt=t2.getname();
System.out.println("name of programmer FGT="+pfgt);//Thread..()
Thread state ts=t2.getstate();
System.out.println("state name of t2="+ts);
boolean state1=t2.isAlive();
System.out.println("exec status of t2="+state1);//false
System.out.println("val of max ri="+Thread.MAX_PRIORITY);//10
System.out.println("val of min pri="+Thread.MIN_PRIORITY);//1
System.out.println("val of norm pri="+Thread.NORM_PRIORITY);//115
}
}
