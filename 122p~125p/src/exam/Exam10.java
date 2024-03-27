package exam;

import java.util.Scanner;

public class Exam10 {

	public static void isPrime(int a) {
		if (a % 2 == 1) {
			System.out.println("소수입니다");
		} else {
			System.out.println("소수가 아닙니다");
		}
	}

	public static void main(String[] args) {

		System.out.println("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		isPrime(num);

	}

}
