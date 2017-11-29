import java.util.Scanner;
import static java.lang.Math.*;
import static ip.Inst.*;
import static java.lang.system.out;
import static java.lang.system.in;
class StaticImpDemo
{
public static void main(String[] args)
{
out.println("val of pi="+pi);
out.println("val of e="+e);
out.println("pow(8,3)="+pow(8,3));
out.println("pow(4,2)="+pow(4,2));
out.println("ADDRESS OF INSTITUTE");
out.println(name+" "+loc+" "+city);
Scanner s=new Scanner(in);
out.println("Enter a number");
int n=s.nextInt();
out.println("Sqrt("+n+")="+Sqrt(n));
}
}