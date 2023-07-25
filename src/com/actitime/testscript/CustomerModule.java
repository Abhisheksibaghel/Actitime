package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
@Test
public void testCreateCustomer() throws EncryptedDocumentException, IOException {
	Reporter.log("CreateCustomer",true);
	FileLib f=new FileLib();
	String CusName = f.getExcelData("CreateCustomer", 1, 3);
	String CusDescription = f.getExcelData("CreateCustomer", 1, 4);

	HomePage h=new HomePage(driver);
	h.settaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNew().click();
	t.getNewCustomer().click();
	t.getEnterCustomerName().sendKeys(CusName);
	t.getEnterCustomerDescription().sendKeys(CusDescription);
	t.getSelectCustomerDD().click();
	t.getBigBangCompany().click();
	t.getCreateCustomer().click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.textToBePresentInElement(t.getTitlefld(), CusDescription));
    String ActualTitle = t.getTitlefld().getText();
    assertEquals(ActualTitle, CusName);
    
}
}
