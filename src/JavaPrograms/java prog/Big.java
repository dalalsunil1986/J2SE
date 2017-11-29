package bp;
import java.util.*;
public class Big
{
	int a,b,c;
	public Big readValues()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter first value");
		a=Integer.parseInt(s.nextLine());
		System.out.println("enter second value");
		b=Integer.parseInt(s.nextLine());
		System.out.println("enter third value");
		c=Integer.parseInt(s.nextLine());
		return this;
	}
	public LinkedList findBig()
	{
		LinkedList ll=new LinkedList();
		if((a==b)&&(b==c)&&(c==a))
		{
			ll.add("ALL VALUES ARE EQUAL");
		}
		else
		{
			int big=a;
			if(b>big)
			{
				big=b;
			}
			if(c>big)
			{
				big=c;
			}
			ll.add("val of a="+a);
			ll.add("val of b="+b);
			ll.add("val of c="+c);
			ll.add("biggest="+big);
		}
		return ll;
	}
	public static void dispResult(LinkedList ll)
	{
		System.out.println(".................");
		System.out.println("RESULT");
		System.out.println("................");
		Iterator itr=ll.iterator();
		while(itr.hasNext());
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
		System.out.println("................");
	}
}



