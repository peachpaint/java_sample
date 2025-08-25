package ch10;

import java.util.ArrayList;

public class CollectionFrameworkDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("");
		list.add("banana");
		list.add("cherry");

		list.forEach((s) -> System.out.println(s));// Consumer 인터페이스의 구현체를 람다식으로 작성
		list.removeIf((s) -> s.length() == 0);// Predicate 인터페이스의 구현체를 람다식으로 작성
		list.forEach((s) -> System.out.println(s));// Consumer 인터페이스의 구현체를 람다식으로 작성

		// 숫자를 원소로 가지는 ArrayList 를 작성해라. 그리고 원소를 4개 추가 하는데 양수: 2개, 음수: 2개 작성
		// 리스트에서 음수값은 삭제하고 양수값만 남겨놓고 다음, 남아있는 원소를 전부 출력해라
		ArrayList<Integer> numberList = new ArrayList<>();
		numberList.add(-5);
		numberList.add(-3);
		numberList.add(6);
		numberList.add(2);

		// 객체(삼각형)을 원소로 가지는 ArrayListf를 작성해라. 원소를 3개 추가하는데 ()밑변과 높이가 ~인 객체
		// 넓이가 20보다 작은것은 리스트에서 삭제하고 남아있는 원소를 전부 출력
		ArrayList<Triangle> triangleList = new ArrayList<>();
		triangleList.add(new Triangle(10, 3));
		triangleList.add(new Triangle(10, 5));
		triangleList.add(new Triangle(5, 5));

		System.out.println("삼각형 리스트 출력");
		triangleList.forEach(t -> System.out.println(t));
		triangleList.removeIf(t -> t.findArea() < 20);
		System.out.println("넓이가 20보다 큰 삼각형 리스트 출력");
		trangleList.forEach(t -> System.out.println(t));

	}

}

class Triangle {
	int height;
	int width;

	public Triangle(int width, int height) {
		this.width = width;
	}
}
