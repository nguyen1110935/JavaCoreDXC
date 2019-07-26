package Buoi1;

import java.util.Scanner;

public class Ex3 {
	public static void main (String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz input a integer number");
		int nu = sc.nextInt();
		
		for (int i=0; i<=nu; i++) {
			int re = nu*i;
			System.out.println(nu+" x "+i+" = "+re);
		}
		sc.close();
	}
}
