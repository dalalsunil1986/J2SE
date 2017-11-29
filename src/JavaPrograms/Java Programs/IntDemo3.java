//IntDemo3.java
interface I1
{
void f1();
}
interface I2 extends I1
{
void f2();
}
abstract class c1
{
void f3()
{
}
}//c1----Abstract Concrete Class
abstract class c2 extends c1 implements I2
{
public void f1()
{
System.out.println("f1()----def-----c2");
}
void f3()
{
System.out.println("f3()---def----c2");
}
//Since we are not defining f2(),so that class c2 must be made as abstract
}//c2----abstract derived class
class c3 extends c2
{
public void f2()
{
System.out.println("f2()---def-----c3");
}
public void f1()
{
System.out.println("f1()----overridden----c3");
}
void f3()
{
System.out.println("f3()----overridden-----c3");
}
void f4()
{
System.out.println("f4()----Special----c3");
}
}//c3----Concrete Derived Class
class IntDemo3
{
public static void main(String[] args)
{
System.out.println("w.r.t c3-----DOC");
c3 o3=new c3(); // indirect object
o3.f1();
o3.f2();
o3.f3();
o3.f4();
System.out.println("w.r.t c2-----Dynamic Binding");
// c2 o2=new c2(); invalid bcoz c2 is abstract
c2 o2=new c3();
o2.f1();
o2.f2();
o2.f3();
// o2.f4(); invalid bcoz f4() does not exists in c2
System.out.println("w.r.t c1---Dynamic Binding");
//
//
c1.o1=new c3(); // indirect object
o1.f3();
/* o1.f1(); invalid bcoz f1(),f2() and f3() does not exists in c1
     o1.f2();
     o1.f4();      */
System.out.println("w.r.t I2----Dynamic Binding");
//
//
I2 io2=new c3(); // indirect object
io2.f1();
io2.f2();
/*---------------
-----------*/
System.out.println("w.r.t I1-----Dynamic Binding");
//
//
//
i1 io1=new c3(); // indirect object
io1.f1();
/*io1.f2((); invalid 
    io1.f3(();
    io1.f4();     */
}
}





















