package com.zest.functional.test;

import org.testng.annotations.Test;

import com.zest.features.Price_Comparision;

public class PriceComparisonTest {
	
	Price_Comparision pc = new Price_Comparision();
	
	@Test 
	public void TestNGAssert_VerifyLowerPrice() throws InterruptedException{
		
		/* String price = */ pc.priceComparison();
		
		
	}	

}
