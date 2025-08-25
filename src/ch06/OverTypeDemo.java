package ch06;

public class OverTypeDemo {

	public static void main(String[] args) {
		vehicle v = new Oldcar();
		System.out.println(v.name);
		v.whoami();
		vehicle.move();

		Oldcar oc = new Oldcar();
		System.out.println(oc.name);
		oc.whoami();
		Oldcar.move();
		oc.move();

		v = new Sportscar();
		v.whoami();

//		Vehicle[] vehicles = new Vehicle[2];
//		Vehicle[0] = new Oldcar();
//		Vehicle[0] = new Sportscar();
//
//		for (vehicle vehicle : vehivles) {
//			vehicle.whoami();
//			vehicle.move();
//		}
	}

}
