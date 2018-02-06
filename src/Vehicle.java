
public abstract class Vehicle  {
	// private fields
	private int year;
	private String mark;
	
	// Constructor
	public Vehicle(int year, String mark) {
		this.year = year;
		this.mark = mark;
	}
	
	// Constructor
	public Vehicle() {}
	
	// Constructor
	public Vehicle(String mark) {
		this.mark = mark;
	}

	// Getters and setters
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}

	@Override
	public String toString() {
		return "Vehicle [year=" + year + ", " + (mark != null ? "mark=" + mark : "") + "]";
	}
}
