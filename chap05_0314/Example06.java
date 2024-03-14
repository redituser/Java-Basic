package chap05;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 카푸치노");
		System.out.print("메뉴 번호를 선택하세요 : ");

		Scanner input = new Scanner(System.in);
		int numMenu = input.nextInt();
		int ncoffee = 0;

		switch (numMenu) {
		case 1:
			System.out.print("몇 잔을 주문하시겠습니까? ");
			ncoffee = input.nextInt();
			break;
		case 2:
			System.out.print("몇 잔을 주문하시겠습니까? ");
			ncoffee = input.nextInt();
			break;
		case 3:
			System.out.print("몇 잔을 주문하시겠습니까? ");
			ncoffee = input.nextInt();
			break;
		default:
			System.out.println("없는 메뉴입니다.");
			return;
		}

		System.out.println(numMenu + "번 메뉴를 " + ncoffee + "잔 주문하셨습니다.");
	}
}
