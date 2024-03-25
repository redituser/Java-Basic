package array;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;

		while (true) {
			System.out.println("숫자를 입력하세요");
			n = sc.nextInt();

			if (n < 0 || n == 0) {
				System.out.println("0보다 큰 숫자를 입력하세요");
				n = sc.nextInt();
			}
			if (n > 0) {
				break;
			}
		}
		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("1부터" + n + "까지의 합" + "=" + sum);

	}

}
