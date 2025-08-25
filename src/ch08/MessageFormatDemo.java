package ch08;

import java.text.MessageFormat;

public class MessageFormatDemo {

	public static void main(String[] args) {
		String java = "Java";
		int version = 8;

		System.out.println(String.format("%s, %d", java, version));

		String mf = MessageFormat.format("{0}, {1} : {0} {0}", java, version);// 지정 할 배열 순서를 지정해줘야 됨
		System.out.println(mf);
	}

}
