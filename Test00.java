package Example01;

import java.util.Scanner;

public class Test00 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("정수 타입 숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		
		System.out.println("실수 타입 숫자를 입력하세요: ");
		double n = sc.nextDouble();
		
		System.out.println(num + n);
		System.out.println(num - n);
		System.out.println(num * n);
		System.out.println(num / n);
	}

}
