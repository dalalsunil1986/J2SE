//SupDemo3.java
class Bc
{
	void op(int x,int y)//-----(1)
	{
		System.out.println("op()-------Bc-------original");
		int z=x+y;
		System.out.println("Sum in Bc="+z);
	}
}//Bc
class Ibc extends Bc
{
	void op(int x,int y)//---------(2)
	{
		super.op(x,y);//control goes to (3)
		System.out.println("op()------Ibc--------overridden");
		int z=x-y;
		System.out.println("Sub in Ibc="+z);
	}
}//Ibc
class Dc extends Ibc
{
	void op(int x1,int x2)//-----------(1)
	{
		super.op(x1,y1);//control goes to (2)
		System.out.println("op()-----Dc-----overridden");
		int z=x1*y1;
		System.out.println("mul in Dc="+z);
	}
}//Dc
class SupDemo3 
{
	public static void main(String[] args) 
	{
		Dc do1=new Dc();
		   do1.op(10,20);//control goes to (1)
	}
}
