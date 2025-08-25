package ch12;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchDemo {

	public static void main(String[] args) {
		boolean anyMatch = Stream.of("a1", "b1", "c1").anyMatch(s -> s.startsWith("c"));
		System.out.println(anyMatch);

		boolean allMatch = IntStream.of(10, 20, 30).allMatch(n -> n % 10 == 0);
		System.out.println(allMatch);

		// 모든 국가의 인구 수가 1억이 넘는다 => allMatch
		Stream<Nation> nationStream = Nation.nations.stream();
		boolean allMatch2 = nationStream.allMatch(n -> n.getPopulation() > 100);
		System.out.println(allMatch2);

		// 모든 국가는 섬은 아니다 (섬도 있고 섬이 아닌 나라도 있다) => anyMatch
		nationStream = Nation.nations.stream();
		boolean anyMatch2 = nationStream.anyMatch(n -> n.isIsland());
		System.out.println(anyMatch2);

		// 모든 국가의 이름은 일본이 아니다 => noneMatch
		nationStream = Nation.nations.stream();
		boolean noneMatch = nationStream.noneMatch(n -> n.getName().equals("Japan"));
		System.out.println(noneMatch);

		// 국가리스트 중에서 섬인 나라 중 가장 처음에 찾은 나라를 출력

		// 국가리스트 중에서 섬인 아닌 나라 중 아무 나라를 출력
		nationStream = Nation.nations.stream();
		Optional<Nation> any = nationStream.filter(n -> !n.isIsland()).findAny();
		System.out.println("\n섬이 아닌 나라");
		any.ifPresentOrElse(Util::print, () -> System.out.println("섬이 아닌 나라가 없음"));

		// 인구수가 10억이 넘고, GDP가 1위인 나라를 찾아 출력
	}

}
