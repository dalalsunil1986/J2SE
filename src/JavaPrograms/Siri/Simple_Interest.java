import java.util.Scanner;
public class Simple_Interest
{
public static void main(String args[])
{
int p;
float rot;
int t;
float si; 
float amt;
Scanner input=new Scanner(System.in);
System.out.println(" Enter the Principal Amount: ");
p=input.nextInt();
System.out.println("Enter the Rate of Interest;");
rot=input.nextFloat();
System.out.println("Enter the Number of years:");
t=input.nextInt();
si=(p*rot*t)/100; /*calculation of simple interest*/
amt=si+p; /*calculation of total amount*/
System.out.println("\n Simple Interest is: "+si);
System.out.println("\n Total Amount is: "+amt);
}
}