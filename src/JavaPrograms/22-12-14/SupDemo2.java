//SupDemo2.java
class Bc
{
	void disp()
	{
		System.out.println("base---disp()");
	}
}//Bc
class Dc extends Bc
{
	void disp()
	{
		System.out.println("derived-----disp()");
		super.disp();//will call super class disp(() from the context of Dcclass
		disp();
	}
}//Dc
class SupDemo2 
{
	public static void main(String[] args) 
	{
		Dc do1=new Dc();
		do1.disp();
	}
}//-----SupDemo2-------main method
