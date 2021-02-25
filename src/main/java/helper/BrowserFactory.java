package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Vipul Sandhir\\Automation\\BrowserDriver\\Firefox\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Vipul Sandhir\\Automation\\BrowserDriver\\Chrome\\chromedriver_win32\\chromedriver.exe");			
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","D:\\Vipul Sandhir\\Automation\\BrowserDriver\\IE\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\Vipul Sandhir\\Automation\\BrowserDriver\\Edge\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
