package ch05;

public class BeforArrayDemo {

	public static void main(String[] args) {
		int scorel = 90;
		int score2 = 100;
		int score3 = 70;
		int score4 = 80;
		int score5 = 60;

		double sum = score2 + score3 + score4 + score5;
		System.out.printf("학생 5명의 점수 합은? : \n" + sum);
		System.out.printf("학생 5명의 점수 평균은? : " + sum / 5);
	}

}
