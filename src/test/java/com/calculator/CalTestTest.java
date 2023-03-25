package com.calculator;

import org.junit.Assert;
import org.junit.Test;

//import junit.framework.Assert;

public class CalTestTest {

	
	@Test
	public void test() {
	//CalculatorMain CalculatorMain= new CalculatorMain();
	Assert.assertEquals(22,CalculatorMain.add(10, 12));
	Assert.assertEquals(2,CalculatorMain.sub(8,6));
	Assert.assertEquals(35,CalculatorMain.multi(7, 5));
	Assert.assertEquals(4,CalculatorMain.div(20, 5));
	//Assert.assertEquals(12.6,CalculatorMain.module(12.7, 23.7));
	//Assert.assertEquals(19.2,CalculatorMain.module(24.0,80.0));
	}

}

