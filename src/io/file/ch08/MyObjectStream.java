package io.file.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// ObjectOut... ObjectInput... 연습하기
public class MyObjectStream {

	public static void main(String[] args) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {

			Person person = new Person("손흥민", 30);
			oos.writeObject(person);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("-----------------------");

		// 객체 역직렬화
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
			
			// 문자 기반 데이터를 읽으면 <-- 스트링 값 추출해서 코드상에 활용할 있도록 Object
			// 만드는 코딩을 해야 한다. name:, 10 <---
			Person person = (Person)ois.readObject();
			System.out.println(person);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
