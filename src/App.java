
public class App {
	public static void main(String[] args) {
		
		/* Abstraktsete klasside põhjal objekte luua ei saa.
		Vehicle mootorsoiduk1 = new Vehicle(2001, "Toyota");
		Vehicle mootorsoiduk2  = new Vehicle("BMW");
		Vehicle mootorsoiduk3 = mootorsoiduk1;
		
		mootorsoiduk2.setYear(2003);
		System.out.println(mootorsoiduk2.getMark());
		System.out.println(mootorsoiduk1);
		System.out.println(mootorsoiduk2);
		System.out.println(mootorsoiduk3); */
		
		Car auto1 = new Car(2011, "Mesikäpp", "SugarFree");
		System.out.println(auto1);
		
		Motorcycle mootorratas1 = new Motorcycle(1967,"HD", 2);
		System.out.println(mootorratas1);

	}
}
