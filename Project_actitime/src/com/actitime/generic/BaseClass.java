package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.POM.EnterTimeTrack;
import com.actitime.POM.LoginPage;

public class BaseClass {
	public static WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		Reporter.log("Open the browser", true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() {
		Reporter.log("Close the browser", true);
		driver.close();
	}

	@BeforeMethod
	public void Login() throws IOException {
		Reporter.log("Login the application", true);
		
		// accessing data from property file
		FileLibrary f = new FileLibrary();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		driver.get(url);
		LoginPage l = new LoginPage(driver);
		l.setLoginPage(un, pwd);
	}

	@AfterMethod
	public void Logout() throws InterruptedException {
		Reporter.log("Logout the application", true);
		EnterTimeTrack e = new EnterTimeTrack(driver);
		Thread.sleep(3000);
		e.setLogout();
	}
}
