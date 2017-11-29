//CFWALG3.java
import java.util.*;
class RevFreBM
{
void FindRevFreBin()
{
//step-1
Scanner sc=new Scanner(System.in);
System.out.println("Enter how many Elements U accept");
int n=Integer.parseInt(s.nextLine());
Integer io[]=new Integer[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter"+(i+1)+"value");
io[i]=Integer.parseInt(s.nextLine());
}//for
//step-2
List<integer>l1=Arrays.asList(io);
//step-3
System.out.println("Original Elements");
System.out.println("----------")
System.out.println("l1);
System.out.println("-----");
Collections.reverse(l1);
System.out.println("reverse Elements of original elements");
System.out.println("-----");
System.out.println(l1);
System.out.println("Sorted Elements");
System.out.println("------");
System.out.println(l1);
System.out.println("------");
System.out.println("Enter Which Element U Want to Search");
int ele=Integer.parseInt(s.nextLine());
int DOS=Collections.binarySearch(l1.ele);
System.out.println(ele+"Found at"+POS);
System.out.println("------");
System.out.println("Enter Which Elements Frequency U Want Find");
int ele1=Integer.parseInt(s.extLine());
int Fre=Collections.Frequency(l1.ele());
System.out.println(ele-"Found at"+Fre+"places");
System.out.println("-------");
}
}//RevFreBin
class CFWALG3
{
public static void main(String[] args)
{
new RevFreBin().FindFreBin();
}
}