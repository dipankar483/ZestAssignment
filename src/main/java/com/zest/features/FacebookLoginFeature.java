package com.zest.features;

import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zest.constants.Facebook_Web_Contsants;
import com.zest.util.config;

public class FacebookLoginFeature implements config {
	
	WebDriver driver;
	
	public String login() throws InterruptedException {
		
	System.setProperty(config.Driver_Name,config.Driver_Path);
    String baseUrl = config.baseUrl;
    
    //for launching chrome browser
    WebDriver driver = new ChromeDriver();

    driver.get(baseUrl);
    driver.manage().window().maximize();
    
    WebElement userId = driver.findElement(Facebook_Web_Contsants.USERNAME);
    userId.click();
    userId.sendKeys(config.User_id);
    
    
    WebElement password = driver.findElement(Facebook_Web_Contsants.PASSWORD);
    password.click();
    password.sendKeys(config.User_password);
    
    Thread.sleep(5000);
    
    driver.findElement(Facebook_Web_Contsants.LOGIN_BUTTON).click();
    
    System.out.println("Logged in successfully");
    WebDriverWait wait = new WebDriverWait(driver, 500);
    
    Thread.sleep(5000);

    WebElement textArea = driver.findElement(Facebook_Web_Contsants.TEXT_AREA);
    Thread.sleep(2000);
    textArea.click();
    textArea.sendKeys(config.Post_Message);
    
    Thread.sleep(5000);
    
    //For clicking on Post button   
    WebElement PostButton = driver.findElement(Facebook_Web_Contsants.POST_BUTTON);  
    wait.until(ExpectedConditions.elementToBeClickable(PostButton)).click();

    Thread.sleep(4000);

    //Clicking on Nav panel
    WebElement Nav_panel = driver.findElement(Facebook_Web_Contsants.USER_NAV_PANEL);
    Nav_panel.click();
    
    //Clicking on Log out
    WebElement Logout = wait.until(ExpectedConditions.elementToBeClickable(Facebook_Web_Contsants.LOG_OUT));
    Logout.click();
    
    Thread.sleep(2000);

    //Closing the browser
    driver.quit();
    
    return config.Post_Message;
	}


}
