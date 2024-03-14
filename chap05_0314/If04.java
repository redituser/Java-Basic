package chap05;

import java.util.Scanner;

public class If04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a > 0 && a % 2 == 0) {
			System.err.println("짝수입니다");
		} else if (a < 0) {
			System.out.println("양수가 아닙니다");
		} else if (a % 2 != 0) {
			System.out.println("홀수입니다");
		}
	}
}
