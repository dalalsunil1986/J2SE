//TestDemo2.java
class Test
{
	int a,b;
	Test(int x,int y)
	{
		a=x;
		b=y;
	}
}//test
class TestDemo2
{
	public static void main(String[] args) 
	{
		Test t1=new Test(10,20);
		Test t2=t1;//multiple objects of same class with samereference
		t1.a=t1.a+1;
		t1.b=t1.b+1;
		System.out.println("val of t1(Modified)");
		System.out.println("val of t1="+t1.a);// 11
		System.out.println("val of t1="+t1.b);// 21
		System.out.println("val of t2(Extracting)");
		System.out.println("val of t2="+t2.a);// 11
		System.out.println("val of t2(Extracting)");// 21
		t2.a=t2.a+1;
		t2.b=t2.b+1;
		System.out.println("val of t2(Modified)");
		System.out.println("val of a of t2="+t2.a);// 12
		System.out.println("val of b of t2="+t2.b);// 22
		System.out.println("val of t1(Extracting)");
		System.out.println("val of t1="+t1.a);
		System.out.println("val of t1(Extracting)");
	}
}
