package com.subba.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeServiceeTest {

	@Test
	public void testGetEmployeeName() {
		
		EmployeeService es=new EmployeeService();
		assertEquals("","Avinash",new EmployeeService().getEmployeeName(1234));
	}
	
	@Test
	public void testGetEmployeeName1() {
		
		EmployeeService es=new EmployeeService();
		assertEquals("","Invalid ID",new EmployeeService().getEmployeeName(457));
	}

	@Test
	public void testGetEmployeeId() {
		//fail("Not yet implemented");
	}

}
