package Com.crm.DwsTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.Crm.BaseClassUtility.BaseClass;
import pageObjectModle.WelcomePage;

public class AddToCartDropDownMenu extends BaseClass {

	@Test
	public void addtocart() throws InterruptedException {
		WelcomePage w = new WelcomePage(driver);
		w.digitaldownload();
		
		WebElement targetElement = driver.findElement(By.cssSelector("select[name='products-orderby']"));

        Select sel = new Select( targetElement);
		
		
		List<WebElement>Options=sel.getOptions();
		
		
		for (WebElement web : Options) {
			
			web.click();
			Thread.sleep(1000);
	}

		// second dropdown

//		 WebElement targetElement2 = driver.findElement(By.cssSelector("select[name='products-pagesize']"));
//
//	        Select sel2 = new Select( targetElement2);
//			
//			
//			List<WebElement>Options2=sel2.getOptions();
//			
//			
//			for (WebElement web : Options2) {
//				
//				web.click();
//				Thread.sleep(1000);
//			}
//		

	}

}
