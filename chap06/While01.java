package chap06;

import java.util.Scanner;

public class While01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int i = 0;
		while (i <= num) {

			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
