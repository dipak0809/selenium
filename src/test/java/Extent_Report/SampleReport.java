package Extent_Report;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
	
	@Test
	public void  launchReport() {
		ExtentReports report=new ExtentReports();
		File path=new File("C:\\Users\\HP840G6\\eclipse\\Selenium\\Com.Crm.DemoWebShop\\ExtentReport.html");
		
		ExtentSparkReporter spark=new ExtentSparkReporter(path);
		
		spark.config().setDocumentTitle("A5 Batch");
		spark.config().setReportName("manikandan sir");
		spark.config().se
		spark.config().setTheme(Theme.DARK);
		
		report.attachReporter(spark);
		ExtentTest test1 = report.createTest( "test1");
		test1.log(Status.FAIL, "login function");
		report.flush();
		
	}

}
