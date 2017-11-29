//Prop1.java
import java.util.*;
import java.io.*;
class prop1
{
public static void main(String[] args)
{
try
{
//step-2
Scanner sc=new Scanner(System.in);
System.out.println("Enter Prop File Name");
String PFile=s.nextLine();
FileInputStream fis=new FileInputStream(Pfile);
//step-3
Properties p=new Properties();
//step=4
p.load(fis);
//step-5
System.out.println("Student Number="+p.getProperty("stno"));
System.out.println("Student Name="+p.getProperty("name"));
System.out.println("Student Marks="+p.getProperty("marks"));
System.out.println("Student College="+p.getProperty("College"));
//step=6
fis.close();
}Catch(FileNotFoundException fc)
{
System.out.println("prop file does not exists________verify");
}
Catch(Exception e)
{
System.out.println(e);
}
}
}