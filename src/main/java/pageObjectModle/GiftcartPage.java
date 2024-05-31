package pageObjectModle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftcartPage {
	
	public GiftcartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		}
		
		private @FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
		
		WebElement giftcartbutton;
		
		private @FindBy(xpath = "(//input[@value='Add to cart'])[1]")
		
		WebElement addtocart;
		
		
		private @FindBy(id = "giftcard_1_RecipientName")
		
		WebElement recipientname;
		
		private @FindBy(id = "giftcard_1_RecipientEmail")
		
		WebElement recipintemail;
		
		private @FindBy(id = "giftcard_1_SenderName")
		
		WebElement yourname;
		
		private @FindBy(id = "giftcard_1_SenderEmail")
		
		WebElement youremail;
		
		private @FindBy(id = "giftcard_1_Message")
		WebElement message;
		
		private @FindBy(id = "add-to-cart-button-1")
		WebElement addbtn;
		
		
		
		
		public void giftcartbutton() {
			giftcartbutton.click();
		}
		public void addtocart() {
			addtocart.click();
		}
		public void recipientname(String values) {
			recipientname.sendKeys(values);
		}
		public void  recipintemail(String values) {
			 recipintemail.sendKeys( values);
		}
		public void yourname(String values ) {
			yourname.sendKeys(values);
		}
		public void youremail(String values) {
			youremail.sendKeys(values);
		}
		
		public void message(String values ) {
			message.sendKeys(values);
		}
		public void addbtn() {
			addbtn.click();
		}

}
