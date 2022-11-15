package ch18_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex07_BufferedIo {
	//Case 1 : 입출력 stream 복사
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/temp/forest1.jpg");
		FileOutputStream fos = new FileOutputStream("/temp/target1.jpg");
		
	//Case2 : 입출력 stream + buffer stream 으로 복사
		FileInputStream fis2 = new FileInputStream("/temp/forest2.jpg");
		FileOutputStream fos2 = new FileOutputStream("/temp/target2.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//buffer를 사용하지 않고 복사
		long noBufferTime = copy(fis, fos);
		System.out.println("버퍼 미사용: "+ noBufferTime+ "ns");
		
		//buffer 사용한경우
		long BufferTime = copy(bis, bos);
		System.out.println("버퍼 사용: "+ BufferTime+ "ns");
		
		System.out.println(noBufferTime / BufferTime);
		
		fis.close(); fos.close(); fis2.close(); fos2.close();
		bis.close(); bos.close(); 
		
	}
	public static long copy(InputStream is, OutputStream os) throws IOException {
		long startTime = System.nanoTime();		
		// 1byte 단위로 읽고 쓰기
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
}
