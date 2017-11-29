//CFWALG2.java
import java.util.*;
class SortMaxMin
{
void FindSortMoreMin()
{
//step-1
Scanner sc=new Scanner(System.in);
System.out.println("Enter how many Names U Want to Sort");
int n=Integer.parseInt(s.nextLine());
String io[]=new String[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter"+(i+1)+"Name");
io[i]=s.nextLine();
}//for
//step-2
List<String>l1=Arrays.asList(io);
//step-3
System.out.println("original Names");
System.out.println("--------");
System.out.println(l1);
System.out.println("----");
Collections.Sort(l1);
System.out.println("Sorted Names");
System.out.println("------");
System.out.println(l1);
System.out.println("-------");
String maxv=Collections.More(l1);
String minv=Collections.min(l1);
System.out.println("-----");
System.out.println("max name="+maxV);
System.out.println("min name="+minV);
System.out.println("--------");
}
}//Sort MaxMin
class CFWALG2
{
public static void main(String[] args)
{
new SortMaxMin().FindSortMaxMin();
}
}