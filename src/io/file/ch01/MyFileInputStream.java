package io.file.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileInputStream {

	public static void main(String[] args) {
		FileInputStream in = null;

		try {
			in = new FileInputStream("a.txt");

			// 1단계
//			int readData = in.read();

			// 2단계
//			System.out.println((char)in.read());
//			System.out.println((char)in.read());
//			System.out.println((char)in.read());

			// 3단계
			// 읽을 데이터가 더이상 없다면 -1 을 반환 한다.
			int readData;
			while ((readData = in.read()) != -1) {
				System.out.print((char) readData);
			}

			// 4단계 FileInputStream(기반 스트림) 대상에 접근해서 한 바이트 씩 읽어 들이는 기능을 가지고 있다.
			// 1byte 127 -128 : a --> 97, A --> 65, 한글은 --> 대(정수값 얼마야?) --> 한글은 2바이트 크기
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
