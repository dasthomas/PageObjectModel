package com.project.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.project.POM_model.BaseTest;
import com.project.POM_model.ElectronicsPage;
import com.project.POM_model.HomePage;
import com.project.POM_model.LoginPage;
import com.project.baseclass.BaseClass;
import com.project.utilities.ExtentManager;
import com.project.utilities.Utilities;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProfile extends BaseTest {
	
@Test
  public void profile() throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	 test=extend.startTest("Test Profile");
	test.log(LogStatus.INFO, "Starting login");
	LoginPage lp=new LoginPage(driver,test);
	PageFactory.initElements(driver,lp);
	//lp.ChromeSetUpMethods();
	HomePage hp=lp.gotohomepage();
	
	hp.dologin();
	hp.takescreenshot();
	ElectronicsPage ep=hp.selectElectronics();
	ep.selectelctronics();
	ep.gotocommon().mousehover();
	test.log(LogStatus.PASS, "Passed test case");
	ep.takescreenshot();	
	
     
	extend.endTest(test);
	extend.flush();
}
}
