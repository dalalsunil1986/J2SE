//Client.java
import java.io.*;
import java.net.*;
import java.util.Scanner;
class Client
{
public static void main(String[] args)
{
try
{
//step-2
String dns=args[0];
int pno=Integer.parseInt(args[1]);
Socket s=new Socket(dns pno);
System.out.println("csp obtains connection from ssp");
//step3
OutputStream os=s.getOutputStream();
DataOutputStream dos=new DataOutputStream(os);
Scanner s1=new Scanner(System.in);
System.out.println("Enter a value");
int n=Integer.parseInt(s.nextLine());
dos.writeInt(n);
//step----4
InputStream is=s.getInputStream();
DataInputStream dis=new DataInputStream(is);
int res=dis.readint();
//step--5
System.out.println("result of server at client console="+res);
//step--6
s.close();
}catch(Exception e)
{
System.err.println(e);
}
}
}//Client-----BLC