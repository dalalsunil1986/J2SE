class ObjType
{
public static void main(String[] args)
{
Object obj="sathya";
System.out.println("val of obj="+obj);
//in noc=obj.length();;invalid
String s=(String)obj;//object type casting
int noc=s.length();
System.out.println("no chars in obj="+noc);
Object obj1=10;
System.out.println("val of obj1="+obj1);//10
//obj1=obj1+10;Invalid
Integer io=(Integer)obj1;//object type casting
int x=io.intValue();
x=x+10;
System.out.println("val of x(obj1)="+x);//20
}
}