package com.epam;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerCalTest {
    
	@Test
	void test0() throws Exception
	{
		PowerCalculator p= new PowerCalculator();
		assertEquals(243,p.power(3,5));
	}
	
	@Test
	void test1() throws Exception {
		PowerCalculator p= new PowerCalculator();
	  	Assertions.assertThrows(Exception.class, () -> {
		p.power(0,0);
	  });
	}
   
	@Test
	void test2() {
		PowerCalculator p= new PowerCalculator();
		Assertions.assertThrows(Exception.class, () -> {
		p.power(-2,-3);
	  });
	}

	@Test
	void test3() {
		PowerCalculator p= new PowerCalculator();
		Assertions.assertThrows(Exception.class, () -> {
		p.power(-2,0);
	  });
	}
}