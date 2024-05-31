package Com.Crm.BaseClassUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Com.Crm.ExternalFileUtility.readData;
import pageObjectModle.LoginPage;
import pageObjectModle.WelcomePage;

public class BaseClass {

	public WebDriver driver;
	String url;
	String username;
	String password;
	String browser;
	
	String Rname;
	String Remail;
	String yourName;
	String youremail;
	String message;
	public String Name;
	
	public String firstname;
	public String lastname;
	public String regiemail;
	public String password2 ;
	public String confirmpassword;
	
	
	

	@BeforeSuite
	public void beforeSuite() throws IOException {
		System.out.println("dataBase Connectivity");
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		browser = readData.ReadPropertyData("browser");
		url = readData.ReadPropertyData("url");
		username = readData.ReadPropertyData("username");
		password = readData.ReadPropertyData("password");
		
		
		Rname=readData.ReaddataExcel().getRow(0).getCell(1).toString();
		Remail=readData.ReaddataExcel().getRow(1).getCell(1).toString();
		yourName=readData.ReaddataExcel().getRow(2).getCell(1).toString();
		youremail=readData.ReaddataExcel().getRow(3).getCell(1).toString();
		Name=readData.ReaddataExcel().getRow(4).getCell(1).toString();
		
		firstname=readData.ReaddataExcel().getRow(5).getCell(1).toString();
		lastname=readData.ReaddataExcel().getRow(6).getCell(1).toString();
		 regiemail=readData.ReaddataExcel().getRow(7).getCell(1).toString();
		password2=readData.ReaddataExcel().getRow(8).getCell(1).toString();
		confirmpassword=readData.ReaddataExcel().getRow(9).getCell(1).toString();


		
	}

	@BeforeClass
	public void beforeClass() {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}

		else {
			System.out.println("browser not found");
		}

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);

	}

	@BeforeMethod
	public void beforeMethod() {
		WelcomePage w = new WelcomePage(driver);
		w.login2();

		LoginPage l = new LoginPage(driver);
		l.loginemail(username);
		l.pass(password);

	}
	
	

	@AfterClass
	public void logout() {
		// driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}

	@AfterTest
	public void closeBrowser() {
		if (driver != null) {
			//driver.quit();
		}
	}

	@AfterSuite
	public void disconnectDatabase() {
		System.out.println("disconnect Data Base");
	}

}
