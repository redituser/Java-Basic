package chap05;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 카푸치노");
		System.out.println("4. 돌체라떼");

		System.out.print("메뉴 번호를 선택하세요 : ");
		Scanner input = new Scanner(System.in);
		int numMenu = input.nextInt();

		switch (numMenu) {
		case 1:
			System.out.println("아메리카노를 선택하였습니다.");
			break;

		case 2:
			System.out.println("카페라떼를 선택하였습니다.");
			break;

		case 3:
			System.out.println("카푸치노를 선택하였습니다.");
			break;

		case 4:
			System.out.println();

		default:
			System.out.println("없는 메뉴입니다.");
		}

	}

}
