//ani.java
import java.awt.*;
import java.applet.*;
/*<applet code="ani" height=500 width=500>
</applet>*/
public class ani extends Applet implements Runnable
{
String msg="WELCOME TO JAVA";
public void init()
{
setBackground(color.yellow);
setForeground(color.blue);
}//init()
public void start()
{
Thread t=new Thread(this); //  /* 'this' refers to current class object 
//which implements 'Runnable' interface of converts into Thread class onject.*/
t.start();
}
public void paint(Graphics g)
{
Font t=new Font("arial",Font.BOLD,100);
g.setFont(f);
g.drawString(msg,100,100);
}
public void run() // LOGIC FOR BANNER ANIMATION
{
try
{
while(true)
{
char ch=msg.charAt(0);
msg=msg.SubString(1.Msg.length);
msg=msg+ch;
repaint();
Thread.sleep(1000);
}//while}catch(InterruptedException ie)
{
System.err.println("prob in thread exec");
}
}//run()
}//ani----class