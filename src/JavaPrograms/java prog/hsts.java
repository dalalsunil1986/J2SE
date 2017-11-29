import java.util.*;
class hsts 
{
	public static void main(String[] args) 
	{
		HashSet hs =new HashSet();
		System.out.println("content of hs="+hs);
		System.out.println("size of hs="+hs.size());
		hs.add(100);
		hs.add(10);
		hs.add(1);
		hs.add(90);
		hs.add(90);
		System.out.println("content of hs="+hs);
		System.out.println("size of hs="+hs.size());
		System.out.println("extract the data from hs-iterator()");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println("obj");
		}
		System.out.println("extract the data from hs-toArray()-fd");
		Object obj[]=hs.toArray();
		for(Object x:obj)
		{
			System.out.println("x");
		}
		System.out.println("extract the data from hs-toArray().bd");
		for(int i=obj.length-1;i>=0;i--)
		{
			System.out.println("obj[i]");
		}
	}
}
