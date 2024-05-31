package Com.crm.DwsTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Com.Crm.BaseClassUtility.BaseClass;
import pageObjectModle.WelcomePage;

public class TwitterPage extends BaseClass {
	@Test

	public void twitterpage() throws InterruptedException {

		JavascriptExecutor j = (JavascriptExecutor) driver;

		
		j.executeScript("window.scrollBy(0,7000)");// vertical scrolling top to bottom
		
		WelcomePage w=new  WelcomePage(driver);
		w.twitter();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("(//span[text()='Create account'])[1]")).click();
		
		driver.findElement(By.xpath("input[name='name']")).sendKeys(Name);
		
		
		driver.navigate().back();
		
		driver.close();

	}

}
