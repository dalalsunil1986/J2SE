class Sathya
{
	void disp1()
	{
		System.out.println("sathya--disp1()--instance");
	}//void
	static void disp2()
	{
		System.out.println("sathya--disp2()--static");
	}//static
}//sathya
class SathyaDemo
{
	public static void main(String args[])
	{
		System.out.println("i am from main--Beg");
		Sathya s1=new Sathya();
				    s1.disp2();
				Sathya.disp2();
		System.out.println("i am from main--end");
	}
}//Sathya Demo--ELC

