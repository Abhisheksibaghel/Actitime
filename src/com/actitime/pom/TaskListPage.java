package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

@FindBy(xpath="//div[text()='Add New']")
private WebElement AddNew;

@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement NewCustomer;

@FindBy(xpath="//input[@class=\"inputFieldWithPlaceholder newNameField inputNameField\" and @placeholder='Enter Customer Name']")
private WebElement EnterCustomerName;

@FindBy(xpath="//textarea[@class=\"textarea\" and @placeholder='Enter Customer Description']")
private WebElement EnterCustomerDescription;

@FindBy(xpath="//span[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer']")
private WebElement SelectCustomerDD;

@FindBy(xpath="//div[@class='searchItemList' ]/div[text()='Big Bang Company']")
private WebElement BigBangCompany;

@FindBy(xpath="//div[text()='Create Customer']")
private WebElement CreateCustomer;

@FindBy(xpath="//div[@class=\"titleEditButtonContainer\"]/div[@class=\"title\"]")
private WebElement Titlefld;

//@FindBy(xpath="//div[@class='item createNewTasks']")
//private WebElement NewTask;
//
//@FindBy(xpath="//div[text()=\"- Select Customer -\"]")
//private WebElement TaskSelectDD;
//
//@FindBy(xpath="//div[@class='searchItemList']/div[text()=\"Big Bang Company\"]")
//private WebElement TaskCustName;
//
//@FindBy(xpath="//div[text()=\"- Select Project -\"]")
//private WebElement SelectProject;
//
//@FindBy(xpath="//div[@class='comboboxButton']/div[text()="Spaceship testing"]")

public TaskListPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);}
public WebElement getAddNew() {
	return AddNew;

}
public WebElement getNewCustomer() {
	return NewCustomer;
}

public WebElement getEnterCustomerName() {
	return EnterCustomerName;
}

public WebElement getEnterCustomerDescription() {
	return EnterCustomerDescription;
}

public WebElement getSelectCustomerDD() {
	return SelectCustomerDD;
}

public WebElement getBigBangCompany() {
	return BigBangCompany;
}

public WebElement getCreateCustomer() {
	return CreateCustomer;
}
public WebElement getTitlefld() {
	return Titlefld;

}
}
