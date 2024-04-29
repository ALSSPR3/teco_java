package useful.ch03;

public class NickName {

	private String nickName;

	// getter
	public String getNickName() {
		return nickName;
	}

	// setter
	public void setNickName(String nickName) throws NickNameException {
		this.nickName = nickName;
		if (nickName == null) {
			throw new NickNameException("닉네임은 null값이 될 수 없습니다.");
		}

		if (nickName.length() < 3) {
			throw new NickNameException("닉네임은 최소 2자리 이상부터 입니다.");
		}
		
		if (nickName.matches("[a-z|A-Z|ㄱ-ㅎ|가-힣]+")){
			throw new NickNameException("닉네임은 숫자나 특수문자를 포함해야 합니다.");
		}

	}
}
