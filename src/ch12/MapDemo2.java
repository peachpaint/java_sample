package ch12;

public class MapDemo2 {

	public static void main(String[] args) {
		Nation.nations.stream().map(n -> n.getName()).limit(4).forEach(Util::print);
		System.out.println();

		Nation.nations.stream().mapToInt(n -> n.getGdpRank()).forEach(Util::print);
		System.out.println();
	}

}
