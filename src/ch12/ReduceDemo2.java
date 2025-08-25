package ch12;

import java.util.stream.Stream;

public class ReduceDemo2 {

	public static void main(String[] args) {
		// Nation 의 nations 를 스트림으로 변환
		// GDP 가 20위 이내인 나라들의 인구 총합을 구하라(단위 : 백만명)
		Stream<Nation> ns = Nation.nations.stream();
		double reduce = ns.filter(n -> n.getGdpRank() <= 20).mapToDouble(n -> n.getGdpRank()).reduce(0.0,
				(n1, n2) -> n1 + n2);

	}

}
