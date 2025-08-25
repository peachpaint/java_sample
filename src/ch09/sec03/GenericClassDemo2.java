package ch09.sec03;

import java.util.ArrayList;

public class GenericClassDemo2 {

	public static void main(String[] args) {

		Cup<Beer> beerCup = new Cup<>();

//		beerCup.setBeverage(new Ball("red"));
//		beerCup.setBeverage(new Boricha());

		beerCup.setBeverage(new Beer());
		Beer b = beerCup.getBeverage();

		Cup<Boricha> borichaCup = new Cup<>();
		borichaCup.setBeverage(new Boricha());
		Boricha b1 = borichaCup.getBeverage();
		b1.eat();

		ArrayList<Integer> intArr = new ArrayList<>();// <>안에 객체만 작성되야 하지만 정수를 넣어도 됨->자동 박싱됨
		intArr.add(10);

		int i = intArr.get(0);// 자동 언박싱됨
		System.out.println(i);

		ArrayList list = new ArrayList();// raw 타입 사용은 권장하지 않음
		list.add(10);
		list.add(10.0);
		list.add("hello");
		list.add(new Beverage());

		System.out.println(list);
		Integer i2 = (Integer) list.get(3);

	}

}

class Cup<T> {
	private T bevarage;

	public T getBeverage() {
		return bevarage;
	}

	public void setBeverage(T beverage) {
		this.bevarage = beverage;
	}
}

class Beverage {

}

class Beer extends Beverage {
	void drink() {
		System.out.println("맥주를 마신다");
	}
}

class Boricha extends Beverage {
	void eat() {
		System.out.println("보리차를 마신다");
	}
}