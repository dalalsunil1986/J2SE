//TD.java
class Tree
{
	static int mangoes=10;
	int apple;
	Tree()
	{	
	apple=1;
	}
}//Tree
class TD 
{
	public static void main(String[] args) 
	{
		Tree t1=new Tree();
		Tree t2=new Tree();
		System.out.println("without modi of t1.t2");
		System.out.println("no. of mangoes of t1="+t1.mangoes);// 10
		System.out.println("no. of apples of t1="+t1.apple);// 1
		System.out.println("no. of mangoes of t2="+t2.mangoes);// 10
		System.out.println("no. of apples of t2="+t2.apple);// 1
//Modification
		System.out.println("with modi of t2");
t2.mangoes=t2.mangoes+2;
t2.apple=t2.apple+2;
		System.out.println("no. of mangoes of t1="+t1.mangoes);// 12
		System.out.println("no. of apples of t1="+t1.apple);// 13
		System.out.println("no. of mangoes of t2="+t2.mangoes);// 12
		System.out.println("no. of apples of t2="+t2.apple);// 13
	}
}//TD