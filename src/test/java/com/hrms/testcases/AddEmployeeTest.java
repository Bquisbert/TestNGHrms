package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.ConfigsReader;

public class AddEmployeeTest {
//	@BeforeMethod
//	public void openBrowser() {
//		setUp();
//		initialize();
//	}
//
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

	@Test
	public void addEmployeePage() {

		LoginPageElements login = new LoginPageElements();

		login.username.sendKeys(ConfigsReader.getProperty("username"));
		login.password.sendKeys(ConfigsReader.getProperty("password"));
		login.loginBtn.click();

		DashboardPageElements board = new DashboardPageElements();

		board.PIM.click();
//		jsClick(board);
//		
//		AddEmployeePageElements emp1 = new AddEmployeePageElements();
//		
//		sendText(emp1.empFirstName, ConfigsReader.getProperty("employeeFirstname"));
//		sendText(emp1.empLastName, ConfigsReader.getProperty("employeeLastname"));
//		sendText(emp1.addPhoto, ConfigsReader.getProperty("filePath"));
//		waitAndClick(emp1.saveEmp);

	}
}
