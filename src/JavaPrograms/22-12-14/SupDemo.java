//SupDemo.java
class Bc
{
	int a;

}//Bc
class Dc extends Bc
{
	int a,c;
	void Set(int x,int y);
	{
	super.a=x;
	this.a=y;
	}//Set
void add()
{
	c=super.a+this.a;
}//add
void disp()
	{
	System.out.println("val of a from Bc="+super.a);
	System.out.println("val of a from Dc="+this.a);
	System.out.println("val of c="+c);
	}
}//Dc		
class SupDemo1 
{
	public static void main(String[] args) 
	{
		Dc do1=new Dc();
		do1.Set(10,20);
		do1.add();
		do1.disp();
	}
}//-----SupDemo1-------main method
