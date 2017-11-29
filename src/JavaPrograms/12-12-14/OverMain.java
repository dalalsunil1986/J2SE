//OverMain.java
class OverMain
{
	public static void main(int x)//.....(1)
	{
		System.out.println("main()....taking var of int");
		main("sathya");//control goes to (3)
	}
	public static void main(String[] args)//---(2)
	{
		System.out.println("main()....taking array of objects of string class");
		main(10);//control goes to (1)
	}
	public static void main(String s)//....(3) 
	{
		System.out.println("main()....taking var of string class");
	}
}//OverMain
