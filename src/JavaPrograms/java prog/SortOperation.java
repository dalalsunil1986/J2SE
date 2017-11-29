package sp;
import java.util.*;
public class  SortOperation
{
	int n;
	TreeSet ts=new TreeSet();
	Scanner s=new Scanner(System.in);
	public void readSize()
	{
		System.out.println("enter how many elements to sort");
		n=Integer.parseInt(s.nextLine());
	}
	public TreeSet sortData()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("enter"+(i+1)+"value");
			int x=Integer.parseInt(s.nextLine());
			ts.add(x);
		}
		return ts;
	}
	public void dispASCOrder(TreeSet ts)
	{
		System.out.println("\t\tASCorder");
		System.out.println("\t\t..........");
		if(ts.size()<=0)
		{
			System.out.println("\t\t no elements to display");
		}
		else
		{
			Iterator itr=ts.iterator();
			for(itr.hasNext();
			{
				Object obj=itr.next();
				System.out.println("\t\t"+obj);
			}
		}
		System.out.println("\t\t...........");
	}
	public void dispDESCOrder(TreeSet ts)
	{
		System.out.println("\t\t DESC order");
		System.out.println("\t\t.........");
		if(ts.size()<=0)
		{
			System.out.println("\t\t no elements to display");
		}
		else
		{
			Object obj[]=ts.toArray();
			for(int i=obj.length-1;i>=0;i--)
			{
				System.out.println("\t\t"+obj[i]);
			}
		}
		System.out.println("\t\t...........");
	}
	public void findMaxMin(TreeSet ts)
	{
		System.out.println("\t\t.........");
		if(ts.size()<=0)
		{
			System.out.println("\t\t no elements to display");
		}
		else
		{
			Object obj[]=ts.toArray();
			System.out.println("\t\t min element="+obj[0]);
			System.out.println("\t\t max element="+obj[obj.length-1]);
		}
		System.out.println("\t\t............");
	}
}
