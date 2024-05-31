package pageObjectModle;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		}
		
		private @FindBy(xpath = "//a[contains(text(),'Digital downloads')]")
		
		WebElement digitalbtn;
		
//		private @FindBy(xpath = "(//input[@value='Add to cart'])[1]")
//		
//		WebElement addtocartbtn1;
		
		
		private @FindBy(xpath =   "(//input[@value='Add to cart'])[2]")
		
		WebElement addtocartbtn2;
		
		private @FindBy(xpath  = "(//input[@value='Add to cart'])[3]")
		
		WebElement addtocartbtn3;
		
		
       private @FindAll(value = { @FindBy(xpath = "(//input[@value='Add to cart'])") })
		
		List<WebElement> cart;
		
		
		
		public void digitalbtn() {
			digitalbtn.click();
		}
//		public void addtocartbtn1() {
//			addtocartbtn1.click();
//		}
		
		public void cart() throws InterruptedException {
			for (WebElement web : cart) {
				web.click();
				Thread.sleep(2000);
			}
		}
		public void addtocartbtn2() {
			addtocartbtn2.click();
		}
		public void  addtocartbtn3() {
			addtocartbtn3.click();
		}
		

}
