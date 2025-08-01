package ch05;

public class ArgumentDemo {

	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
		int count = Integer.parseInt(args[1]);
		// 두번째 인자의 횟수 만큼 첫번째 인자를 콘솔에 추력하도록 프로그램
		for (int i = 0; i < count; i++) {
			System.out.println(args[0]);
		}
	}

	public static void nPrint(String[] args) {
//		fot(int i =0; i < count; i++ ){
//			
//		}

	}

}
