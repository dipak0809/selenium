package Com.Crm.BaseClassUtility;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class captureFailScreenShot extends  dwsBaseClass implements ITestListener{

	public void onTestFailure(ITestResult result) {
		LocalDateTime date=LocalDateTime.now();
		String time = date.toString().replace(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File from=ts.getScreenshotAs(OutputType.FILE);
		File to=new File("C:\\Users\\HP840G6\\eclipse\\Selenium\\Com.Crm.DemoWebShop\\Screenshot"+time+".png");
		try {
			FileHandler.copy(from, to);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}
