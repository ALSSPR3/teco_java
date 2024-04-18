package starcraft.ver01;

public class Gateway {

	private int gatewayNumber;
	private int unitCount;

	public Gateway(int gatewayNumber) {
		this.gatewayNumber = gatewayNumber;
		unitCount = 0;
	}
	public int getGatewayNumber() {
		return gatewayNumber;
	}

	public void setGatewayNumber(int gatewayNumber) {
		this.gatewayNumber = gatewayNumber;
	}
	public int getUnitCount() {
		return unitCount;
	}
	public void setUnitCount(int unitCount) {
		this.unitCount = unitCount;
	}

	// 기능 - 질럿을 생산하는 기능을 만들어 보세요
	public Zealot gatewayUnitMake(String name) {
		unitCount++;
		return new Zealot(name);
	}

}
