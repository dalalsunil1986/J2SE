//DateEx.java
import java.util.Date;
class DateEx
{
public static void main(String[] args)
{
Date d=new Date();
System.out.println("current date="+d);
System.out.println("year="+d.getYear());
System.out.println("month="+d.getMonth());
System.out.println("date="+d.getDate());
System.out.println("day="+d.getDay());
System.out.println("hour="+d.getHours());
System.out.println("min="+d.getSeconds());
System.out.println("Time="+d.getTime());
System.out.println("User Time="+d.getHours()+" ; "+d.getMinutes()+":"+d.getSeconds());
}
}