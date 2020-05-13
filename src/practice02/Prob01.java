package practice02;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		for( int i = 0; i < MONEYS.length; i++) {
		sum += MONEYS[i];
	}
		
		divide = sum / MONEYS.length;
		
    

		System.out.println(distribution);
		
		scanner.close();
	}

}
