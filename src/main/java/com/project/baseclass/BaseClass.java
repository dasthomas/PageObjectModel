package com.project.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.project.POM_model.Common;
import com.project.utilities.Utilities;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass  {
  public WebDriver driver;
  public Common common;
  public ExtentTest test;
  
  public BaseClass() {
	  
  }
	public BaseClass(WebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		common= PageFactory.initElements(driver,Common.class);
	
	}
    public Common gotocommon() {
    	return common;
    }
    
    public void takescreenshot() throws IOException {
   	  Date d=new Date();
   	  String screenshotfile=d.toString().replace(":", "_").replace(" ", "_")+".png";
   	  String filepath=Utilities.screenshotpath+"screenshots//"+screenshotfile;
    	TakesScreenshot snapshot=((TakesScreenshot)driver);
    	File SrcFile=snapshot.getScreenshotAs(OutputType.FILE);
//    	File DestFile=new File(Utilities.screenshotpath);
    	FileUtils.copyFile(SrcFile, new File(filepath));
    	test.log(LogStatus.INFO, test.addScreenCapture(filepath));
    }
}
