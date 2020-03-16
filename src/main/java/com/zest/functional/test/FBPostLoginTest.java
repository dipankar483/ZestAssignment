package com.zest.functional.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zest.features.FacebookLoginFeature;
import com.zest.util.config;

public class FBPostLoginTest{

	FacebookLoginFeature flt = new FacebookLoginFeature();
	
	@Test 
	public void TestNGAssert_VerifyPostLogin() throws InterruptedException{
		
		String postLoginMsg = flt.login();
		
		Assert.assertEquals(postLoginMsg, config.Post_Message);

	}
}
