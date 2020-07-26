package myCaptain;

import java.util.Scanner;

public class MinutesToYears {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min = sc.nextInt();
		
		int hours, days, years;
		
		hours = min / 60;
		
		days = hours / 24;
		
		years = days / 365;
		
		int remainingDays = days - (365 * years);
		
		System.out.println(min + " is approximately " + years + " years and " + remainingDays + " days");

	}

}
