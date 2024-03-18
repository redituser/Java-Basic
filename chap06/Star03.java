package chap06;

public class Star03 {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {// 세로
			for (int j = 1; j <= i; j++) { // 가로
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
