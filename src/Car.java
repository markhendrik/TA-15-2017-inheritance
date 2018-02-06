
public class Car extends Vehicle {

	private String model;

	public Car(int year, String mark, String model) {
		super(year, mark);
		this.model = model;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [" + (model != null ? "model=" + model + ", " : "") + "year=" + getYear() + ", "
				+ (getMark() != null ? "mark=" + getMark() : "") + "]";
	}


	
	
}
