package pageObjectModle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath = "//a[text()='Register']")
	WebElement registerbtn;
	
	private @FindBy(xpath = "//a[text()='Log in']")
	WebElement login2;
	
	private @FindBy(xpath = "//a[text()='Shopping cart']")
	WebElement shoppingbtn;
	
	private @FindBy(xpath = "(//a[@class='ico-wishlist'])[1]")
	WebElement whishlistbtn;
	
	
	private @FindBy(id = "small-searchterms")
	WebElement searchtext;
	
	private @FindBy(xpath = "//input[@value='Search']")
	WebElement searchbox;
	
	
	
	
	private @FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	WebElement book;
	
	private @FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
	WebElement computer;
	
	private @FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
	WebElement electronics;
	
	private @FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]")
	WebElement shoes;
	
	private @FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
	WebElement digitaldownload;
	
	private @FindBy(xpath = "(//a[contains(text(),'Jewelry')])[1]")
	WebElement jewelry;
	
	private @FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
	WebElement giftcard;
	
	private @FindBy(xpath = "(//a[@target='_blank'])[1]")
	
	WebElement facebook;
	
	private @FindBy(xpath = "(//a[@target='_blank'])[2]")
	
	WebElement twitter;
	
	private @FindBy(xpath = "(//a[@target='_blank'])[3]")
	
	WebElement youtube;
	
	private @FindBy(xpath = "(//a[@target='_blank'])[4]")
	
	WebElement google;
	
	
	
	
	
	
	public void registerbtn() {
		registerbtn.click();
	}
	
	public void login2() {
		login2.click();
	}
	
	public void shoppingbtn() {
		shoppingbtn.click();
	}
	
	public void whishlistbtn() {
		whishlistbtn.click();
	}
	
	public void searchtext(String values) {
		searchtext.sendKeys(values);
	}
	
	public void searchbox() {
		searchbox.click();
	}
	
	public void book() {
		book.click();
	}
	
	
	
	
	public void computer() {
		computer.click();
	}
	public void electronics() {
		electronics.click();
	}
	public void shoes() {
		shoes.click();
	}
	public void digitaldownload() {
		digitaldownload.click();
	}
	public void jewelry() {
		jewelry.click();
	}
	public void giftcard() {
		giftcard.click();
	}
	
	public void facebook() {
		facebook.click();
	}
	public void twitter() {
		twitter.click();
	}
	public void youtube() {
		youtube.click();
	}
	public void google() {
		google.click();
	}

}