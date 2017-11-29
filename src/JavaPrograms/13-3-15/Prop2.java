//Prop2.java
import java.util.*;
class Prop2
{
public static void main(String[] args)
{
Properties p=System.getProperties();
Enumeration en=p.keys();
while(en.hasMoreElements())
{
//Object en=en.nextElement();
//Object en=p.get(en);
System.out.println(en+">"+en);
}
}
}