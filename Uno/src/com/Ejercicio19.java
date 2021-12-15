package com;
import java.util.Calendar;

public class Ejercicio19 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(2021, 0, 1);
		int monthMaxDays = c.getActualMaximum(Calendar.DAY_OF_MONTH);	
		System.out.println(monthMaxDays);
	}
}
