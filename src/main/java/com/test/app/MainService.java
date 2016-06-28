package com.test.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainService extends NumberService implements ReadService {

	public MainService(int number) {
		super(number);
	}

	public int readInput() {
		return scanner.nextInt();
	}

	public void displayOutput(String output) {
		System.out.println(output);
	}

	public static void main(String[] args) {

		MainService service = new MainService(0);
		int input;

		try {
			if (args.length == 0) {

				scanner = new Scanner(System.in);

				do {
					System.out.println("Enter a number");
					input = service.readInput();
					service.displayOutput(service.evaluateNumber(input));

				} while (input != 0);

			} else {

				scanner = new Scanner(new File(args[0]));

				while (scanner.hasNextLine()) {
					input = service.readInput();
					service.displayOutput(service.evaluateNumber(input).replace("Input is", ""));
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
