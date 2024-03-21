package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array03 {

	public static int getNK(String message) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(message);
		return Integer.parseInt(br.readLine());
	}

	public static int[] getSL(int num) throws IOException {

		int[] scores = new int[num];

		// 한줄 읽어오기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inStr = br.readLine();// ?

		// 쪼개서 정수로 변환해서 배열에 저장하기
		StringTokenizer st = new StringTokenizer(inStr, " "); // 입력받은 값으로 여러개 쪼개기
		for (int i = 0; i < num; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
		}

		return scores;// 주소값 리턴
	}

	public static void printSumAverage(int[] myArr) {

		int s = 0;

		for (int i = 0; i < myArr.length; i++) {
			s += myArr[i];
		}

		System.out.println("합계" + s);
		System.out.println("평균" + s / myArr.length);

	}

	public static void main(String[] args) throws IOException {

		int Snum = getNK("학생 수 : ");
		int[] scores = getSL(Snum);
		printSumAverage(scores);
	}
}
