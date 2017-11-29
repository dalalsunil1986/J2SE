//TestDemo5.java
class Test
{
	int a,b;
	Test(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void disp(Test x)//-----Formal Object
	{
		System.out.println("val of a of t1="+a);
		System.out.println("val of b of t1="+b);
		System.out.println("val of a of t2="+a);
		System.out.println("val of b of t2="+b);
	}
}//Test
class Testdemo5 
{
	public static void main(String[] args) 
	{
		Test t1=new Test(10,20);
		Test t2=new Test(100,200);
	}
}
