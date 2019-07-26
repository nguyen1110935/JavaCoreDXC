package Buoi1;

import java.util.Scanner;

public class Ex4 {
	public static void main (String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz input a integer number");
		int nu = sc.nextInt();
		for (int j=0; j<=nu; j++) {
			for (int i=0; i<=j; i++) {
				System.out.printf("%s", i);
			}
			System.out.println();
		}
		sc.close();
	}

}
