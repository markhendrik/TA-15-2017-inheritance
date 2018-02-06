
public class Motorcycle extends Vehicle {
	private Integer wheels;

	public Motorcycle(int year, String mark, Integer wheels) {
		super(year, mark);
		this.wheels = wheels;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Motorcycle [" + (wheels != null ? "wheels=" + wheels + ", " : "") + "year=" + getYear() + ", "
				+ (getMark() != null ? "mark=" + getMark() : "") + "]";
	}
	
	
	
}
