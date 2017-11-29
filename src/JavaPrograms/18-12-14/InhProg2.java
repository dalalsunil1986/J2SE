//InhProg2.java
import java.Util.Scanner;
class Univ
{
	private String uname.loc;
	Scanner s=new scanner(System.in);
	void getUniv Details()
	{
		System.out.println("Enter Univ Name");
		uname=s.nextLine();
		System.out.println("Enter Univ Loc");
		loc=s.nextLine();
	}
	void putUniv Details()
	{
	System.out.println("==================");
	System.out.println("University Details");
	System.out.println("==================");
	System.out.println("uname+"       "+loc);
	System.out.println("==================");
	}
}//Univ
class UGC extends Univ
{
	String course.cname;
	void getUGC Details()
	{
		getUniv Details();
	System.out.println("Enter college Name");
		cname=s.nextLine();
	System.out.println("Enter UG course Name");
		course=s.nextLine();
	}
	void putUGC Details()
	{
		putUniv Details();
	System.out.println("==================");
	System.out.println("UG Course Details");
	System.out.println("==================");
	System.out.println("cname+"  "+course");
	System.out.println("==================");
	}
}//UGC
//Like UGC class we can also write PGC class
class  Inhprog2
{
	public static void main(String[] args) 
	{
		UGC uo=new UGC();
		uo.getUGC Details();
		uo.putUGC Details();
//Like UGCclass methods calling we can also call class PGC class methods	
	}
}//InhProg2