package com.employee;

import java.util.stream.Stream;

public class FibinacciSeriesUsingJava8 {
static int[] arr= {12,1,2,13,5};
				// 0  1 2  3 4
	public static void main(String [] args) {
		  int limit = 10; // Number of Fibonacci numbers to generate
	        
	        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
	                .limit(limit)
	                .mapToInt(fib -> fib[0])
	                .forEach(System.out::print);
	
	}
}
