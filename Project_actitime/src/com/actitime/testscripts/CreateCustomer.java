package com.actitime.testscripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrack;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLibrary;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {

	@Test
	public void testCreateCustomer() throws IOException, InterruptedException {

		// accessing data from excel file
		FileLibrary f = new FileLibrary();
		String customerName = f.getExcelData("createCustomer", 1, 3);
		String customerDesc = f.getExcelData("createCustomer", 1, 4);

		EnterTimeTrack e = new EnterTimeTrack(driver);
		e.setTaskTab();

		TaskListPage tl = new TaskListPage(driver);
		tl.getAddNewBtn().click();
		tl.getNewCustomerBtn().click();
		tl.getCustomerNametBx().sendKeys(customerName);
		tl.getCustomerDescriptionBx().sendKeys(customerDesc);
		tl.getDropDownMenu().click();
//		Assert.fail();
		tl.getSelectDropDown().click();
		tl.getCreateCustomerBtn().click();
		Thread.sleep(3000);
		String actualCustName = tl.getActualCustName().getText();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(tl.getActualCustName(),customerName));
		Thread.sleep(3000);
		Assert.assertEquals(actualCustName, customerName);
		Reporter.log("create customer", true);
	}
}
