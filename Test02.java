package Example01;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		int temp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("변수 a: ");
		int a = sc.nextInt();
		
		
		System.out.println("변수 b: ");
		int b = sc.nextInt();
		
		temp = a; 
		a = b; 
		b = temp; 
		
		
	
		System.out.println("변수 a의 값 :" + a + "변수 b의 값 " + b);
		
		
		
	}

}
