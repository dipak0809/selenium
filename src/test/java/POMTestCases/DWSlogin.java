package POMTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectModle.LoginPage;

public class DWSlogin {
	@Test
	public void Login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		LoginPage p=new LoginPage(driver);
		p.loginbutton();
		p.loginemail("dipakalkari8@gmail.com");
		p.pass("Dipak@123");
		p.rediobutton();
		p.log2();
		
		}

}