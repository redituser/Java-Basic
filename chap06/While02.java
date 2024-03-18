package chap06;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b;
		int c = 0;

		while (true) {
			System.out.println("숫자를 입력하세요");
			b = sc.nextInt();
			c += b;
			if (b == 0) {
				break;
			}

		}
		System.out.println(c += b);
	}

}
