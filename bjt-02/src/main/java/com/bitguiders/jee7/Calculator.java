package com.bitguiders.jee7;

public class Calculator {
 //@autowired CalService calservice;
	int sum(int a, int b) {
		int sum = a + b;
		return sum;
		//int sum = calService.add(a,b);
	}

	int multiply(int a, int b) {
		if ((a%2) == 0) {
			return a * b;
		} else {
			return a + b;
		}
	}
}
