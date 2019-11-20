

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipKartPage {
	
	public static @FindBy(xpath ="//button[@class='_2AkmmA _29YdH8']") WebElement popup;
	
	public static @FindBy(xpath="//input[@placeholder='Search for products, brands and more'][1]") WebElement serachBox ;
	
	public static @FindBy(xpath="//div[@class='_1qKb_B']//select[@class='fPjUPw']") WebElement minButton;
	
	public static @FindBy(xpath="//div[@class='_1qKb_B']//select[@class='fPjUPw']//child::*[contains(text(),'500')][1]") WebElement minPrice ;
	
	public static @FindBy(xpath="//div[@class='_2rIV_l']//img[@src='//img1a.flixcart.com/www/linchpin/fk-cp-zion/img/fa_8b4b59.png']") WebElement drag ;
	
	public static @FindBy(xpath="//span[@class='_1nBnpg' or text()='Deliver to']") WebElement dragToDelivery;
	
	public static @FindBy(xpath="//li[@id='swatch-0-size']/parent::ul[@class='fUBI-_']/child::li[3]") WebElement shoeSize;
	
	public static @FindBy(xpath="//form[1]/child::button[1]") WebElement buyNow;
	
	//public static @FindBy(xpath="") WebElement ;

}
