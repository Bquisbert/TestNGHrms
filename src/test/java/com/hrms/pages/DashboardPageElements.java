package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods{

	
	
	@FindBy(id="welcome")
	public WebElement welcome;
	

	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo;
	
	@FindBy(css="a#menu_pim_viewPimModule")
	public WebElement PIM;
	
	public void navigateToAddEmployee() {
		jsClick(PIM);
		jsClick((WebElement) addEmp);
	}
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
