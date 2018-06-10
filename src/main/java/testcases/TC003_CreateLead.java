package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.Before;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@Before
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Test to Create lead in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Vyju";
		browserName="chrome";
		dataSheetName="TC003_1";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead (String uName,String pwd,String cName,String fName,String lName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.ClickOnCRMSFA()
		.Clickleads()
		.ClickCreatelead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateleadButton()
		.verify(fName);
		
		
		
		
	
		
		
		
		
				
	}

}
