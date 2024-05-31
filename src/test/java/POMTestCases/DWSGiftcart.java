package POMTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectModle.GiftcartPage;

public class DWSGiftcart {
	
	@Test
	
	public void giftcart() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		GiftcartPage g1=new GiftcartPage(driver);
		g1.giftcartbutton();
		g1.addtocart();
		g1.recipientname("saurabh");
		g1.recipintemail("saurabh@gmail.com");
		g1.yourname("dipak");
		g1.youremail("dipakalkari8@gmail.com");
		g1.message("hii am saurabh");
		g1.addbtn();
	}

}
