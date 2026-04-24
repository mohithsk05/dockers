package com.google;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator calc = new Calculator();

        int expectedResult = 4;
        int actualResult = calc.add(2, 2);

        assertEquals(expectedResult, actualResult);
        
    	int er=5;
		int ar=calc.sub(6,1);
		assertEquals(er,ar);
	}
	

}