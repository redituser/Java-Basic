package Example01;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 반지름을 입력하시오");
		int num = sc.nextInt();
		
		System.out.println("원의 넓이는: " + num * num * 3.14);
		
	}
}
