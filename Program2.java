package com.niit;

import java.util.*;
import java.text.*;

public class Program2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter date from(1-31)");
		int dd = input.nextInt();
		System.out.println("enter month from(1-12)");
		int mm = input.nextInt();
		System.out.println("enter year:");
		int yy = input.nextInt();
		Date date = (new GregorianCalendar(yy, mm, dd)).getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		String day = sdf.format(date);
		System.out.println(day);

	}

}
