package chap06;

import java.util.Scanner;

public class Dowhile01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b = 0;

		do {
			System.out.println("숫자 입력");
			a = sc.nextInt();
			b = b + a;
			if (a == 0) {
				System.out.println("지금까지 입력한 숫자의 합은" + b);
				break;
			}

		} while (true);

	}

}
