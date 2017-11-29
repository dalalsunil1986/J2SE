//AMSDemo.java
class AMS
{
	int n,on;
	void set(int x)
	{
		n=x;
	}
	String decide()
	{
		int s=0;
		on=n;
		while(n>0)
		{
			int d=n%10;
			s=s+d*d*d;
			n=n/10;
		}
		if(s==0)
		return"armstrong";
		else 
		return"not armstrong";
	}
	void disp()
	{
		String res=decide();
		{
			System.out.println(on+"is"+res);
		}
	}
}//AMS---BLC

class AMSDemo
{  
	public static void main(String[] args) 
	{
		if(args.length!=1)
		{
		System.out.println("Plz enter one value");
		}
		else
		{
			int x=Integer.parseInt(args[0]);
				AMS a=new AMS();
			a.set(x);
			a.disp();
		}//else
	}//main()
}//AMSDemo---ELC
	

