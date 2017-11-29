//Vect.java
import java.util.*;
class Vect
{
	public static void main(String[] args)
	{
		Vector v=new Vector()
		{{
			addElement(10);
			addElement(10.5f);
			addElement("sathya");
		}};
		System.out.println(v);
	}
}