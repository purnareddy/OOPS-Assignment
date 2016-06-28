package com.test.app;

import junit.framework.TestCase;

public class EvaluationServiceTest extends TestCase {
	
	private int testMarks = 60;
	EvaluationService evaluate = new EvaluationService(testMarks);

	public void testGetMarks() {
		assertEquals(testMarks, evaluate.getMarks());
	}

	public void testInputMarks() {
		assertNotNull(evaluate.getMarks());
	}

	public void testEvaluateSubjectMarks() {
		assertEquals("PASS", evaluate.evaluateSubjectMarks(testMarks));
		assertEquals("FAIL", evaluate.evaluateSubjectMarks(20));
	}

}
