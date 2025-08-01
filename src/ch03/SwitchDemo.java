package ch03;

public class SwitchDemo {

	public static void main(String[] args) {
//		int number = 2;
//
//		switch (number) {
//		case 3:
//			System.out.print("*");
//		case 2:
//			System.out.print("*");
//		case 1:
//			System.out.print("*");
//		default:
//			System.out.print("*");
//		}

		String day = "금";
		dayCheck(day);

	}

	private static void dayCheckreturn(String day) {
		String gubun = switch (day) {
		case "월", "화", "수", "목", "금" -> "평일";
		case "토", "일" -> "주말";
		default -> "*";
		};
//		return gubun;
	}

	private static void dayCheck(String day) {
		switch (day) {
		case "월", "화", "수", "목", "금" -> System.out.println(day + "평일입니다");
		case "토", "일" -> System.out.println(day + "주말입니다");
		default -> System.out.println("*");
//		case "월":
//		case "화":
//		case "수":
//		case "목":
//		case "금":
//			System.out.println(day + "평일입니다");
//			break;
//		case "토":
//		case "일":
//			System.out.println(day + "주말입니다");
//		default:
//			System.out.println("*");
		}
	}

}
