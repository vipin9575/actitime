package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {
	
	// declaration
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutBtn;
	
	@FindBy(xpath ="//div[text()='Tasks']")
	private WebElement taskTab;
	

	// initialization
	public EnterTimeTrack(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// utilization
	public void setLogout() {
		logoutBtn.click();
	}
	
	public void setTaskTab() {
		taskTab.click();
	}
}
