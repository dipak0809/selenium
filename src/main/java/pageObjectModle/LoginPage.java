package pageObjectModle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		}
		
		private @FindBy(xpath = "//a[text()='Log in']")
		
		WebElement loginbutton;
		
		private @FindBy(css = "input[class='email']")
		
		WebElement Loginemail;
		
		
		private @FindBy(css = "input[class='password']")
		
		WebElement pass;
		
		private @FindBy(id = "RememberMe")
		
		WebElement rediobutton;
		
		private @FindBy(css = "input[value='Log in']")
		
		WebElement log2;
		
		
		public void loginbutton() {
			loginbutton.click();
		}
		public void loginemail(String values) {
			 Loginemail.sendKeys(values);
		}
		public void  pass(String values) {
			 pass.sendKeys(values);
		}
		public void rediobutton() {
			rediobutton.click();
		}
		public void log2() {
			log2.click();
		}
		
		
}
