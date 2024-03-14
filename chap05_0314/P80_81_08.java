package chap05;

import java.util.Scanner;

public class P80_81_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 999사이의 숫자를 입력하세요");
		int s = sc.nextInt();

		int a = s % 10;
		int b = a % 10;
		int c = b % 10;

		System.out.println(a + b + c);

	}

}
