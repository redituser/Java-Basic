package array;

public class Array01 {
	public static void main(String[] args) {
		int[] gradeArr = { 90, 80, 70, 60, 50, 70, 29, 60, 88, 95 };

		int s = 0;

		for (int i = 0; i < gradeArr.length; i++) {
			s += gradeArr[i];
		}
		System.out.println("합계" + s);
		System.out.println("평균" + s / gradeArr.length);
	}

}
