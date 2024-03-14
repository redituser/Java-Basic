package chap05;

import java.util.Scanner;

public class P80_81_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("화씨온도 입력");
		double f = sc.nextDouble();

		double c = 5.0 / 9.0 * (f - 32);

		System.out.println("섭씨온도는" + c);

	}

}
