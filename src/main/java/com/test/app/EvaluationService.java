package com.test.app;

import java.util.Scanner;

public class EvaluationService {
	private int marks;
	private static Scanner scanner = new Scanner(System.in);

	public int getMarks() {
		return marks;
	}

	public static int inputMarks() {
		System.out.println("Enter marks: ");
		return scanner.nextInt();
	}

	public String evaluateSubjectMarks(int subjectMarks) {
		if (subjectMarks > 50)
			return "PASS";
		return "FAIL";
	}

	public EvaluationService(int marks) {
		this.marks = marks;
	}
}
