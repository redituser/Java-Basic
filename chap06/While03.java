package chap06;

import java.util.Scanner;

public class While03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;

		while (a == 1) {
			System.out.println("숫자 입력");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			System.out.println("계속하시겠습니까?(0멈춤 / 1계속)");
			a = sc.nextInt();
		}
	}
}
