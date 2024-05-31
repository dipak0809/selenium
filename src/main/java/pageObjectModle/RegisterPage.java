package pageObjectModle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	private @FindBy(id = "gender-male")

	WebElement gender_button;
	
	private @FindBy(id = "FirstName")
	
	WebElement fname;
	
	private @FindBy (id = "LastName")
	
	WebElement lname;
	
	private @FindBy(css = "input[name='Email']")
	
	WebElement email;
	
	
	private @FindBy(id = "Password")
	
	WebElement pass1;
	
	
	private @FindBy(id = "ConfirmPassword")
	
	WebElement cpass;
	
	private @FindBy(id = "register-button")
	
	WebElement Registerbutton;
	
	
	
	public void gender_button() {
		gender_button.click();
	}
	public void fname(String values) {
		fname.sendKeys(values);
	}
	public void lname(String values) {
		lname.sendKeys(values);
	}
	public void email(String values) {
		email.sendKeys(values);
	}
	public void pass1(String values) {
		pass1.sendKeys(values);
	}
	public void cpass(String values) {
		cpass.sendKeys(values);
	}
	public void Registerbutton () {
		Registerbutton.click();
	}




}
