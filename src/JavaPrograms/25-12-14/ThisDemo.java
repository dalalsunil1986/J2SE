//ThisDemo.java
class Test
{
	int a,b;
	Test()//-------------------(2)
	{
	this(100);//control goes to (3)
	System.out.println("Test---Dc");
	a=10;
	b=20;
	System.out.println("val of a="+a);
	System.out.println("val of b="+b);
	}//Test()
	Test(int x)//---------------(3)
	{
	System.out.println("Test--------Spc");
	a=b=x;
	System.out.println("val of a="+a);
	System.out.println("val of b="+b);
	}//Test(x)
	Test(int a,int b)//-----------(1)
	{
	this();//control goes to (2)
	this.a=a;
	this.b=b;	
	System.out.println("val of a="+this.a);
	System.out.println("val of b="+this.b);
	}//Test(_,_)
}//Test--------class	
class ThisDemo
{
	public static void main(String[] args) 
	{
	Test t1=new Test(10,20);//control goes to (1)
	}
}
