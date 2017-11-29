//IntfDemo5.java
interface SathyaInst
{
interface JavaCourse
{
void learnJava(); // public abstract void learnJava()
}// JavaCourse--------inner interface
interface DotNetCourse
{
void learnDotNet(); // public abstract void learnDotNetCourse()
}//DotNetCourse-----inner interface
}//SathyaInst-----outer interface
class JavaStudent implements SathyaInst.javaCourse
{
public void learnjava()
{
System.out.println("learning java from Sathya");
}
}//JavaStudent-----implementation class SathyaInst.java Course
class DotNetStudent implements Sathya.DotNetCourse
{
public void learnDotNet()
{
System.out.println("learning dot net from Sathya");
}
}//DotNetStudent------implementation class SathyaInst.DotNet Course
class IntfDemo5
{
public static void main(String s[])
{
System.out.println("w.r.t JavaStudent-----DOC");
JavaStudent js=new JavaStudent();
js.learnJava();
System.out.println("w.r.t SathyaInst.JavaCourse----Dynamic Binding");
SathyaInst.JavaCourse js1=new JavaStudent();
                      js1.learnJava();
System.out.println("w.r.t DotNet Student-----DOC");
ds.learnDotNet();
System.out.println("w.r.t SathyaInst.DotNetCourse-----Dynamic Binding");
SathyaInst.DotNetCourse ds1=new DotNetStudent();
	                    ds1.learnDotNet();
)
}