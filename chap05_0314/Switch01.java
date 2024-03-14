package chap05;

import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();

		switch (j) {

		case 1:
			System.out.println((j % 2 == 0) + "짝수입니다");
			break;
		case 2:
			System.out.println((j % 2 != 0) + "홀수입니다");
			break;
		}
	}

}
