package com.zest.constants;

import org.openqa.selenium.By;

public class Facebook_Web_Contsants {
	
	public static final By USERNAME = By.id("email"); 
	
	public static final By PASSWORD = By.id("pass");
	
	public static final By LOGIN_BUTTON = By.id("loginbutton");
	
	public static final By TEXT_AREA = By.xpath("//textarea[@name='xhpc_message']");
	
	public static final By POST_BUTTON = By.xpath("//span[text()='Post']");
	
	public static final By USER_NAV_PANEL = By.id("userNavigationLabel");
	
	public static final By LOG_OUT = By.linkText("Log Out");
	

}

