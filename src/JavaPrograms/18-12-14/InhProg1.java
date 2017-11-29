//InhProg1.java
class Bc
{
	int a;
	void disp()
	{
		System.out.println("base----disp()");
	}
}//Bc
class Dc extends Bc
{
	int b;
	void show()
	{
		System.out.println("derived---show()");
	
	a=10;
	b=20;
	System.out.println("val of a from Bc="+a);
	System.out.println("val of b from Dc="+b);
	}
}//Bc
class InhProg1
{
	public static void main(String[] args) 
	{
		System.out.println("w.t.t Dc");
		Dc d1=new Dc();
		d1.disp();
		d1.show();
		System.out.println("w.t.t Bc");
		Bc b1=new Bc();
		b1.disp();
	//b1.show();invalid 
	}
}