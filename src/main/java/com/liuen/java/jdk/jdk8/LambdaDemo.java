package com.liuen.java.jdk.jdk8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {
	
	/**
	 * 函数式接口：@FunctionalInterface，简称FI。简单的说，FI就是指仅含有一个抽象方法的接口。
	 * Lambda表达式并不能取代所有的匿名内部类，只能用来取代函数式接口。
	 * @param args
	 */
	public static void main(String[] args) {
		// 2. 使用lamdba表达式实现接口（）
		// 声明参数类型
		MathOperation addition = (int x, int y) -> x + y;
		// 不声明参数类型
		MathOperation subtraction = (x, y) -> x - y;
		// 使用大括号包裹返回语句
		MathOperation division = (x, y) -> {return x * y;};
		
		
		// 3. 使用接口实现类的实例对象调用接口方法（多态）
		System.out.println("addition：" + addition.operation(2, 2));
		System.out.println("subtraction：" + subtraction.operation(2, 2));
		System.out.println("division：" + division.operation(2, 2));
		
		
		List<Integer> intList = Arrays.asList(1,7,9,8,0,3,5,4,6,2);
		List<Integer> evenList = intList.stream().filter(x -> x %2 == 0).collect(Collectors.toList());
		System.out.println(evenList);
		
	}
	
	/**
	 * 定义通用接口
	 * @author liuen
	 *
	 */
	// @FunctionalInterface注解表示当前接口是函数式接口
	@FunctionalInterface
	interface GreetingService {
		void sayMessage(String msg);
	}
	
	/**
	 * 定义通用接口
	 * @author liuen
	 *
	 */
	// @FunctionalInterface注解表示当前接口是函数式接口
	@FunctionalInterface
	interface MathOperation {
		int operation(int x, int y);
	}
}
