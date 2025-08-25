package ch10;

public class MethodRefDemo {

	public static void main(String[] args) {
		Pickable p;
//		p = (s, i) -> s.charAt(i);
		p = String::charAt;
		System.out.println(p.pick("hello", 4));

		Computable c;

		Utils utils = new Utils();
//		c = (a, b) -> utils.add(3, 5);
		c = utils::add;
		System.out.println(c.compute(3, 5));

		Mathmatical m;
//		m = d -> Math.abs(d);
		m = Math::abs;
		System.out.println(m.calculate(-12.543));

	}

}

@FunctionalInterface
interface Mathmatical {
	double calculate(double d);
}

@FunctionalInterface
interface Pickable {
	char pick(String s, int i);
}

@FunctionalInterface
interface Computable {
	int compute(int h, int y);
}

class Utils {
	int add(int a, int b) {
		return a + b;
	}
}
