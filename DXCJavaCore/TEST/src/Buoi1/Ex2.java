package Buoi1;

import java.util.Scanner;

public class Ex2 {
	public static void main (String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz input 3 numbers");
		Double a = sc.nextDouble();
		for (int i =0; i<2; i++) {
			Double b = sc.nextDouble();
			if (a > b) {
				continue;
			}
			else {
				a = b;
			}
				
		}
		System.out.println("Max:" + a);
		sc.close();
	}
}
