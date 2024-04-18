package starcraft.ver01;

public class Barracks {

	private int barracksNumber;
	private int unitCount;
	
	public Barracks(int barracksNumber) {
		this.barracksNumber = barracksNumber;
		this.unitCount = 0;
	}
	
	public int getBarracksNumber() {
		return barracksNumber;
	}
	
	public void setBarracksNumber(int barracksNumber) {
		this.barracksNumber = barracksNumber;
	}
	
	public int getUnitCount() {
		return unitCount;
	}
	
	public void setUnitCount(int unitCount) {
		this.unitCount = unitCount;
	}
	
	public Marine barracksUnitMake(String name) {
		unitCount++;
		return new Marine(name);
	}
}
