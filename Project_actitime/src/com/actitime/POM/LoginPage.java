package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	@FindBy(id = "username")
	private WebElement untbx;

	@FindBy(name = "pwd")
	private WebElement pwtbx;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLoginPage(String un, String pwd){
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		loginBtn.click();
	}
}
