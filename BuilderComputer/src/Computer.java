
public class Computer {
	private final String cpu;
	private final String ram;
	private final String storage;
	private final String graphicsCard;
	private final String coolingSystem;
	private final String powerSupply;

	// private constructor goes here...

	private Computer(Builder b) {
		this.coolingSystem = b.coolingSystem;
		this.cpu = b.cpu;
		this.graphicsCard = b.graphicsCard;
		this.powerSupply = b.powerSupply;
		this.ram = b.ram;
		this.storage = b.storage;
	}

	// getter methods go here....
	public String getCpu() {
		return this.cpu;
	}

	public String getRam() {
		return this.ram;
	}

	public String getStorage() {
		return this.storage;
	}

	public String getPowerSupply() {
		return this.powerSupply;
	}

	public String getCoolingSystem() {
		return this.coolingSystem;
	}

	public String getGraphicsCard() {
		return this.graphicsCard;
	}

	@Override
	public String toString() {
		return "CPU is " + this.cpu + "\nRAM is " + this.ram + "\nStorage is " + this.storage + "\nPower Supply is "
				+ this.powerSupply + "\nGraphics Card is " + this.graphicsCard + "\nCooling System is "
				+ this.coolingSystem;
	}

	public static class Builder {
		private final String cpu;
		private final String ram;
		private final String storage;
		private String graphicsCard = "";
		private String coolingSystem = "";
		private final String powerSupply;

		public Builder(String cpu, String ram, String storage, String power) {
			this.cpu = cpu;
			this.ram = ram;
			this.storage = storage;
			this.powerSupply = power;
		}

		public Builder setGraphicsCard(String g) {
			this.graphicsCard = g;
			return this;
		}

		public Builder setCoolingSystem(String c) {
			this.coolingSystem = c;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}
}
