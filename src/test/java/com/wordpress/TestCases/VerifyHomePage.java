package com.wordpress.TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.wordpress.Pages.LoginPageNew;
import helper.BrowserFactory;

public class VerifyHomePage {
	@Test
	public void checkValidSearch()
	{
		//This will launch browser and specific url
		WebDriver driver = BrowserFactory.startBrowser("chrome","http://demosite.center/wordpress/wp-login.php");
		
		//Created object using PageFactory
		LoginPageNew login_page = PageFactory.initElements(driver, LoginPageNew.class);
		
		//Call the method
		login_page.login_wordpress("admin","demo123");
		
	}

}
