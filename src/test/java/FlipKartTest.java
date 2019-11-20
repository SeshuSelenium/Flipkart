

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Implementations.RetryAnalyzer;

public class FlipKartTest extends TestBase{

	@BeforeMethod
	public void start() throws Throwable {
		
		initialization();
		
	}
	
	
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public  void booking() throws InterruptedException {
		
		FlipKartPage fp = PageFactory.initElements(driver, FlipKartPage.class);
		
		fp.popup.click();
		
		fp.serachBox.sendKeys("shoes");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,100)");
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		WebElement min = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_1qKb_B']//select[@class='fPjUPw']")));
		
		Thread.sleep(2000);
		
		min.click();

		fp.minPrice.click();
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView()",fp.drag);
		
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_36jUgy']//child::*[contains(text(),'Nike')]")));
		
		element.click();
				
		String parent = driver.getWindowHandle();
		
		System.out.println(parent);
		
		WebElement ele =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_3O0U0u']//child::div[contains(@data-id,'SHOFG2B26TGKJ64S')]")));
		
		ele.click();
		
		Set<String> wins = driver.getWindowHandles();
		
		for (String ch: wins) {
			
			if (!parent.equalsIgnoreCase(ch)) {
	
				driver.switchTo().window(ch);
				
				js.executeScript("arguments[0].scrollIntoView()",fp.dragToDelivery);
			
				fp.shoeSize.click();
				
				fp.buyNow.click();
				
			}
			
		}	
		
	
	}
	
	@AfterMethod
	public void endTest() {
		
		//tearDown();
		
	}

}
