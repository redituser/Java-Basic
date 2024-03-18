package chap06;

import java.util.Scanner;

public class For05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int b = 0;
		int c = 0;
		while (true) {
			System.out.println("양의 숫자를 입력하세요");
			b = sc.nextInt();
			if (b > 0) {
				for (int i = 0; i <= b; i++) {
					System.out.println(c = c + i);
				}
				break;
			} else {
				System.out.println("다시입력");
			}

		}
	}
}
