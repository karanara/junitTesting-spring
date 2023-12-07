package com.luv2code.junitdemo.tdd;

public class FizzBuzzClass {

	public static String compute(int i) {
		StringBuilder output = new StringBuilder();
		if(i%3==0) {
			output.append("Fizz");
		}
		if(i%5==0) {
			output.append("Buzz");
		}
		if (output.isEmpty()) {
            output.append(i);
        }
		return output.toString();
	}
}
