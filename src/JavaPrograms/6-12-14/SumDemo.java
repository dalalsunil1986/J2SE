//SumDemo.java
class Sum 
{
	int a,b,c;
	void set(int x,int y)
	{
		a=x;
		b=y;
	}
	void add()
	{
		c=a+b;
	}
	void disp()
	{
		System.out.println("val of a="+a);
		System.out.println("val of b="+b);
		System.out.println("val of c="+c);
	}
}//Sum---BLC
class SumDemo
{
	public static void main(String[] args)
	{
		if(args.length!=2)
		{
			System.out.println("plz enter two values");
		}
		else
		{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			Sum s=new Sum();
			s.set(x,y);
			s.add();
			s.disp();
		}//else
	}//main()
}//SumDemo---ELC






	
