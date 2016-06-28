package com.test.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseTest {
	Professor prof1 = new Professor("Fredman", "fred@man.com", 'm');
	Professor prof2 = new Professor("Allender", "allen@der.com", 'm');
	Course course1 = new Course("Algorithms", prof1 , 1300);
	Course course2 = new Course("TMs", prof2, 1300, 20);
	
	@Test
	public void testCourseStringProfessorDouble() {
		assertNotNull(course1);
		assertEquals("Algorithms", course1.getName());
		assertEquals(prof1, course1.getPerson());
		assertEquals(1300, course1.getPrice(), 0);
	}

//	@Test
//	public void testCourseStringProfessorDoubleInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetPrice() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetPrice() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetQuantity() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetQuantity() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetPerson() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}

}
