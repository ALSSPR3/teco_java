package useful.ch03;

public class NickNameTset {

	public static void main(String[] args) {
		NickName nickName = new NickName();

		String inputNickname = null;
		inputNickname = "ㅅ ㅁㅁ1";

		try {
			nickName.setNickName(inputNickname);
		} catch (NickNameException e) {
			System.out.println("우리가 설정한 오류 발생");
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}

	}
}
