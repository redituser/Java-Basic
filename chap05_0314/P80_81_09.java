package chap05;

import java.util.Scanner;

public class P80_81_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("전공 이수 학점을 입력하세요");
		int a = sc.nextInt();
		System.out.println("교양 이수 학점을 입력하세요");
		int b = sc.nextInt();
		System.out.println("일반 이수 학점을 입력하세요");
		int c = sc.nextInt();

		int d = a + b + c;

		if (d > 140) {
			System.out.println("졸업가능");
		} else if (a >= 70) {
			System.out.println("졸업가능");
		} else if (b >= 30 && c >= 30) {
			System.out.println("졸업가능");
		} else if (b + c >= 80) {
			System.out.println("졸업가능");
		} else {
			System.out.println("졸업 불가");
		}
	}
}