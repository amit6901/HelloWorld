package myCaptain;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int f3;
		
		int f1 = 0;
		int f2 = 1;
		
		System.out.println("Enter the no. of fobonacci numbers");
		int n = sc.nextInt();
		
		System.out.println(f1);
		System.out.println(f2);
		for(int i = 0; i < n - 2; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.println(f3);
		}

	}

}
