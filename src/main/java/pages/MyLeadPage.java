package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods{
	
	public MyLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreatlead;
	
	@And("click CreateLead")
	
	public CreateLeadPage ClickCreatelead() {
		click(elecreatlead);
		return new CreateLeadPage();
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement elefindlead;
	public FindLeadPage ClickFindlead() {
	click(elefindlead);
	return new FindLeadPage();
		
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement elefindLead;
	public FindLeadPage ClickFindLead () {
	click(elefindLead);
	return new FindLeadPage() ;
	}
	
	
	
	
	
	
	
	
	

}
