package chap06;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int num = 0, sum = 0;

		for (int i = 1; i <= 5; i++) {
			num = sc.nextInt();
			sum = num + sum;
		}
		System.out.println(sum);
	}

}
