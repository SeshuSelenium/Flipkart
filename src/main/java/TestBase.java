import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	
	String currentDirectory = System.getProperty("user.dir");
    //System.out.println("The current working directory is " + currentDirectory);
	public WebDriver driver;
	
	public void initialization() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
	}
	

	public void tearDown() {
		
		driver.quit();
	}

}
