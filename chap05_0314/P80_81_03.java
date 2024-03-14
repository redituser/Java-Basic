package chap05;

import java.util.Scanner;

public class P80_81_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("원기둥의 밑면 반지름은?");
		int a = sc.nextInt();

		System.out.println("원기둥의 높이는");
		int b = sc.nextInt();

		System.out.println("원기둥의 부피는" + ((a * a) * 3.14) * b);

	}

}
