//Scimp.java
import java.util.*;
class SCIMP
{
public static void main(String[] args)
{
HashTable ht=new HashTable();
//add the States and Caps
ht.put("Ap","VIJ");
ht.put("TS","HYD");
ht.put("MH","MUM");
ht.put("KAR","BANG");
System.out.println("\t--------");
System.out.println("\t\tcontent of ht");
System.out.println("\t-----");
Enumeration en=ht.keys();
while(enhasMoreElement());
Object cap=ht.get(state);
System.out.println("\t\t"+state"    "+Cap);
}//while
System.out.println("\t----");
if(args.length==0)//state not entered
{
System.out.println("enter the state");
}
else
{
String state=args[0];
Object cap=ht.get(state.toUpperCase());
if(cap!=null)//cap found
{
System.out.println("\t\t"+cap+"is the capital"+state);
}
else//cap not found
{
System.out.println("\t\t No IDEA");
}//else
}//else
}//main
}//SCIMP