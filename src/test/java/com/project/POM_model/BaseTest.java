package com.project.POM_model;

import org.openqa.selenium.WebDriver;

import com.project.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	public ExtentReports extend=ExtentManager.getInstance();
	public ExtentTest test;
	 public WebDriver driver;
	
 public void init() {
 }
 
 
}

