package com.project.POM_model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.project.baseclass.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BaseClass {
  
	
	public LoginPage(WebDriver driver,ExtentTest test) {
		
		super(driver,test);
		
	}
	
//	public void ChromeSetUpMethods() {
//		//WebDriverManager.chromedriver().setup();
//		//driver=new ChromeDriver();	
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	
//		
//	}
	public HomePage gotohomepage() {
		
		System.out.println("go to home page ");
		test.log(LogStatus.INFO, "Opening home page");
		driver.get("https://www.flipkart.com/");
		test.log(LogStatus.INFO, "Opened url successfully");
		HomePage hp=new HomePage(driver,test);
		PageFactory.initElements(driver, hp);
		return hp;
	}
}
