package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecName1;
	
	@Then("enter company name")
	
	public CreateLeadPage enterCompanyName(String data) {
		type(elecName1, data);
		return this ;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefName;
	
	@Then("enter first name")
	
	public CreateLeadPage enterFirstName(String data) {
		type(elefName,data);
		return this ;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelName;
	
	@Then("enter last name")
	
	public CreateLeadPage enterLastName(String data) {
		type(elelName, data);
		return this ;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement elecreateLeadButton;
	
	@Then("click create lead button")
	
	public ViewLeadPage clickCreateleadButton() {
		click(elecreateLeadButton);
		return new ViewLeadPage ();
	}
	
	
	
	
	
	
	
	
	
	
	

}
