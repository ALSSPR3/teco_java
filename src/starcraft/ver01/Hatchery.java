package starcraft.ver01;

import java.util.Iterator;

public class Hatchery {

	private int hatcheryNumber;
	private int unitCount;

	public Hatchery(int hatcheryNumber) {
		this.hatcheryNumber = hatcheryNumber;
		this.unitCount = 0;
	}

	public int getHatcheryNumber() {
		return hatcheryNumber;
	}

	public void setHatcheryNumber(int hatcheryNumber) {
		this.hatcheryNumber = hatcheryNumber;
	}

	public int getUnitCount() {
		return unitCount;
	}

	public void setUnitCount(int unitCount) {
		this.unitCount = unitCount;
	}

	public Zergling hatcheryUnitMake(String name) {
		unitCount++;
		return new Zergling(name);
	}

}
