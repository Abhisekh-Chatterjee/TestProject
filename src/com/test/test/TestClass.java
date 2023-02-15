package com.test.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class TestClass {
	
	public static void main(String[] args) throws ParseException {
		short x = 10;
		float y = 20.4f;
		
		Calendar cal = Calendar.getInstance();
		
		
		
		cal.setTimeZone(TimeZone.getTimeZone(""));
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println((x+y) + " is of type " + ((Object)(x+y)).getClass().getSimpleName());
		
		final int a;
		
		a =5;
		 System.out.println("a = "+a);
		 
		 // Second Test
		 
		 Integer i1 = 100;
		 Integer i2 = 100;
		 Integer i3 = 1000;
		 Integer i4 = 1000;

		 System.out.println(i1 == i2);
		 System.out.println(i3 == i4);
		 
		 String S = "admin  -wx 29 Sep 1983        833 source.h"+"\n"+
				 "admin  r-x 23 Jun 2003     854016 blockbuster.mpeg"+"\n"+
				 "admin  --x 02 Jul 1997        821 delete-this.py"+"\n"+
				 "admin  -w- 15 Feb 1971      23552 library.dll"+"\n"+
				 "admin  --x 15 May 1979  645922816 logs.zip"+"\n"+
				 "jane   --x 04 Dec 2010      93184 old-photos.rar"+"\n"+
				 "jane   -w- 08 Feb 1982  681574400 important.java"+"\n"+
				 "admin  rwx 26 Dec 1952   14680064 to-do-list.txt";
		 String lines[] = S.split("\n");
		 
		 List<Date> dateList = new ArrayList<Date>();
		 
		 for(String s : lines) {
			 System.out.print(s.substring(0,5));
			 System.out.print(" "+s.substring(7,10));
			 System.out.print(" "+s.substring(11,22));
			 System.out.print(" "+s.substring(34));
			 System.out.println(" "+Double.parseDouble(s.substring(24,33)));
			 if(s.substring(0,5).equals("admin") && 
		                s.substring(7,10).contains("x") &&
		               Double.parseDouble(s.substring(24,33)) <
		                (14*Math.pow(2,20))){
				 			dateList.add(new SimpleDateFormat("dd MMM yyyy").parse(s.substring(11,22)));

		                }
		 }
		 double b = Math.pow(2,32) / (14*Math.pow(2,20));
		 System.out.println("b = "+14*Math.pow(2,20));
		 
		 Date minDate = Collections.min(dateList);
		 
		    Date date = Calendar.getInstance().getTime();  
		    DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");  
		    String strDate = dateFormat.format(minDate);  
		 
		 System.out.println(strDate);
		 
		 System.out.println(1234+432l);
		 
		 System.out.println(357%234); //-> 123
		 System.out.println(234%123); //-> 111
		 System.out.println(123%111); //-> 12
		 System.out.println(111%12); //-> 	3
		 System.out.println(12%3); //-> 0
		 
		 int meal = 5;
		 int tip = 2;
		 int total = meal + (meal>6 ? ++tip : --tip);
		 
		 System.out.println("total :"+total);
		 
		 int num = 1_2_3;
		 //int num1 = _1_2_3;
		 
		 System.out.println("num : "+num);
	}
	

}
