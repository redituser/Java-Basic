package chap05;

import java.util.Scanner;

public class P80_81_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a % 4 == 0 && a % 5 == 0) {
			System.out.println("a % 4 == 0 && a % 5==0 true");
		} else if (a % 4 == 0) {
			System.out.println("a % 4 == 0 true");
		} else if (a % 5 == 0) {
			System.out.println("a % 5 == 0 true");
		} else if (a % 4 != 0) {
			System.out.println("a % 4 == 0 flase");
		} else if (a % 5 != 0) {
			System.out.println("a % 5 == 0 flase");
		} else if (a % 5 != 0 && a % 4 != 0) {
			System.out.println("a % 5 != 0  && a % 4 != 0 false");

		}

	}
}