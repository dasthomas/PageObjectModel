package com.project.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.project.POM_model.ElectronicsPage;
import com.project.POM_model.HomePage;
import com.project.POM_model.LoginPage;
import com.project.baseclass.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest extends BaseClass  {

	@Test
	  public void profile() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		//lp.ChromeSetUpMethods();
		HomePage hp=lp.gotohomepage();
		
		hp.dologin();
		ElectronicsPage ep=hp.selectElectronics();
		ep.selectelctronics();
		ep.gotocommon().mousehover();
		
		
	}
}
