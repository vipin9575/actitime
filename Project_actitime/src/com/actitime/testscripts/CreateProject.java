package com.actitime.testscripts;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrack;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLibrary;

public class CreateProject extends BaseClass{
	@Test
	public void testCreateProject() throws IOException {
		FileLibrary f = new FileLibrary();
		String projectName = f.getExcelData("createProject", 1, 3);
		String projectDescription = f.getExcelData("createProject", 1, 4);
		
		EnterTimeTrack e = new EnterTimeTrack(driver);
		e.setTaskTab();
		
		TaskListPage tl = new TaskListPage(driver);
		tl.getAddNewBtn().click();
		tl.getNewProjectBtn().click();
		tl.getProjectNameTBx().sendKeys(projectName);
		tl.getCompanyDropdownMenu().click();
		Actions a = new Actions(driver);
		a.scrollToElement(tl.getSelectCompanyName()).perform();
		tl.getSelectCompanyName().click();
		tl.getProjectDescription().sendKeys(projectDescription);
		tl.getCreateProjectBtn().click();
	}
}
