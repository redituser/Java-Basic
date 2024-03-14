package chap05;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();

		switch (j) {
		case 1:
			System.out.println(" 아주 열심히 하셨군요~~~!!");
			break;
		case 2:
			System.out.println(" 아주 열심히 하셨군요~~~!!");
			break;
		case 3:
			System.out.println(" 남들 만큼 하셨네요 ");
			break;
		case 4:
			System.out.println(" 조금 더 노력이 필요합니다 ");
			break;
		case 5:
			System.out.println(" 교수실로 찾아오세요");
			break;

		}

	}

}
