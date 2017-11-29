//RomanDemo.java
class Roman
{
	int n;
	void set(int x)
	{
		n=x;
	}
	void convert()
	{
		if(n<=0)
		{
			System.out.println("NO ROMAN Eqv...");
		}
		else
		{
		while(n>=1000)
		{
			System.out.println("M");
			n=n-1000;
		}
		if(n>=900)
		{
			System.out.println("CM");
			n=n-900;
		}
		if(n>=500)
		{
		System.out.println("D");
		n=n-500;
		}
		if(n>=400)
		{
		System.out.println("CD");
		n=n-400;
		}
		while(n>=100)
		{
		System.out.println("C");
		n=n-100;
		}
		if(n>=90)
		{
		System.out.println("XC");
		n=n-90;
		}
		if(n>=50)
		{
		System.out.println("L");
		n=n-50;
		}
		if(n>=40)
		{
		System.out.println("XL");
		n=n-40;
		}
		while(n>=10)
		{
		System.out.println("X");
		n=n-10;
		}
		if(n>=9)
		{
		System.out.println("IX");
		n=n-9;
		}
		if(n>=5)
		{
		System.out.println("V");
		n=n-5;
		}
		if(n>=4)
		{
		System.out.println("IX");
		n=n-4;
		}
		while(n>=1)
		{
		System.out.println("I");
		n=n-1;
		}
		}//else
	}//Convert()
}//Roman---BLC

class RomanDemo
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
		Roman r=new Roman();
			  r.set(x);
			  r.convert();
		}//else
	}//main()
}//RomanDemo	