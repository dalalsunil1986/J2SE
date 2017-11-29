import java.util.*;
class  LL
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		System.out.println("content of ll="+ll);
		System.out.println("size of ll="+ll.size());
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println("content of ll="+ll);
		System.out.println("size of ll="+ll.size());
		ll.addFirst(10);
		ll.addLast(50);
		System.out.println("content of ll="+ll);
		System.out.println("size of ll="+ll.size());
		System.out.println("extract the data from ll....iterator()");
		Iterator itr=ll.iterator();
		int s=0;
		while(itr.hasNext())
		{
			Object obj=itr.next();
			Integer io=(Integer)obj;
			int x=io.intValue();
			s=s+x;
			System.out.println("\t\t"+x);
		}
		System.out.println("\t\t sum....iterator()="+s);
		System.out.println("...........................");
		System.out.println("extract the data from ll-toArray()");
		Object obj[]=ll.toArray();
		int s1=0;
		for(int i=0;i<obj.length;i++)
		{
			Integer io=(Integer)obj[i];
			int x=io.intValue();
			s1=s1+x;
			System.out.println("\t\t"+x);
		}
		System.out.println(".......................");
		System.out.println("\t\t sum toArray()="+s1);
		System.out.println("........................");
		System.out.println("extract the data from ll-list.iterator()-forward");
		ListIterator litr=ll.listIterator();
		while(litr.hasNext())
		{
			Object obj1=litr.next();
			System.out.println("\t\t"+obj1);
		}
		System.out.println("extract the data from ll-listiterator()..bd");
		int s2=0;
		while(litr.hasPrevious())
		{
			Object obj1=litr.previous();
			Integer io=(Integer)obj1;
			int x=io.intValue();
			System.out.println("\t\t="+x);
			s2=s2+x;
		}
		System.out.println("......................");
		System.out.println("\t\t sum-listiterator()="+s2);
		System.out.println("............................");
		System.out.println("extract the data from ll-randomly()");
		Object robj=ll.get(2);
		System.out.println("random element="+robj);
		System.out.println("............................");
	}

}
