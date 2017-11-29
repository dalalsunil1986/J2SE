//MulDemo1.java
class Mul1
{
	int a,b,c;
	void accept()
	{
		a=10;
		b=20;
	}
	void multiply()
	{
		c=a+b;
	}
	void display()
	{
		System.out.println("val of a="+a);
		System.out.println("val of b="+b);
		System.out.println("val of c="+c);
	}
	public static void main(String[] args)
	{
	}
	
}//Mul1.....Business Logic Class
class MulDemo1
{
	public static void main(String[] args)//Execution logic Method
	{
		System.out.println("I am from main()....beg");
	Mul1 m=new Mul1();
	m.accept();
	m.multiply();
	m.display();
		System.out.println("I am from main()...end");
	}
}


