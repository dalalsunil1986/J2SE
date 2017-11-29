//PackDemo3.java
import p1.C1;
class PackDemo3
{
public static void maim(String[] args)
{
System.out.println("w.r.t C2");
C2 o2=new C2();
     o2.f1();
     o2.f2();
     o2.f3();
System.out.println("w.r.t C1");
C1 o1=new P1.C2();
     o1.f1();
System.out.println("w.r.t I1");
P1.I1 io1=new P1.C2();
         io1.f2();
System.out.println("w.r.t I2");
P1.I2 io2=new P1.C2();
         io2.f3();
}
}