package ch10;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		IntPredicate even = x -> x % 2 == 0;
		System.out.println(even.test(3) ? "짝수" : "홀수");
		System.out.println(even.test(4) ? "짝수" : "홀수");

		BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
		System.out.println(bp.test(3, 5) ? "앞의 숫자가 더 크다" : "뒤에 숫자가 더 크다");
		System.out.println(bp.test(5, 3));

		Predicate<String> p = x -> x.equals("");
		System.out.println();

	}

}
