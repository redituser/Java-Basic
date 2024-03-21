package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("학생 수 :");
		int Snum = Integer.parseInt(br.readLine());

		System.out.println(Snum + "명의 성적");
		String inStr = br.readLine();// ?

		StringTokenizer st = new StringTokenizer(inStr, " "); // 입력받은 값으로 여러개 쪼개기

		int[] scores = new int[Snum];

		for (int i = 0; i < Snum; i++) {
			// nextToken으로 하나의 토큰을 가져와서 정수형을 바꾼 데이터를 배열의 요소에 저장
			scores[i] = Integer.parseInt(st.nextToken());
		}

		int s = 0;

		for (int i = 0; i < scores.length; i++) {
			s += scores[i];
		}

		System.out.println("합계" + s);
		System.out.println("평균" + s / scores.length);

	}
}
