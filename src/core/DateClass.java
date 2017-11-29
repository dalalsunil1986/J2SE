package core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());

		System.out.println(date.getMonth() + 1);
		System.out.println(1900 + date.getYear());
		System.out.println(date.getDay());
		System.out.println(date.getHours());
	
		SimpleDateFormat sdf=new SimpleDateFormat("E yyyy/MM/dd HH-mm-ss");
		System.out.println(sdf.format(date));
	}
}
