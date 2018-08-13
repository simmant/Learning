
public enum EnumTesty {

	Associate(0), Senior(2), Arch(10);
	private int years;

	EnumTesty(int years) {
		this.years = years;
	}

	public int requredYears() {
		return this.years;
	}

}
