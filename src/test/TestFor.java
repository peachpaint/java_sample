package test;

public class TestFor {

	public static void main(String[] args) {
		//직삼각형
		int n=5;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				 System.out.print("*");
			}
			 System.out.println("");
		}//i 는 행(row)/ j 는 열(column)
		
//		//구구단
//		for(int i=2;i<=9;i++) {
//			System.out.println("=== " + i + "단 ===");
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}//i 는 앞에 2~9단까지 반복/ j 는 곱하기 반복 -> 2단에 대해 1~9까지 반복 후 3단으로 넘어감
		
		//역삼각형
		int m=5;//열=높이
		for(int i =m;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
