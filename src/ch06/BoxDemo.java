package ch06;

public class BoxDemo {

	public static void main(String[] args) {
//		ColoredBox cb = new ColoredBox(); // new Box 가 호출됨
	}

}

class Box {
	public Box(String color) {

		System.out.println("Box 생성");
	}
}

//class ColoredBox extends Box {
////	public ColoredBox() {
////		System.out.println("ColoredBox 생성");
////	}
//	String color;
//
////	public ColoredBox(String color) {
////		this.color = color;
////		System.out.println(color + "ColoredBox 생성");
////
////	}
//}
