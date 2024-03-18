package chap06;

import java.util.Scanner;

public class For04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		for (int i = a; i >= 1; i--) {
			b = b * i;
		}
		System.out.println(b);
	}

}
