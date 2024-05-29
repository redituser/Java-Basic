package bytesteam_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) throws IOException {
		String orgFilename = "Curi_01.jpg"; // 원본 파일
		String copiedFilename = "Curi_01_copied.jpg"; // 복사한 파
		try {
			FileInputStream fis = new FileInputStream(orgFilename); // inputstream을 통해 오리지널 파일을 읽는다
			FileOutputStream fos = new FileOutputStream(copiedFilename); // outputstream 을 통해 복사한 파일에 넣는다
			copyEachOneByte(fis, fos); // 메서드 호출 이 메서드는 한바이트식 복
			// copyEachKByte(fis, fos);
			fos.flush();// 출력할 데이터를 모두 내보낸다
			fos.close();// 다 출력했으면 파일스트림을 닫는다
			fis.close();// 이것도 마찬가지
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) { // 파일이 없을 때 예외 처리 해서 메세지 출력
			System.out.println(e.getMessage());
		}
	}

	private static void copyEachOneByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		int byteInput;
		while ((byteInput = fis.read()) != -1) {
			fos.write(byteInput);
		}
	}

	private static void copyEachKByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		byte kbInput[] = new byte[1024];
		int bytesRead;
		while ((bytesRead = fis.read(kbInput)) != -1) {
			fos.write(kbInput, 0, bytesRead);
		}
	}
}
