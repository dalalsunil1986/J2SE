//MulDemo4.java
import java.util.Scanner;
class Mul
{
	void table()
	{
		System.out.println("Enter a value");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<=0)
		{
			System.out.println(n+"is invalid,enter +ve val");
		}
		else
		{
			System.out.println("=========================");
			System.out.println("Multiplication table for"+n);
			System.out.println("=========================");
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+"*"+i+"="+(n*i));
			}
			System.out.println("=========================");
		}//else
	}//Table()
}//Mul----------BLC

class MulDemo 
{
	public static void main(String[] args) 
	{
		Mul m=new Mul();
		m.table();
	}
}//MulDemo------ELC
