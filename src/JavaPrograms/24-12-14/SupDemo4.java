//SupDemo4.java
class Bc
{
	int a;
	Bc()//----------------(2)
	{
	System.out.println("base---Dc");
	a=10;
	System.out.println("val of a from Bc="+a);
	}
}//Bc
class Dc extends Bc
{
	int b;
	Dc()
	{
	//super();//optional----control goes to (2)
	System.out.println("derived---Dc");
	b=20;
	System.out.println("val of b from Dc="+b);
	}
}//Dc
class SupDemo4
{
	public static void main(String[] args) 
	{
	Dc do1=new Dc();//control goes to (1)	
	}
}//SupDemo5