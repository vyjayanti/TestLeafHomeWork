package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{
	
	public FindLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy (how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement elefname;
	public FindLeadPage EnterFirstName(String data) {
		type(elefname, data);
		return this ;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elefindLeadbutton;
	public FindLeadPage ClickFindLeadButton () {
		click(elefindLeadbutton);
		return this ;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")
	private WebElement elerecord;
	public ViewLeadPage ClickTheRecord () {
		click(elerecord);
		return new ViewLeadPage();
		
	}
	
	
	
	
	
	
	
	

}
