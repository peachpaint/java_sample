package ch05;

public class StringDemo5 {
	public static void main(String[] args) {
		String formatStr = String.format("%s  $d", "JDK", 14);
		System.out.println(formatStr);

		String joinStr = String.join(",", "apple", "banana", "cherry");
		System.out.println(joinStr);

		// 문자열을 숫자로 바꿀때
//		Integer.parseInt(joinStr)
//		Long.parseLong(joinStr)
//		Double.parseDouble(joinStr)

		// 숫자를 문자열로 변경 valuOf() 숫자 + ""
		String v1 = String.valueOf(false);
		String v2 = String.valueOf(10);
		String v3 = String.valueOf(3.14);

		System.out.println(v1 + v2 + v3);

		// text block
		String html = "<html>\n" +

				"</html>\n";
		System.out.println(html);

		String html2 = """
				<html>
					<bady>
					</bady>
				</html>
				""";
		System.out.println(html2);

	}
}
