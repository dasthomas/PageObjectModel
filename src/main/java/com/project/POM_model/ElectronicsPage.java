package com.project.POM_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.project.baseclass.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;

public class ElectronicsPage extends BaseClass {
	
	
	
	public  ElectronicsPage(WebDriver driver,ExtentTest test) {
			
			super(driver,test);
			
		}
	public void selectelctronics() {
		System.out.println("selected your electronics ");
	}
  public TVandAppliancesPage selecttv() {
	
	 
	  
	  return PageFactory.initElements(driver, TVandAppliancesPage.class);
	  
  }
}
