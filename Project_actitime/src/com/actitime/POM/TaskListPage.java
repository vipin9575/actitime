package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	// declaration of new customer
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;

	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;

	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerNametBx;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescriptionBx;

	@FindBy(xpath = "(//div[text()='- Select Customer -'])[1]")
	private WebElement dropDownMenu;

	@FindBy(xpath = "//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement selectDropDown;

	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomerBtn;

	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustName;

	// declaration of new project
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newProjectBtn;

	@FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement projectNameTBx;

	@FindBy(xpath = "//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement companyDropdownMenu;

	@FindBy(xpath = "//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement selectCompanyName;

	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescription;

	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProjectBtn;

	// initialization
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization of new customer
	public WebElement getActualCustName() {
		return actualCustName;
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getCustomerNametBx() {
		return customerNametBx;
	}

	public WebElement getCustomerDescriptionBx() {
		return customerDescriptionBx;
	}

	public WebElement getDropDownMenu() {
		return dropDownMenu;
	}

	public WebElement getSelectDropDown() {
		return selectDropDown;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	// utilization of create project
	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}

	public WebElement getProjectNameTBx() {
		return projectNameTBx;
	}

	public WebElement getCompanyDropdownMenu() {
		return companyDropdownMenu;
	}

	public WebElement getSelectCompanyName() {
		return selectCompanyName;
	}

	public WebElement getProjectDescription() {
		return projectDescription;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

}
