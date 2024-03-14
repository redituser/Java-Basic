package chap05;

import java.util.Scanner;

public class P80_81_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("초 단위 정수를 입력하세요");
		int a = sc.nextInt();

		System.out.println((a / 3600) + "시간" + (a / 60) + "분" + (a % 60) + "초");

	}

}
