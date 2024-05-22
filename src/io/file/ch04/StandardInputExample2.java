package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 문자 기반 스트림 + 보조 문자 기반 스트림 확인 
// 한줄 입력 하면 종료 됨 
// 여러줄 반복적을 동작할 수 있도록 기능을 추가해주세요 
public class StandardInputExample2 {

	public static void main(String[] args) {

		// 데이터를 통으로 관리 하고 싶다면 --> 자료구조 --> 적절한 자료 구조를 선택
		List<String> lines = new ArrayList<String>();

		System.out.println("여러 줄의 텍스트를 입력하세요");
		System.out.println("입력을 종료하려면 빈 줄에서 엔터를 누르세요");
		// <-- 종료
		// 안녕 -> 엔터 사용하면 출력
		// "" -> 엔터 종료가 됨

		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용 한다. !!
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
				BufferedReader br = new BufferedReader(isr)) {

			// while() {}
			String line;
			// "" --> 엔터 ---> ine.isEmpty() -- ! --> F --> 실행에 종료가 된다.
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				lines.add(line); // 한줄에 데이터를 자료구조에 저장
				// System.out.println("입력 확인 : " + line);
			}

			for (String data : lines) {
				System.out.println(data);
			}
			System.out.println("프로그램 종료 처리 ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
