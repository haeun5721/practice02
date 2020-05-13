package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i <20; i++)
		Random r = new Random();
		int k = r.nextInt(100) + 1;
        int trycount = 1;
	   while(true)
		   System.out.println(trycount + ">>");
		   int input = scanner.nextInt();
		System.out.println(k);
		

	}
		
		scanner.close();
	}

}
