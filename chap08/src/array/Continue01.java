package array;

public class Continue01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i == 4 || i == 7)
				continue;
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
