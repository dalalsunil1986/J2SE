//PNZDemo.java
class PNZ 
{
	int n;
	void set(int x)
	{
		n=x;
	}
	String decide()
	{
		String s="";
		if(n>0)
		{
			s="positive";
		}
		if(n<0)
		{
			s="Negative";
		}
		if(n==0)
		{
			s="ZERO";
		}
		return s;
	}//decide()
}//PNZ
class PNZDemo
{
	public static void main(String[] args)
	{
	if(args.length!=1)
	{
		System.out.println("plz enter one value");
	}
	else
	{
		int x=Integer.parseInt(args[0]);
			PNZ po=new PNZ();
		po.set(x);
		String res=po.decide();
		System.out.println(res);
	}//else
	}//main()
}//PNZDemo--ELC
