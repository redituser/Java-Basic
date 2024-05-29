package charaterstream_ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ChraracterTest {

	public static void main(String[] args) throws IOException {
		String orgFilename = "D1_Student.txt"; // 원본 파일
		String copiedFilename = "D1_Student_copied.txt"; // 복사된 파일

		try {
			FileReader fr = new FileReader(orgFilename); // 원본 파일 읽기
			FileWriter fw = new FileWriter(copiedFilename); // 복사된 파일에 쓰기
			copyCharData(fr, fw); // 파일을 읽어서 복사하는 메서드 호출
			// copyCharArrData(fr, fw);
			fw.flush(); // 남아 있는 데이터를 모두 내보내고
			fw.close(); // 리소스 닫기
			fr.close(); // 리소스 닫기
			System.out.println(orgFilename + " 복사가 완료되었습니다.");
		} catch (FileNotFoundException e) { // 파일이 없을 때 예외처리
			System.out.println(e.getMessage()); // 파일이 없다면 메시지 출력
		}
	}

	private static void copyCharData(FileReader fr, FileWriter fw) throws IOException {
		int charData;
		while ((charData = fr.read()) != -1) { // 파일의 끝까지 읽었다면 -1 리턴됨
			System.out.print((char) charData); // 문자 형변환 후 출력
			fw.write(charData); // 복사된 파일에 쓰기
		}
	}

	private static void copyCharArrData(FileReader fr, FileWriter fw) throws IOException {
		char[] charArrData = new char[100];
		int charsRead;
		while ((charsRead = fr.read(charArrData)) != -1) { // 파일의 끝까지 100 문자씩 읽음
			System.out.print(charArrData); // 읽은 문자 배열 출력
			fw.write(charArrData, 0, charsRead); // 읽은 문자를 복사본 파일에 씀
		}
	}
}
