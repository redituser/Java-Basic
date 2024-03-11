package Example01;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("금액을 입력하시오");
		int a = sc.nextInt();
		
		
		
		System.out.println("500원 짜리" + a/500 + "개");
		System.out.println("100원 짜리" + (a%500)/100 + "개");
		
	}

}
