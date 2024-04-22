package basic.ch14;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		String[] arryStr = new String[26];
		
		arryStr[0] = "A";
		arryStr[1] = "B";
		arryStr[2] = "C";
		arryStr[3] = "D";
		arryStr[3] = "E";
		arryStr[25] = "Y";
		
		// 배열안에 요소의 개수를 출력 하시오
		// 값이 있다면 콘솔창에 출력
		// 반복문 활용
		
		int stringCount = 0;
		for (int i = 0; i < arryStr.length; i++) {
			
			if (arryStr[i] != null) {
				System.out.println(arryStr[i]);
				stringCount++;
			}
			
		}
		System.out.println("배열의 요소 개수 : " + stringCount);
		
		
	} // end of main
	
} // end of class
