//Version-I
class Mul
{
	int a,b,c;
	public static void main(String[] args) 
	{
		Mul m=new Mul();
		m.a=10;
		m.b=20;
		m.c=m.a*m.b;
		System.out.println("val of a="+m.a);
		System.out.println("val of b="+m.b);
		System.out.println("val of c="+m.c);
		m.a=5;
		m.b=6;
		m.c=m.a*m.b;
		System.out.println("val of a="+m.a);
		System.out.println("val of b="+m.b);
		System.out.println("val of c="+m.c);
	}
}
