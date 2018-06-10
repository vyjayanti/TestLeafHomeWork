package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleverify;
	
	public ViewLeadPage verify(String data) {
		verifyExactText(eleverify, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleeditb;
	public ViewLeadPage ClickEdit ()
	{
		click(eleeditb);
		return this ;
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_industryEnumId")
	private WebElement eleindustory;
	public ViewLeadPage FindIndustory ()
	{
		Select dd = new Select(eleindustory);
		dd.selectByVisibleText("Telecommunications");
		return this;
		
	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleupdate;
	public ViewLeadPage ClickUpdate()
	{
		click(eleupdate);
		return this;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
