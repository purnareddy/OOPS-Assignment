package com.test.app;

import java.util.Scanner;

public class NumberService {

	protected static Scanner scanner = new Scanner(System.in);
	private int number;

	public NumberService(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public String evaluateNumber(int number) {
		if (number % 2 == 1)
			return "Input is odd";
		else
			return "Input is even";
	}

	public static void main(String[] args) {
		System.out.println("Enter a number");
		NumberService service1 = new NumberService(NumberService.scanner.nextInt());
		System.out.println(service1.evaluateNumber(service1.number));
	}
}
