package ch10;

import java.util.Arrays;

public class ComparableDemo {

	public static void main(String[] args) {
		RectAngle[] rectAngles = { new RectAngle(3, 5), new RectAngle(2, 10), new RectAngle(5, 7), };
		Arrays.sort(rectAngles);// compareTo의 기본 정렬 방식 정열, ascending 방식
//		Arrays.sort(rectAngles, new Comparator<RectAngle>() {
//			@Override
//			public int compare(RectAngle o1, RectAngle o2) {
//				return o1.height - o2.height;
//			};

		Arrays.sort(rectAngles, (o1, o2) -> o1.getHeight() - o2.getHeight());
//		});// compareTo의 기본 정렬 방식이 아닌 정열, descending 방식 ->높이가 더 큰것을 앞으로 오도록 정렬

		System.out.println(Arrays.toString(rectAngles));

	}

}

class RectAngle implements Comparable<RectAngle> {
	private int width, height;

	public RectAngle(int width, int height) {
		this.width = width;
		this.setHeight(height);
	}

	public int findArea() {
		return width * getHeight();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("tkrkrgud[폭=%d, 높이=%d]", width, getHeight());
	}

	@Override
	public int compareTo(RectAngle o) {
		// TODO Auto-generated method stub
		return this.findArea() - o.findArea();
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
