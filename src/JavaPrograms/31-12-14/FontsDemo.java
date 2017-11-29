//FontsDemo.java
import java.awt.GraphicsEnvironment;
class FontsDemo 
{
	public static void main(String[] args) 
	{
		GraphicsEnvironment
		ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		String s[]=ge.getAvailableFontFamilyNames();
		System.out.println("total fonts="+s.length);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}//main method
}//FontsDemo