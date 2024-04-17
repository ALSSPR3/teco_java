package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;

	// getter, setter 메서드를 만들어 주세요

	public String getName() {
		return this.name;
	}

	public void setName(String inputName) {
		this.name = inputName;
	}

	//
	public int gethp() {
		return this.hp;
	}

	public void setHp(int inputHp) {
		if (inputHp < 0) {
			System.out.println("잘못된 입력");
		} else {
			this.hp = inputHp;
		}
	}

	//
	public int getPower() {
		return this.power;
	}

	public void setPower(int inputPower) {
		if (inputPower < 0) {
			System.out.println("잘못된 입력");
		} else {
			this.power = inputPower;
		}
	}

	//
	public double getDefense() {
		return this.defense;
	}

	public void setDefense(double inputDefense) {
		this.defense = inputDefense;
	}

	//
	public boolean getIsDie() {
		return this.isDie;
	}

	public void setIsDie(boolean inputIsDie) {
		this.isDie = inputIsDie;
	}

}
