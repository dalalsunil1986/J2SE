//SD2.java
class Sample1
{
	static
	{
		System.out.println("i am from static block---Sample1");
	}
	Sample1()
	{
		System.out.println("Sample1---DC");
	}
}//Sample1

class SD2 
{
	static
	{
		System.out.println("SD2---static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("i am from main()----SD2");
		Sample1 s1=new Sample1();
		Sample1 s2=new Sample1();
	}
}
