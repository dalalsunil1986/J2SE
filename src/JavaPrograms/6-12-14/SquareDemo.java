//SquareDemo.java
class Square 
{
	int n;
	void set(int x)
	{
		n=x;
	}
	void calculate()
	{
		int res=n*n;
		System.out.println("Square{"+n+"}="+res);
	}
}//Square---ELC
class SquareDemo
{
	public static void main(String[] args) 
	{
		if(args.length!=1)
		{
		System.out.println("enter one value");
		}
		else
		{
			int n=Integer.parseInt(args[0]);
			Square s=new Square();
			s.set(n);
			s.calculate();
		}//else
	}//main()
}//SquareDemo


	

