package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Zerodhalogintest;
import Pojo.Browser4;
import Utility.Excel;


public class Logintest {
WebDriver driver;

@BeforeMethod
public void focuesonbrowser(){
	driver=Browser4.openbrowser2("https://kite.zerodha.com/");
}
@Test
public void withcreadentials() throws IOException, InterruptedException {	
	
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
}
