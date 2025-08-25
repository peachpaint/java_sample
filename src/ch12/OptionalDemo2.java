package ch12;

import java.util.OptionalDouble;

public class OptionalDemo2 {

	public static void main(String[] args) {
		OptionalDouble d = divide(3.0, 3.0);
		System.out.println(d);
		if (d.isPresent()) {
			System.out.println(d.getAsDouble());
		}

		OptionalDouble d1 = divide(3.0, 0.0);
		if (d1.isEmpty()) {
			System.out.println("0으로 나올 수 없다");
		}
		d1.ifPresentOrElse(number -> System.out.println(number -> System.out.println(number),() -> System.out.println("0으로 나올 수 없다"));
		
		OPtionalInt i = divide(3,0);
		if(i,isEmpty())){
			System.out.println("0으로 나올 수 없다");
		}
	}

	public static OptionalDouble divide(double x, double y) {
		return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
	}

}
