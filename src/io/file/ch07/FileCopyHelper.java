package io.file.ch07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyHelper {

	// 파일 복사
	public static void copyFile(String readFilePath, String writeFilePath) {

		try (FileReader fr = new FileReader(readFilePath); FileWriter fw = new FileWriter(writeFilePath)) {
			int c;

			while ((c = fr.read()) != -1) {
				fw.write(c);
			}

			System.out.println("파일 복사 완료 : " + writeFilePath);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 복사 중 오류 발생");
		}
	}

	// 파일 복사 - 버퍼 활용
	public static void copyFileWithBuffer(String readFilePath, String writeFilePath) {

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(readFilePath));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writeFilePath))) {
			char[] buffer = new char[1024];
			int numCharsRead; // 읽은 문자

			while ((numCharsRead = bufferedReader.read(buffer)) != -1) {
				bufferedWriter.write(buffer, 0, numCharsRead);
				System.out.println("numCharRead : " + numCharsRead);
			}

			System.out.println("버퍼를 사용한 파일 복사 완료 : " + writeFilePath);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("버퍼를 사용한 파일 복사 중 오류 발생");
		}
	}

	public static void main(String[] args) {
		FileCopyHelper.copyFile("Seoul.txt", "copySeoul.txt");
		System.out.println("------------------------------");
		FileCopyHelper.copyFileWithBuffer("NewYork.txt", "copyNewYork.txt");
	}

}
