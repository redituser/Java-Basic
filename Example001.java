package Example01;

import java.util.Scanner;

public class Example001 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("너의 이름을 입력하시오");
		String name = sc.nextLine();
		System.out.println("너의 이름은" + name);
	}

}
