package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reports {
public static ExtentReports addreports() {
	ExtentSparkReporter htmlreport=new ExtentSparkReporter("extentReporter.html");
	ExtentReports reports  =new ExtentReports();
	
	reports.attachReporter(htmlreport);
	reports.setSystemInfo("Env", "UAt");
	reports.setSystemInfo("TestingType", "Regression");
	return reports ;
	
}
}
