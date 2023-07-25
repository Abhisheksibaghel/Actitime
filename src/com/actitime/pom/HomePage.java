package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
@FindBy(xpath="//a[@id='logoutLink']")
private WebElement logOut;

@FindBy(xpath="//div[text()='Tasks']")
private WebElement TaskTab;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setLogout() {
	logOut.click();
}
public void settaskTab() {
	TaskTab.click();
}

}
