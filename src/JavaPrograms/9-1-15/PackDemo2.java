//PackDemo2.java
class Sathya implements tp.test
{
public void show()
{
System.out.println("show()----def---Sathya");
}
}//Sathya---implementation class
class PackDemo2
{
public static void main(String[] args)
{
System.out.println("w.r.t Sathya----DOC");
Sathya s=new Sathya();
            s.show();
System.out.println("w.r.t Itest-----dynamic binding");
// Itest io=new Itest(); invalid,bcoz Itest is abstract
tp.test io=new Sathya(); //indirect object
            io.show();
}
}