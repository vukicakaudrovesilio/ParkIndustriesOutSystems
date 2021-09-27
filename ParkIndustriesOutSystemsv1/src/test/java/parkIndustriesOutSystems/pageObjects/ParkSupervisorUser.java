package parkIndustriesOutSystems.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parkIndustriesOutSystems.common.WebElementFunctions;

public class ParkSupervisorUser {

	WebDriver ldriver;
	WebElementFunctions func = new WebElementFunctions();
	
	public ParkSupervisorUser(WebDriver rdriver) //a constructor; ldriver = local driver, rdriver = remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Park Supervisor User Link Button
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/form/div/div[2]/div/div[2]/div[2]/a/span")
	@CacheLookup
	WebElement lbtnParkSupervisorUser;
	
	//Park Supervisor User's Requests Header
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/span")
	@CacheLookup
	WebElement headerParkSupervisorUserRequests;
	
	//Taskbox Header
	@FindBy(xpath="//div[@class='ph'][contains(.,'Taskbox')]")
	@CacheLookup   
	WebElement headerTaskbox;
	
	//Associate Forms Portal Header
	@FindBy(xpath="//a[@class='associates-link'][contains(.,'Associates')]")
	@CacheLookup   
	WebElement headerAssociates;

	//Park Associate User Taskbox Title
	@FindBy(xpath="//div[@class='ph'][contains(.,'Taskbox')]")
	@CacheLookup
	WebElement pageTaskboxTitle;
	
	//Park Associate User Associates Title
	@FindBy(xpath="//div[@class='ph'][contains(.,'List of All Associates')]")
	@CacheLookup
	WebElement pageAssociatesTitle;
	
	//Park Supervisor User Text
	@FindBy(xpath="//span[contains(.,'Park Supervisor User')]")
	@CacheLookup   
	WebElement txtParkSupervisorUser;
	
	//Export To Excel Button
	@FindBy(xpath="//div[@class='btn-label OSInline'][contains(.,'Export To Excel')]")
	@CacheLookup   
	WebElement btnExportExcel;
	
	//Export Options Button
	@FindBy(xpath="//button[contains(.,'Export Options')]")
	@CacheLookup
	WebElement btnExportOptions;
	
	//Export Options Text
	@FindBy(xpath="(//span[@class='heading3'][contains(.,'Export Options')])[2]")
	@CacheLookup
	WebElement txtExportOptions;
	
	//Export Options Choose A Date Range
	@FindBy(xpath="//div[@class='ThemeGrid_Width4'][contains(.,'Choose a date range')]")
	@CacheLookup
	WebElement txtChooseADateRange;
	
	//Export Options Choose A Date Range Checkbox
	@FindBy(xpath="//input[@id='ShowDateRange']")
	@CacheLookup
	WebElement chkboxChooseADateRange;
	
	//Export Options Choose A Date Range Checkbox From Date
	@FindBy(xpath="(//span[contains(.,'From:')])[2]")
	@CacheLookup
	WebElement txtFromDate;
	
	//Export Options Choose A Date Range Checkbox From Date
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div[3]/div/div[1]/div[2]/span")
	@CacheLookup
	WebElement selectFromDate;
	
	//Export Options Choose A Date Range Checkbox To Date
	@FindBy(xpath="(//span[@class='heading6'][contains(.,'From:')])[2]")
	@CacheLookup
	WebElement txtToDate;
	
	//Export Options Choose A Date Range Checkbox To Date
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div[3]/div/div[2]/div[2]/span")
	@CacheLookup
	WebElement selectToDate;
	
	//Export To Excel Button
	@FindBy(xpath="(//div[@class='btn-label OSInline'][contains(.,'Export To Excel')])[2]")
	@CacheLookup   
	WebElement btnExportToExcel;
	
	//Filter By Pick Up Text
	@FindBy(xpath="(//div[contains(.,'Filter By \"Pick Up\"')])[16]")
	@CacheLookup   
	WebElement txtFilterByPickUp;
	
	//Filter By Pick Up Check Box
	@FindBy(xpath="//input[@id='FilterByPickUp']")
	@CacheLookup   
	WebElement chkboxFilterByPickUp;
	
