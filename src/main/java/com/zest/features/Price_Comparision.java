package com.zest.features;

import java.lang.reflect.Array;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;

import com.zest.constants.Amazon_Web_Constants;
import com.zest.constants.Flipkart_Web_Constants;

import com.zest.util.Iphone_config;

public class Price_Comparision implements Iphone_config {

	WebDriver driver;

	@Parameters("browser")

	public int priceComparison() throws InterruptedException {

		System.setProperty(Iphone_config.ChromeDriver_Name, Iphone_config.ChromeDriver_Path);
		String AmazonUrl = Iphone_config.Amazon_Url;

		// for launching chrome browser
		WebDriver driver = new ChromeDriver();

		driver.get(AmazonUrl);
		driver.manage().window().maximize();

		Thread.sleep(5000);
		WebElement searchbar = driver.findElement(Amazon_Web_Constants.SEARCH_BAR);
		searchbar.sendKeys(Iphone_config.Search_Text);

		Thread.sleep(5000);
		WebElement searchIcon = driver.findElement(Amazon_Web_Constants.SEARCH_ICON);
		// searchIcon.click();

		Actions actions = new Actions(driver);
		actions.moveToElement(searchIcon).click().build().perform();
				
		String temp [] = driver.findElement(Amazon_Web_Constants.PRICE).getText().split(",");

		System.out.println(temp[0]+temp[1]);

		
		/* Conversion of webelement to integer */
		int amazonPrice = Integer.parseInt(temp[0]+temp[1]);

		// driver.close();

		return amazonPrice;

	}
}
