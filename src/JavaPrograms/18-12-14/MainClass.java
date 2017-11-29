import java.lang.*;
class A
{
	int a;
	void dispA(){
		System.out.println("Hi......"+a);
	}
}
class B extends A
{
//	A aa = new A();
	int b;

void disp(){
	System.out.println("a+b = "+(a+b));
}
}


class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B bb = new B();
		bb.b=10;
		bb.a=20;
		bb.disp();
		bb.dispA();
//		System.out.println(	bb.a );

	}
}
