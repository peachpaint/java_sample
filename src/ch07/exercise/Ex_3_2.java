package ch07.exercise;

public class Ex_3_2 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(1, 2);
		Triangle t2 = new Triangle(1, 3);
		Line l1 = new Line(10);

		int res = t1.compareTo(t2);
		// int res = t1.compareTo(t2);
		int res1 = t1.compareTo(l1);
		if (res1 > 0) {
			System.out.println(t1 + " 이 더 큽니다.");
		} else if (res1 != -9999999 && res1 < 0) {
			System.out.println(t2 + " 이 더 큽니다.");
		} else if (res1 == 0) {
			System.out.println(t1 + " 과 " + t2 + " 의 크기가 동일합니다.");
		} else {
			System.out.println("비교할 수 없습니다.");
		}
	}

}

class Triangle implements Comparable {
	int width;
	int height;

	public Triangle(int width, int heigth) {
		this.width = width;
		this.height = height;
	}

	private double findArea() {
		return (width * height) / (double) 2;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Triangle t) {
			double comp = findArea() - t.findArea();
			if (comp < 0) {
				return -1;
			} else if (comp > 0) {
				return 1;
			} else {
				return 0;
			}
		}
		return -999999;
	}

	@Override
	public boolean equals(Object obj) {
		if (o instanceof Triangle t) {
			return findArea() == t.findArea();

		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("삼각형[width = %d, height = %d, 넓이 = %d]", width, height, (int) findArea());
	}

}
