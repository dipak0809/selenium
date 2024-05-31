package POMTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectModle.RegisterPage;
import pageObjectModle.WelcomePage;

public class Register {
	@Test
	public void Register1() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");

		driver.findElement(By.xpath("//a[text()='Register']")).click();

		RegisterPage r1 = new RegisterPage(driver);

		r1.gender_button();
		r1.fname("dipak");
		r1.lname("alkari");
		r1.email("dipakalkari8@gmai.com");
		r1.pass1("Dipak@123");
		r1.cpass("Dipak@123");
		
		driver.close();

	}

}
