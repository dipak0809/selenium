package POMTestCases;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectModle.AddToCartPage;

public class DwsAddToCart {

	@Test
	public void addtocartfunction() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");

		AddToCartPage a1 = new AddToCartPage(driver);

		a1.digitalbtn();
        Thread.sleep(2000);
		a1.cart();
		 Thread.sleep(2000);
//		driver.navigate().refresh();
//		a1.addtocartbtn1();
//		driver.navigate().refresh();
//		a1.addtoca  rtbtn2();
//		driver.navigate().refresh();
//		a1.addtocartbtn3();
	}
}
