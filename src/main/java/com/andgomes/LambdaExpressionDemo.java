package com.andgomes;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
	
		MyFunc myFunc = () -> "Hello World!";
		
		System.out.println(myFunc.func());
	
	}

}