	//Close Button
	@FindBy(xpath="(//button[@class='btn ThemeGrid_MarginGutter'][contains(.,'Close')])[2]")
	@CacheLookup
	WebElement btnClose;
	
	//Activity List Header
	@FindBy(xpath="//div[@class='text-align-left heading3 ThemeGrid_Width6'][contains(.,'Activity List')]")
	@CacheLookup
	WebElement headerActivityList;
	
	//Park Associate Case ID Column
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/table/thead/tr/th[1]")
	@CacheLookup
	WebElement txtCaseID;
		
	//Park Associate User Form Name Column
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/table/thead/tr/th[2]")
	@CacheLookup
	WebElement txtFormName;
		
	//Park Associate User Requester Column 
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/table/thead/tr/th[3]")
	@CacheLookup
	WebElement txtRequester;
		
	//Park Associate User Status Column
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/table/thead/tr/th[4]")
	@CacheLookup
	WebElement txtStatus;
	
	//Park Associate User Activity Column
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/table/thead/tr/th[5]")
	@CacheLookup
	WebElement txtActivity;
	
	//Park Associate User Created On Column
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/table/thead/tr/th[6]")
	@CacheLookup
	WebElement txtCreatedOn;
	
	//Park Associate User Assignment Column
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/table/thead/tr/th[7]")
	@CacheLookup
	WebElement txtAssignment;
	
	//Case Number 1 
	@FindBy(xpath="(//td[@data-header='Case #'][contains(.,'1')])[1]")
	@CacheLookup
	WebElement txtCase1;
	
	//Case Number 9
	@FindBy(xpath="(//span[contains(.,'9')])[1]")
	@CacheLookup
	WebElement txtCase9;
	
	//Case Number 157 
	@FindBy(xpath="//span[contains(.,'152')]")
	@CacheLookup
	WebElement txtCase152;
	
	//Case Number 157 
	@FindBy(xpath="//span[contains(.,'157')]")
	@CacheLookup
	WebElement txtCase157;
	
	//Requester Jessica Brenny 
	@FindBy(xpath="//span[contains(.,'Jessica Brenny')]")
	@CacheLookup
	WebElement txtRequesterJessica;
	
	//Requester Sarah Lampert 
	@FindBy(xpath="//span[contains(.,'Sarah Lampert')]")
	@CacheLookup
	WebElement txtRequesterSarah;
	
	//Status Submitted 
	@FindBy(xpath="(//span[contains(.,'Approved by Supervisor')])[1]")
	@CacheLookup
	WebElement txtStatusApprovedBySupervisor;
	
	//Status Submitted 
	@FindBy(xpath="(//span[contains(.,'Submitted')])[1]")
	@CacheLookup
	WebElement txtStatusSubmitted;
	
	//Created On 04/23/2021 
	@FindBy(xpath="(//span[@class='OSFillParent'][contains(.,'04/23/2021')])[1]")
	@CacheLookup
	WebElement txtCreatedOn04232021;
	
	//Created On 04/30/2021 
	@FindBy(xpath="//span[contains(.,'04/30/2021')]")
	@CacheLookup
	WebElement txtCreatedOn04302021;
	
	//Created On 09/20/2021 
	@FindBy(xpath="//span[@class='OSFillParent'][contains(.,'09/20/2021')]")
	@CacheLookup
	WebElement txtCreatedOn09202021;
	
	//Assignment (-)
	@FindBy(xpath="(//td[@data-header='Assignment'][contains(.,'--')])[1]")
	@CacheLookup
	WebElement txtAssignmentDash;
	
	//Assignment (Assigned to me)
	@FindBy(xpath="(//span[contains(.,'Assigned to me')])[1]")
	@CacheLookup
	WebElement txtAssignmentAssignedToMe;
	
	//Assignment (Pick Up Button)
	@FindBy(xpath="(//button[contains(.,'Pick Up')])[1]")
	@CacheLookup
	WebElement btnPickUp;
	
