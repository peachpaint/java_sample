package ch05.Enum;

public class SwitchDemo {

	public static void main(String[] args) {
		NewGender gender = NewGender.여성;

//		String s = switch (gender) {
//		case 남성 -> "은 병역의무가 있다";
//		case 여성 -> "은 병역의무가 있다";
//		}
	}

}

enum NewGender {
	여성, 남성
}
