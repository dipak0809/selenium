package ListenerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("on test Start");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("ontest failure");
	
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("ontestskipped");
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeou");
	}

	public void onStart(ITestContext context) {
		System.out.println("onstart");
	
	}

	public void onFinish(ITestContext context) {
		System.out.println("onfinish");
	}

	
	}



