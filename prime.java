package myCaptain;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(n == 2) {
			System.out.println("The number 2 is a prime number");
		}
		
		int m = 0;
		
		for(int i = 2; i < n; i++) {
			m = n % i;
			if(m == 0) {
				break;
			}
		}
		
		if(n > 2) {
			if(m != 0) {
				System.out.println("The number " + n + " is a prime number");
			}else {
				System.out.println("The number " + n + " is not a prime number");
			}
		}
	}

}
