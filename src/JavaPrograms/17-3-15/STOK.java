//STOK.java
import java.util.StringTokenizer;
import java.util.Scanner;
class STOK
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any Text");
	String text=s.nextLine();
	System.out.println("Enter the delimeter to getTokens");
	String del=s.nextLine();
	StringTokenizer st=new StringTokenizer("text.del");
	int not=st.countTokens();
	System.out.println(not);
		while(st.hasMoreTokens())
		{
		String tk=st.nextToken();
		System.out.println(tk);
		}//while
	}//main()-------main method
}//class------STOK