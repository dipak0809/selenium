package ExtentReportPackage;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GeneretReport implements ITestListener {
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;

	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test = report.createTest(name);
		System.out.println("OntestStart");
	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("on test success");
		String name = result.getMethod().getMethodName();
		System.out.println("on test failure");
		test.log(Status.PASS, name + "is passed");

	}

	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();

		System.out.println("onTestFailure");
		test.log(Status.FAIL, name + "is passed");

	}

	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		System.out.println("ontestfailure");
		test.log(Status.SKIP, name + "is passed");

	}

	public void onStart(ITestContext context) {

		File path = new File("C:\\Users\\HP840G6\\eclipse\\Selenium\\Com.Crm.DemoWebShop\\ExtentReport.html");

		spark = new ExtentSparkReporter(path);

		spark.config().setDocumentTitle("dws test cases");
		spark.config().setReportName("dipakalkari");
		spark.config().setTheme(Theme.STANDARD);

		report = new ExtentReports();
		report.setSystemInfo("os", "window");
		report.attachReporter(spark);


	}

	public void onFinish(ITestContext context) {
		report.flush();
	}

}
