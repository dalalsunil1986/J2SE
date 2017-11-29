//Exam.java
class Bc
{
	Bc()//----------------(1)
	{
	super();
	System.out.println("Bc----Dc");
	}
}//Bc
class Ibc extends Bc
{
	Ibc()//--------(2)
	{
	super();//optional----control goes to (3)
	System.out.println("Ibc-----Dc");
	}
}//Ibc
class Dc extends Ibc
{
	Dc()//-------------(1)
	{
	super();//optional-------control goes to (2)
	System.out.println("Dc-----Dc");
	}
}//Dc
class Exam
{
	public static void main(String[] args)
	{
		Dc do1=new Dc();//control goes to (1)
	}
}