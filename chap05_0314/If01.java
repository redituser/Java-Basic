package chap05;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = a;

		if (b > max) {
			max = b;

		}
		if (c > max) {
			max = c;
		}

		System.out.println("가장 큰 수는" + c + "입니다.");
	}
}