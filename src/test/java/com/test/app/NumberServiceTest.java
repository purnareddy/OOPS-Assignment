package com.test.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberServiceTest {
	NumberService service = new NumberService(5);

	@Test
	public void testNumberService() {
		assertEquals(5, service.getNumber());
	}

	@Test
	public void testEvaluateNumber() {
		assertEquals("Input is odd", service.evaluateNumber(7));
		assertEquals("Input is even", service.evaluateNumber(64));
	}

}