	//Click Park Supervisor User Link Button
	public void clickParkSupervisorUser()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnParkSupervisorUser);
	}
	
	//Confirm Header "Park Supervisor User's Requests"
	public boolean verifyHeaderPSUR()
	{
		return func.verifyElementDisplayedWithText(headerParkSupervisorUserRequests, "Park Supervisor User's Requests");
	}
	
	//Confirm Header "Taskbox"
	public boolean verifyHeaderTaskbox()
	{
		return func.verifyElementDisplayedWithText(headerTaskbox, "Taskbox");
	}
	
	//Confirm Header "Associates"
	public boolean verifyHeaderAssociates()
	{
		return func.verifyElementDisplayedWithText(headerAssociates, "Associates");
	}
	
	//Confirm Title "Taskbox"
	public boolean locateTaskboxTitle()
	{
		if(pageTaskboxTitle.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Taskbox is clickable and displayed
	public void taskboxClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", headerTaskbox);
	}
	
	//Confirm Title "Associates"
	public boolean locateAssociatesTitle()
	{
		if(pageAssociatesTitle.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Associates is clickable and displayed
	public void associatesClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", headerAssociates);
	}
	
	//Park Supervisor User Text is displayed
	public boolean txtParkSupervisorUser()
	{
		return txtParkSupervisorUser.isDisplayed();
	}
	
	//Export Excel Button is displayed
	public boolean btnExportExcelDisplayed()
	{
		return btnExportExcel.isDisplayed();
	}
	
	//Export Excel Button Background Color
	public String btnExportExcelBgColor()
	{
		String bgColour = Color.fromString(btnExportExcel.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Export Options is clickable and displayed
	public void btnExportToExcel1Clickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnExportExcel);
	}
	
	//Export Options Button is displayed
	public boolean btnExportOptionsDisplayed()
	{
		return btnExportOptions.isDisplayed();
	}
	
	//Export Options is clickable and displayed
	public void btnExportOptionsClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnExportOptions);
	}
	
	//Export Options Text is displayed
	public boolean txtExportOptionsTextDisplayed()
	{
		return txtExportOptions.isDisplayed();
	}
		
	//Choose A Date Range Text is displayed
	public boolean txtChooseADateRangeDisplayed()
	{
		return txtChooseADateRange.isDisplayed();
	}
	
	//Choose A Date Range Checkbox is displayed
	public boolean chkboxChooseADateRangeDisplayed()
	{
		return chkboxChooseADateRange.isDisplayed();
	}
	
	//Choose A Date Range Checkbox is clickable and displayed
	public void chkboxChooseADateRangeClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", chkboxChooseADateRange);
	}
	
	//Choose A Date Range From Date Text is displayed
	public boolean txtFromDateDisplayed()
	{
		return txtFromDate.isDisplayed();
	}
	
	//Choose A Date Range From Date Field is displayed
	public boolean selectFromDateDisplayed()
	{
		return selectFromDate.isDisplayed();
	}
	
	//Select From Date as 04/08/2021 Text is displayed
	public void enterFromDateDisplayed()
	{
		selectFromDate.sendKeys("04082021");
	}
	
	//Choose A Date Range To Date Text is displayed
	public boolean txtToDateDisplayed()
	{
		return txtToDate.isDisplayed();
	}
	
	//Choose A Date Range To Date Field is displayed
	public boolean selectToDateDisplayed()
	{
		return selectToDate.isDisplayed();
	}
	
	//Select From Date as 04/12/2021 Text is displayed
	public void enterToDateDisplayed()
	{
		selectToDate.sendKeys("04122021");
	}
	
	//Export To Excel Button is displayed
	public boolean btnExportToExcelDisplayed()
	{
		return btnExportToExcel.isDisplayed();
	}
	
	//Filter By PickUp Text is displayed
	public boolean txtFilterByPickUpDisplayed()
	{
		return txtFilterByPickUp.isDisplayed();
	}
	
	//Filter By PickUp Check Box is displayed
	public boolean chkboxFilterByPickUpDisplayed()
	{
		return chkboxFilterByPickUp.isDisplayed();
	}
	
	//Filter By PickUp Check Box is clickable and displayed
	public void chkboxFilterByPickUpClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", chkboxFilterByPickUp);
	}
	
	//Close Button is displayed
	public boolean btnCloseDisplayed()
	{
		return btnClose.isDisplayed();
	}
	
	//Close Button is clickable and displayed
	public void btnCloseClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnClose);
	}
	
	//ExportToExcel Button is clickable and displayed
	public void btnExportToExcel2Clickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnExportToExcel);
	}
	
	//Confirm Header "Activity List"
	public boolean verifyHeaderActivityList()
	{
		return func.verifyElementDisplayedWithText(headerActivityList, "Activity List");
	}
	
	//Column Headers for Case iD, Form Name, Requester and Status
	public boolean locateActivityListColumnHeaders()
	{
		if(txtCaseID.isDisplayed() && txtFormName.isDisplayed() && txtRequester.isDisplayed() && txtStatus.isDisplayed() && txtActivity.isDisplayed() && txtCreatedOn.isDisplayed() && txtAssignment.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Case Number Button is clickable and displayed
	public void txtCaseIDClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", txtCaseID);
	}
	
	//Requester Button is clickable and displayed
	public void txtRequesterClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", txtRequester);
	}
		
	//Status Button is clickable and displayed
	public void txtStatusClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", txtStatus);
	}
		
	//Created On Button is clickable and displayed
	public void txtCreatedOnClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", txtCreatedOn);
	}
		
	//Assignment Button is clickable and displayed
	public void txtAssignmentClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", txtAssignment);
	}
	
	//Case Number 1 is displayed
	public boolean txtCase1Displayed()
	{
		return txtCase1.isDisplayed();
	}
	
	//Case Number 9 is displayed
	public boolean txtCase9Displayed()
	{
		return txtCase9.isDisplayed();
	}
	
	//Case Number 152 is displayed
	public boolean txtCase152Displayed()
	{
		return txtCase152.isDisplayed();
	}
	
	//Case Number 157 is displayed
	public boolean txtCase157Displayed()
	{
		return txtCase157.isDisplayed();
	}
	
	//Requester Jessica is displayed
	public boolean txtRequesterJessicaDisplayed()
	{
		return txtRequesterJessica.isDisplayed();
	}
	
	//Requester Sarah is displayed
	public boolean txtRequesterSarahDisplayed()
	{
		return txtRequesterSarah.isDisplayed();
	}
	
	//Status Approved By Supervisor is displayed
	public boolean txtStatusApprovedBySupervisorDisplayed()
	{
		return txtStatusApprovedBySupervisor.isDisplayed();
	}
	
	//Status Submitted is displayed
	public boolean txtStatusSubmittedDisplayed()
	{
		return txtStatusSubmitted.isDisplayed();
	}
	
	//Created On 04/23/2021 is displayed
	public boolean txtCreatedOn04232021Displayed()
	{
		return txtCreatedOn04232021.isDisplayed();
	}
	
	//Created On 04/30/2021 is displayed
	public boolean txtCreatedOn04302021Displayed()
	{
		return txtCreatedOn04302021.isDisplayed();
	}
	
	//Created On 09/20/2021 is displayed
	public boolean txtCreatedOn09202021Displayed()
	{
		return txtCreatedOn09202021.isDisplayed();
	}
	
	//Assignment Dash is displayed
	public boolean txtAssignmentDashDisplayed()
	{
		return txtAssignmentDash.isDisplayed();
	}
	
	//Assignment Assigned To Me is displayed
	public boolean txtAssignmentAssignedToMeDisplayed()
	{
		return txtAssignmentAssignedToMe.isDisplayed();
	}
	
	//Assignment Pick Up Button is displayed
	public boolean btnPickUpDisplayed()
	{
		return btnPickUp.isDisplayed();
	}
	
	//Pick Up Button Background Color
	public String btnPickUpBgColor()
	{
		String bgColour = Color.fromString(btnPickUp.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Pick Up Button is clickable and displayed
	public void btnPickUpClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnPickUp);
	}
}
