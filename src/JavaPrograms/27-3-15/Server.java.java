//Server.java-------------step(1)
import java.net.*;
import java.io.*;
class Server
{
public static void main(String[] args)
{
try
{
//step-2
int pno=Integer.parseInt(args[0]);
ServerSocket ss=new ServerSocket(pno);
System.out.println("ssp is ready to accept any req of csp");
while(true)
{
//step-3
Socket s=ss.accept();
//step-4
InputStream is=get.InputStream();
DataInputStream dis=new DataInputStream(is);
int cv=dis.readInt();
System.out.println("val of client at server="+cv);
//step-5
int res=cv;
//step-6
OutputStream os=s.getOutputStream();
DataOutputStream dos=new DataOutputStream(os);
dos.writeInt(res);
//step-7
s.close();
}//while
}catch(Exception e)
{
System.err.println(e);
}
}
}//Server-----BLC


















