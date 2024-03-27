package exam;

public class Exam09 {
	public static void foo(int a) {
		System.out.println("안녕" + a);
	}

	public static void foo(String message) {
		System.out.println(message);
	}

	public static void foo() {
		System.out.println("잘 있어");
	}

	public static void main(String[] args) {
		foo(1);
		foo("안녕하세요" + 1 + "," + 2);
		foo();
	}
}
