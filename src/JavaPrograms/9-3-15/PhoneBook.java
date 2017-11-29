//PhoneBook.java
package pb;
import java.util.*;

public class PhoneBook
{
TreeMap tm=new TreeMap();
Scanner s=new Scanner(System.in);
public void createPhoneBook()
{
System.out.println("Enter no. of contacts");
int noc=Integer.parseInt(s.nextLine());

for(int i=0;i<noc;i++)
{
System.out.println("Enter "+(i+1)+" contactdetails");
System.out.println("..........");
System.out.println("Enter contact name");
String cname=s.nextLine();
System.out.println("Enter contact number");
int phno=Integer.parseInt(s.nextLine());
tm.put(cname.phno);//statement for adding contacts to PhoneBook
System.out.println("...........");
}//for

}
public void dispPhoneBook()
{
Set s=tm.entrySet();
Iterator itr=s.Iterator();
System.out.println("...........");
System.out.println("PHONE BOOK DETAILS");
System.out.println("...........");
while(itr.hasNext())
{
Object mobj=itr.next();
Map.Entry me=(Map.Entry)mobj;
Object cname=me.getKey();
Object phno=me.getValue();
System.out.println(cname+"        "+phno);
}
System.out.println("..............");
}
public void searchPhoneBook()
{
System.out.println("Enter contact name");
String cname=s.nextLine();

//searching process

Object phno=tm.get(cname);

if(phno!=null)
{
System.out.println(phno+"is the contact name of"+cname);
}//if

else
{
System.out.println("contact does not exists");
}//else

}//public void createPhoneBook()
}//PhoneBook------BLC
