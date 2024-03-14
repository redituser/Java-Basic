package chap05;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();

		if (j >= 90) {
			System.out.println("A");
		} else if (j >= 80) {
			System.out.println("B");
		} else if (j >= 70) {
			System.out.println("C");
		} else if (j >= 60) {
			System.out.println("D");
		} else if (j > 60) {
			System.out.println("F");
		}

	}

}
