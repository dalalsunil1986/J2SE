//SupDemo5.java
class Bc
{
	int a;
	Bc(int a)//----------------(2)
	{
	System.out.println("base---Pc");
	this.a=a;
	System.out.println("val of a from Bc="+this.a);
	}
}//Bc
class Dc extends Bc
{
	int b;
	Dc(int a,int b)//-------------(1)
	{
	super(a);//mandatory-----control goes to (2)
	System.out.println("derived---Dc");
	this.b=b;
	System.out.println("val of b from Dc="+this.b);
	}
}//Dc
class SupDemo5
{
	public static void main(String[] args) 
	{
	Dc do1=new Dc(100,200);//control goes to (1)	
	}
}//SupDemo5