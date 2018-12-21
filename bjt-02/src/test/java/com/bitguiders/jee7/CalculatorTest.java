/*package com.bitguiders.jee7;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator cal = null;
	
	@Before
	public void setup(){
		 cal = new Calculator();
	}
	
	@Test
	public void sum_ak(){
		//Spock, Mockito, PowerMock, JMock ..... mocking frameworks APIS
		//Mvn dep Mockito core
		//Calculator mockCal = Mockito.mock(Calculator.class);
		//Mockito.when(cal.sum(Mockito.any(),Mockito.any()).thenDoReutn(4);
		int result = cal.sum(2, 2);
		assertEquals(4,result);
	}
	
	@Test
	public void mult_if(){
		int result = cal.multiply(4, 2);
		assertEquals(8,result);
	}
	
	@Test
	public void mult_else_condition(){
		int result = cal.multiply(3, 2);
		assertEquals(5,result);
	}
}
*/