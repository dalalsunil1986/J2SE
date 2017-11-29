//IntDemo.java
interface I1
{
	void f1(); // public abstract void f1()
}
interface I2
{
	void f2(); // public abstract void f2()
}
class c1 implements I1,I2
{
	public void f1()
	{
	System.out.println("f1()---defined---c1");
	}
	public void f2()
	{
	System.out.println("f2()---defined---c1");
	}
	void f3()
	{
	System.out.println("f3()---defined---c1");
	}
}//c1-----implementation class of f1 and f2
class IntDemo1
{
public static void main(String args[])
{
	System.out.println("w.r.t c1-----DOC");
	c1 o1=new c1(); // direct object
	o1.f1();
	o1.f2();
	o1.f3();
	System.out.println("w.r.t   I1-----Dynamic Binding");
	// I1 io1=new I1(); // invalid bcoz f1 is abstract
	I1 io1=new c1(); // indirect object
	    io1.f1();
/*io1.f2(); invalid bcoz f2() and f3() does not exists in f1
	io1.f3(); */	
 	System.out.println("w.r.t------Dynamic Binding");
// I2 io2=new f2(); invalid bcoz f2 is abstract
	I2 io2=new c1(); // indirect object
	io2.f2();
/*io2.f1(); invalid bcoz f1() and f2() does not exists in f2
	io2.f3() */
}
}