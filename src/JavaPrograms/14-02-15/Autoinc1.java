//Autoinc1.java
import java.awt.*;
import java.applet.*;
/*<applet code="Autoinc",height=500,width=500>
</applet>*/
public class Autoinc1 extends Applet implements Runnable
{
int i=0;
public void init()
{
setBackground(Color.yellow);
setForeground(Color.blue);
}//init()
public void start()
{
Thread t=new Thread(this);/*'this' refers to current class obj. 
which implements 'Runnable' interface convert into Thread class obj*/
t.start();
}
public void paint(Graphics g)
{
Font F=new Font("arial",Font.BOLD,100);
g.setFont(F);
g.drawString(String.valueOf(i),100,100);
}
public void run() // LOGIC FOR AUTOINC
{
try
{
while(true)
{
++i;
Thread.sleep(1000);
repaint();
}//while
}catch(InterruptedException ie)
{
System.out.println("prob in thread exec...");
}
}//run()
}//Autoinc---class















