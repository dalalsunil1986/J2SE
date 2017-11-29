//Constructor.java
class Test 
{
	int a,b;
	test(int x,int y)
	{
		System.out.println("i am from test---DPC");
		a=x;
		b=y;
		System.out.println("val of a="+a);
		System.out.println("val of b="+b);
	}
}//Test

class TestDemo
{
	public static void main(String[] args) 
	{
		Test t1=new Test(10,20);
		Test t2=new Test(100,200);
	}
}//Testdemo
