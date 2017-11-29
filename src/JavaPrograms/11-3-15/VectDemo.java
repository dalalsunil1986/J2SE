//VectDemo.java
import java.util.*;
class vectDemo
{
public static void main(String[] args)
{
Vector v=new Vector();
System.out.println("content of v="+v);//[ ]
System.out.println("cap of v="+v.capacity());//10
System.out.println("size of v="+v.size());//0
//add the data to v
v.addElement(10);
v.addElement(10,7.5f);
v.addElement(A);
v.addElement(true);
System.out.println("content of v="+v);//[10,10.75,a,true]
System.out.println("cap of v="+v.capacity());//10
System.out.println("size of v="+v.size());//4
v.insertElementAt("sathya",1);
System.out.println("content of v after inserting="+v);//[10,sathya,10.75,a,true]
v.setElementAt("Java",3);
System.out.println("content of v after replacing="+v);//[10,sathya,10.75,a,true]
v.insertElementAt(20,3);
v.insertelementAt(20.25f,A);
System.out.println("content of v after inserting="+v);//[10,sathya,10.75,20,20.25,java,true]
//extract the data from v
int is=0;
float fs=0.0f;
String rs="  ";
System.out.println("content of v");
System.out.println("---------");
Enumeration en=v.elements();
while(en.hasMoreElement()
System.out.println(obj);
class s=obj.getClass();
String came=c.getName();
if(cname.equals("java.lang.integer"))
{
integer io=(integer)obj;//dynamic object type casting
int x=io.intValue();
is=is+x;
}
if(cname.equals("java.lang.Float"))
{
Float fo=(Float)obj;//dynamic object type casting
float x=fo.floatValue();
fs=fs+x;
}
if(cname.equals(java.lang.String"))
{
String s=(String)obj;//dynamic object type casting
rs=rs+"   "+s;
}
}//while
System.out.println("-------------");
System.out.println("int sum="+is);
System.out.println("float sum="+fs);
System.out.println("string sum="+rs);
System.out.println("-------------");
}
}