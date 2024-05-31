package ExtentReportPackage;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Com.Crm.BaseClassUtility.dwsBaseClass;

public class TakeScreenShotWithReport extends dwsBaseClass implements ITestListener {

	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;

	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test = report.createTest(name);
		test.log(Status.INFO, "welcome to our class");
		test.log(Status.INFO, "my wonderfull follow");

	}

	public void onTestSuccess(ITestResult result) {

		test.log(Status.PASS, "your test case is pass");
	}

	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();

		test.log(Status.FAIL, "your test case is failed");
		TakesScreenshot ts = (TakesScreenshot) driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);

	}

	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		System.out.println("ontestfailure");
		test.log(Status.SKIP, "your test case is skip");

	}

	public void onStart(ITestContext context) {

		File path = new File("C:\\Users\\HP840G6\\eclipse\\Selenium\\Com.Crm.DemoWebShop\\ExtentReport.html");

		spark = new ExtentSparkReporter(path);

		spark.config().setDocumentTitle("dws test cases");
		spark.config().setReportName("dipak alkari");
		spark.config().setTheme(Theme.STANDARD);

		report = new ExtentReports();
		report.setSystemInfo("os", "window");
		report.attachReporter(spark);

	}

	public void onFinish(ITestContext context) {
		report.flush();
	}

}
