package Com.crm.DwsTestCases;

import org.testng.annotations.Test;

import Com.Crm.BaseClassUtility.BaseClass;
import pageObjectModle.RegisterPage;
import pageObjectModle.WelcomePage;

public class RegisterPageFill extends BaseClass{
	
	@Test
	public void registerpage() {
		  String expectedUrl = "https://demowebshop.tricentis.com/register";
		  WelcomePage w=new  WelcomePage(driver);
		  w.registerbtn();
          String actualUrl = driver.getCurrentUrl();
          if (actualUrl.equals(expectedUrl)) {
              System.out.println("URL verification passed");
          } else {
              System.out.println("URL verification failed");
          }
          
         RegisterPage r1 = new RegisterPage(driver);

  		r1.gender_button();
  		r1.fname(firstname);
  		r1.lname(lastname);
  		r1.email(regiemail);
  		r1.pass1(password2);
  		r1.cpass(confirmpassword);
  		
  		
//  		r1.email("dipakalkari8@gmai.com");
//  		r1.pass1("Dipak@123");
//  		r1.cpass("Dipak@123");
  		//r1.Registerbutton();
  		
  		//driver.close();

          
	}

}
