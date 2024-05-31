package Extent_Report;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.Crm.BaseClassUtility.dwsBaseClass;
import pageObjectModle.LoginPage;
@Listeners(  ExtentReportPackage.TakeScreenShotWithReport.class)
public class ExtentReportTestCase extends dwsBaseClass{
	@Test
public void correctdws() {
		
		driver.get("https://demowebshop.tricentis.com/");
		LoginPage p=new LoginPage(driver);
		p.loginbutton();
		p.loginemail("dipakalkari8@gmail.com");
		p.pass("Dipak@123");
		p.rediobutton();
		p.log2();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	@Test
	public void dwsWrong() {
		
		driver.get("https://demowebshop.tricentis.com/");
		LoginPage p=new LoginPage(driver);
		p.loginbutton();
		p.loginemail("dipakalkari8@gmail.com");
		p.pass("Dipak@124");
		p.rediobutton();
		p.log2();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	@Test(dependsOnMethods = "dwsWrong")
	public void redbus() {
		driver.get("https://www.redbus.in/");
		assertEquals("dipak", "deepak");
	
	
	}
	
	

	

}
