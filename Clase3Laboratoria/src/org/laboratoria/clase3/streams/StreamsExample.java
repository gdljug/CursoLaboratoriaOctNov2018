package org.laboratoria.clase3.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsExample {

	public static void main(String[] args) {
		StreamsExample example = new StreamsExample();
		example.sumAllIntegers();
		example.filterIntegers();
	}
	
	public void sumAllIntegers() {
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		int sum0 = integers.stream().
					collect(
							Collectors.summingInt(Integer::intValue)
							);
		System.out.println("Sum of 1 to 20 = " + sum0);
		int sum1 = IntStream.range(1, 21)
								.sum();
		System.out.println("Sum of 1 to 20 = " + sum1);
	}
	
	public void filterIntegers() {
		List<Integer> integerNo5 = IntStream.range(1, 20)
									.filter(i -> !(i % 5 == 0))
									.mapToObj(i -> i)
									.collect(Collectors.toList());
		System.out.println(integerNo5);
	}
	
}
