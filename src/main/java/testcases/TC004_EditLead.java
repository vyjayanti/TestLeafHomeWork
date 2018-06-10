package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EreateLead";
		testDescription="Test to Edit lead in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Vyju";
		browserName="chrome";
		dataSheetName="Book 1";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead (String uName,String pwd,String fName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.ClickOnCRMSFA()
		.Clickleads()
		.ClickFindLead()
		.EnterFirstName(fName)
		.ClickFindLeadButton()
		.ClickTheRecord()
		.ClickEdit()
		.FindIndustory()
		.ClickUpdate();
		
		
		
	
		
		
		
		
				
	}

}
