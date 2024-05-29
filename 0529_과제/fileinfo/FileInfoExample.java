package fileinfo;

import java.io.File;
import java.io.IOException;

public class FileInfoExample {

	public static void main(String[] args) throws IOException {

		// 1. 파일 및 디렉토리 생성
		File imgDir = new File("C:/Temp/images"); // 디렉토리 객체 생성
		File testFile = new File("C:/Temp/test.txt"); // 파일 객체 생성

		// 1.2. 파일과 디렉토리의 존재 여부 확인
		if (imgDir.exists() == false) { // 디렉토리가 비어있다면 false
			imgDir.mkdirs(); // 1.3. 디렉토리 생성
			System.out.println(imgDir.getName() + "을 생성합니다.");
		}
		if (testFile.exists() == false) { // 파일 내용이 비어있다면 false;
			testFile.createNewFile(); // 1.4. 파일 생성 (그런 메서드임)
			System.out.println(testFile.getName() + "을 생성합니다.");
		}

		// 2. 디렉토리 내용 출력
		File tempDir = new File("C:/Temp"); // 디렉토리 객체 생성
		File[] contents = tempDir.listFiles(); // 디렉토리 내용 목록 가져와 배열로 설정 (여러개라 그런듯)
		System.out.println(tempDir.getName() + "의 내용을 출력합니다."); // (파일 이름 출력)
		for (File file : contents) { // (디렉토리 목록을 변수 file로 받아)
			System.out.print("\t" + file.getName()); // 파일 이름 출력
			if (file.isDirectory()) { // 파일과 디렉토리 구분
				System.out.print("<DIR>");
			} else {
				System.out.print("<" + file.length() + ">"); // 2.3. 파일 크기 출력
			}
			System.out.println();
		}
	}
}
