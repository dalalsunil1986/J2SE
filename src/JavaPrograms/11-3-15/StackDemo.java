//StackDemo.java
import java.util.*;
class StackDemo
{
public static void main(String[] args)
{
Stack s=new Stack();
System.out.println("content of s="+s);//[]
System.out.println("size of s="+s.size());//[]
System.out.println("is s empty?="+s.empty());//true
//add the data to s
s.push(10);
s.push(20);
s.push(30);
s.push(40);
System.out.println("content of s="+s);//[10 20 30 40]
System.out.println("size of s="+s.size());//4
System.out.println("is s empty?="+s.empty());//false
//delete top most elements
System.out.println("deleted statement="+s.pop());//40
System.out.println("content of s after pop="+s);//[10 20 30]
//extract the top most elements
System.out.println("top most elements="+s.peek());//30
System.out.println("content of s after peek="+s);//[10 20 30]
//search the values 10&100
int srp1=s.search(10);
System.out.println("stack Rel Position of 10="+srp1);//3
int srp2=s.search(100);
System.out.println("stack Rel Position of 10"+srp2);//-1
//extract the data statements of stack
System.out.println("content of stack");
Enumeration en=s.elements();
while(en.hasMoreElements())
{
Object obj=en.nextElement();
System.out.println(obj);
}
}
}