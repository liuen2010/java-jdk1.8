package com.liuen.java.jdk.jdk8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,7,9,8,0,3,5,4,6,2);
		List<Integer> evenList = intList.stream().filter(x -> x %2 == 0).collect(Collectors.toList());
		System.out.println(evenList);
		
		List<Integer> sortedList = intList.stream()
				.filter(x -> x %2 == 0)
				.sorted((x, y) -> x.compareTo(y))
				.collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
