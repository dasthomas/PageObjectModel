package com.project.POM_model;

import org.openqa.selenium.WebDriver;

public class Common    {

	WebDriver driver;
	
	public Common(WebDriver driver) {
		this.driver=driver;
	}
	
	public void mousehover() {
		System.out.println("in common");
	}
	
	public void logout() {
		
	}
}
