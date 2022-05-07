package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POM.Zerodhalogintest;
import Pojo.Browser4;
import Utility.Excel;

public class reportprogram {
	WebDriver driver;
ExtentReports reports;
ExtentTest test;

@BeforeClass
public void setReports() {
	reports=Utility.reports.addreports();
}
	@BeforeMethod
	public void focuesonbrowser(){
		driver=Browser4.openbrowser2("https://kite.zerodha.com/");
	}
	@Test
	public void withcreadentials() throws IOException, InterruptedException {	
		test=reports.createTest("withcredentials");
		Zerodhalogintest zerodhalogintest=new Zerodhalogintest(driver);

	String userName=Excel.getTestData1(0, 1, "Credentials1");
	zerodhalogintest.enterUsername(userName);

	String Pass=Excel.getTestData1(1, 1,"Credentials1");
	zerodhalogintest.enterPassword(Pass);

	zerodhalogintest.clickOnSubmit();
	Thread.sleep(2000);

	String PinNumber=Excel.getTestData1(2, 1, "Credentials1");
	zerodhalogintest.enterpnumber(PinNumber);

	zerodhalogintest.create();

		}
	@AfterMethod
	public void capyureResult (ITestResult result) {
		if (result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}else {
			if (result.getStatus()==ITestResult.SUCCESS) {
				test.log(Status.PASS, result.getName());
				}
			else {
				test.log(Status.SKIP,result.getName());
			}}
	}
	
		@AfterClass
		public void flushResults() {
			
			reports.flush();
			
		}
			
			
			
		
	
	
	}
	




