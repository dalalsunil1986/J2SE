//Hyd.java
class Hyd
{
	void disp3()
	{
		Hyd.disp2(); // Rule--------4
		System.out.println("disp3()-----instance");
	}
	void disp1()
	{
		disp3(); // RULE--------2
		System.out.println("disp1()-------instance");
	}
	static void disp2()
	{
		System.out.println("disp2()-----static");
	}
	public static void main(String[] args) 
	{
		System.out.println("i am from main()----beg");
		Hyd h=new Hyd();
			h.disp1(); // RULE----3
			  disp2(); // RULE----1
		System.out.println("i am from main()----end");
	}
}//Hyd-----class
