package com.project.POM_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.project.baseclass.BaseClass;
import com.project.utilities.Utilities;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage extends BaseClass {
	
	
public  HomePage(WebDriver driver,ExtentTest test) {
		
		super(driver,test);
		
		
	}
    public void dologin() {
    	
    	System.out.println("Enter credentials for login");
    	driver.findElement(By.xpath(Utilities.Username)).sendKeys("9940521262");
    	driver.findElement(By.xpath(Utilities.password)).sendKeys("D@sdh3das");
    	driver.findElement(By.xpath(Utilities.signin)).click();
    	test.log(LogStatus.INFO, "Logged in successfully");
    	
    	
    }
	public ElectronicsPage selectElectronics() {
		System.out.println("Selected Electronics");
		
		
		ElectronicsPage ep=new ElectronicsPage(driver,test);
		PageFactory.initElements(driver, ep);
		return ep;
		
	}
}
