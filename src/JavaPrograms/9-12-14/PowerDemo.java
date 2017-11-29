//PowerDemo.java
class Power
{
	int x,n;
		void set(int p,int q)
		{
		x=p;
		n=q;
		}
		void calPower()
		{
		int i=1;
		int y=1;
		while(i<=n)
		{
		y=y*x;
		i++;
		}
		System.out.println("power("+x+","+n+")=+y");
		}
}//power---BLC

class PowerDemo
{
	public static void main(String[] args) 
	{
		if(args.length!=2)
		{
		System.out.println("Plz enter two values");
		}
		else
		{
			int x1=Integer.parseInt(args[0]);
			int x2=Integer.parseInt(args[1]);
				Power p=new Power();
					  p.set(x1,x2);
					  p.calPower();
		}//else
	}//main()
}//PowerDemo---ELC
