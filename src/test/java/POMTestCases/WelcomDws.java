package POMTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectModle.WelcomePage;

public class WelcomDws {
	@Test
	public void welcomePage() {
		
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/login");
	
	WelcomePage w=new  WelcomePage(driver);
	
	
	w.registerbtn();
	w.login2();
	w.shoppingbtn();
	w.whishlistbtn();
	w.searchtext( "watches");
	w.searchbox();
	
	w.book();
	driver.navigate().refresh();
	
	w.computer();
	driver.navigate().refresh();

	w.electronics();
	driver.navigate().refresh();

	w.shoes();
	driver.navigate().refresh();

	w.digitaldownload();
	driver.navigate().refresh();

	

	w.jewelry();
	driver.navigate().refresh();
	
	w.giftcard();
	driver.navigate().refresh();
	
	w.youtube();
	driver.navigate().refresh();
	
	w.google();
	}
	
}
