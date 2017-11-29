//Welcome.java
import java.util.Date;
class Welcome
{
public static void main(String[] args)
{
Date d=new Date();
int h=d.getHours();
String str="  ";
if((h>=0)&&(h<=12))
{
str="GOOD MORNING";
}
if((h>=13)&&(h<=15))
{
str="GOOD AFTERNOON";
}
if((h>=16)&&(h<=19))
{
str="GOOD EVENING";
}
if((h>=20)&&(h<=23))
{
str="GOOD NIGHT";
}
}
}