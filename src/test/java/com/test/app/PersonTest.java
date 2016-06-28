package com.test.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
	
	Person person1 = new Person("Purna", "prc63@rutgers.edu", 'm');
	
	@Test
	public void testPerson() {
		assertNotNull(person1);
		assertEquals("Purna", person1.getName());
		assertEquals("prc63@rutgers.edu", person1.getEmail());
		assertEquals('m', person1.getGender());
	}

	@Test
	public void testGetEmail() {
		assertEquals("prc63@rutgers.edu", person1.getEmail());
		assertNotNull(person1.getEmail());
	}

	@Test
	public void testSetEmail() {
		Person person2 = new Person("aPerson", "old@email.com", 'f');
		person2.setEmail("new@email.com");
		assertEquals("new@email.com", person2.getEmail());
	}

	@Test
	public void testGetName() {
		assertEquals("Purna", person1.getName());
		assertNotNull(person1.getName());
	}

	@Test
	public void testGetGender() {
		assertEquals('m', person1.getGender());
		assertNotNull(person1.getGender());
	}

	@Test
	public void testToString() {
		assertEquals("Purna (m) at prc63@rutgers.edu", person1.toString());
	}

}
