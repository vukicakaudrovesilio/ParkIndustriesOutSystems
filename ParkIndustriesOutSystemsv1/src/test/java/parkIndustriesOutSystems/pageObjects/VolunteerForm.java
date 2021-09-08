package parkIndustriesOutSystems.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parkIndustriesOutSystems.common.WebElementFunctions;

public class VolunteerForm {

	WebDriver ldriver;
	WebElementFunctions func = new WebElementFunctions();
	
	public VolunteerForm(WebDriver rdriver) //a constructor; ldriver = local driver, rdriver = remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Volunteer Form Link Button
	@FindBy(xpath="//a[contains(.,'Volunteer Forms')]")
	@CacheLookup
	WebElement lbtnVolunteerForm;
	
	//Volunteer Tracking Header
	@FindBy(xpath="//a[@class='ThemeGrid_MarginGutter active'][contains(.,'Volunteer Tracking')]")
	@CacheLookup
	WebElement headerVolunteerTracking;
	
	//Volunteer Grants Header
	@FindBy(xpath="//a[@class='ThemeGrid_MarginGutter'][contains(.,'Volunteer Grants')]")
	@CacheLookup
	WebElement headerVolunteerGrants;
	
	//Volunteer Form Header Main
	@FindBy(xpath="//span[@class='font-bold'][contains(.,'Volunteer Forms')]")
	@CacheLookup
	WebElement headerVolunteerFormMain;
	
	//Volunteer Tracking Form Header
	@FindBy(xpath="//div[@class='heading3 text-align-center'][contains(.,'Volunteer Tracking Form')]")
	@CacheLookup
	WebElement headerVolunteerForm;
	
	//Volunteer Tracking Request Header
	@FindBy(xpath="//div[@class='ph'][contains(.,'Volunteer Tracking Request')]")
	@CacheLookup
	WebElement headerVolunteerTrackingRequest;
	
	//Associate Information Header
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Associate Information')]")
	@CacheLookup
	WebElement headerAssociateInformation;
	
	//Volunteer Tracking Form Details Header
	@FindBy(xpath="//span[@class='heading2'][contains(.,'Volunteer Tracking Form Details')]")
	@CacheLookup
	WebElement headerVolunteerTrackingFormDetails;
	
	//Guidelines for Completing the Form Header
	@FindBy(xpath="//div[@class='dividers full-width'][contains(.,'Guidelines for Completing the Form')]")
	@CacheLookup
	WebElement headerGuidelinesforCompletingtheForm;
	
	//Guidelines for Completing the Form Text
	@FindBy(xpath="//li[contains(.,'Company Time (Paid ~ Associate volunteers during work hours), examples include: Corporate Activities Committee, Quality Team, United Way Committee, First Responder Team, Safety Committee, Partners in Education, 401(k) Investment Committee, and Cleaning Committee.')]")
	@CacheLookup
	WebElement txtGuidelinesforCompletingtheForm;
	
	//Fiscal Year Header
	@FindBy(xpath="//label[@class='mandatory OSFillParent'][contains(.,'Fiscal Year')]")
	@CacheLookup
	WebElement headerFiscalYear;
	
	//Fiscal Year Input Text
	@FindBy(xpath="//input[@type='number'][contains(@id,'Year')]")
	@CacheLookup
	WebElement txtFiscalYear;

	//Volunteering Quarter Header
	@FindBy(xpath="//label[@class='mandatory OSFillParent'][contains(.,'Volunteering Quarter')]")
	@CacheLookup
	WebElement headerVolunteeringQuarter;
	
	//Volunteering Quarter Drop Down
	@FindBy(xpath="//select[contains(@class,'dropdown-display dropdown')]")
	@CacheLookup
	WebElement ddVolunteeringQuarter;
	
	//Select a Quarter Drop Down
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/form/div[2]/div[2]/div/select/option[1]")
	@CacheLookup
	WebElement ddSelectaQuarter;
	
	//First Quarter Drop Down
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/form/div[2]/div[2]/div/select/option[2]")
	@CacheLookup
	WebElement ddFirstQuarter;
	
	//Second Quarter Drop Down
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/form/div[2]/div[2]/div/select/option[3]")
	@CacheLookup
	WebElement ddSecondQuarter;
		
	//Third Quarter Drop Down
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/form/div[2]/div[2]/div/select/option[4]")
	@CacheLookup
	WebElement ddThirdQuarter;
		
	//Fourth Quarter Drop Down
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/form/div[2]/div[2]/div/select/option[5]")
	@CacheLookup   
	WebElement ddFourthQuarter;
	
	//Add Agency/ Committee Button
	@FindBy(xpath="//button[@class='btn'][contains(.,'Add Agency / Committee')]")
	@CacheLookup   
	WebElement btnAgencyCommittee;
	
	//Agency Or Park Industries Committee Header
	@FindBy(xpath="//label[@class='mandatory OSFillParent'][contains(.,'Agency Or Park Industries Committee')]")
	@CacheLookup
	WebElement headerAgencyOrParkIndustriesCommittee;
	
	//Agency Or Park Industries Committee Input Text
	@FindBy(xpath="//input[@type='text'][contains(@id,'AgencyOrCommittee2')]")
	@CacheLookup
	WebElement txtAgencyOrParkIndustriesCommittee;
	
	//Volunteering Activity(ies) Header
	@FindBy(xpath="//label[@class='mandatory OSFillParent'][contains(.,'Volunteering Activity(ies)')]")
	@CacheLookup
	WebElement headerVolunteeringActivity;
	
	//Volunteering Activity(ies) Input Text
	@FindBy(xpath="//textarea[@class='form-control OSFillParent'][contains(@id,'VolunteeringActivities')]")
	@CacheLookup
	WebElement txtVolunteeringActivity;
	
	//Date Start Header
	@FindBy(xpath="//label[@class='mandatory OSFillParent'][contains(.,'Date Start')]")
	@CacheLookup
	WebElement headerDateStart;
	
	//Date Start Input Text
	@FindBy(xpath="//input[@type='date'][contains(@id,'DateStart')]")
	@CacheLookup
	WebElement txtDateStart;
	
	//Date End Header
	@FindBy(xpath="//label[@class='mandatory OSFillParent'][contains(.,'Date End')]")
	@CacheLookup
	WebElement headerDateEnd;
	
	//Date End Input Text
	@FindBy(xpath="//input[@type='date'][contains(@id,'DateEnd')]")
	@CacheLookup
	WebElement txtDateEnd;
	
	//Company Time Hours Header
	@FindBy(xpath="//label[@class='mandatory OSFillParent'][contains(.,'Company Time Hours')]")
	@CacheLookup
	WebElement headerCompanyTimeHours;
	
	//Company Time Hours Input Text
	@FindBy(xpath="//input[@type='number'][contains(@id,'TotalCompanyHours')]")
	@CacheLookup
	WebElement txtCompanyTimeHours;
	
	//Personal Time Hours Header
	@FindBy(xpath="//label[@class='mandatory OSFillParent'][contains(.,'Personal Time Hours')]")
	@CacheLookup
	WebElement headerPersonalTimeHours;
	
	//Personal Time Hours Input Text
	@FindBy(xpath="//input[@type='number'][contains(@id,'TotalPersonalHours')]")
	@CacheLookup
	WebElement txtPersonalTimeHours;
	
	//Close Button
	@FindBy(xpath="//button[@class='btn btn-cancel'][contains(.,'Close')]")
	@CacheLookup
	WebElement btnClose;
	
	//Save and Close Button
	@FindBy(xpath="//span[contains(.,'Save and Close')]")
	@CacheLookup
	WebElement btnSaveClose;
	
	//Agency / Committee Header
	@FindBy(xpath="//span[contains(.,'Agency / Committee')]")
	@CacheLookup
	WebElement headerAgencyCommittee;
	
	//Dates Header
	@FindBy(xpath="//th[@class='sortable'][contains(.,'Dates')]")
	@CacheLookup
	WebElement headerDates;
	
	//Hours Header
	@FindBy(xpath="//th[@class='sortable'][contains(.,'Hours')]")
	@CacheLookup
	WebElement headerHours;
	
	//Back Button
	@FindBy(xpath="//button[@class='btn '][contains(.,'Back')]")
	@CacheLookup
	WebElement btnBack;
	
	//Save & Submit Button
	@FindBy(xpath="//button[@class='btn btn-primary'][contains(.,'Save & Submit')]")
	@CacheLookup
	WebElement btnSaveSubmit;
	
	//Volunteer Grant Form Header
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Volunteer Grant Form')]")
	@CacheLookup
	WebElement headerVolunteerGrantForm;
	
	//Volunteer Grant Form Case Number 8
	@FindBy(xpath="(//span[contains(.,'8')])[4]")
	@CacheLookup
	WebElement txtVolunteerGrantFormCaseNumber8;
	
	//Volunteer Grant Request Header
	@FindBy(xpath="//h1[contains(.,'Volunteer Grant Request')]")
	@CacheLookup
	WebElement headerVolunteerGrantRequest;

	//Volunteer Grant Personal Information Header
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Personal Information')]")
	@CacheLookup
	WebElement headerPersonalInformation;
	
	//Volunteer Grant Form Details Header
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Volunteer Grant Form Details')]")
	@CacheLookup
	WebElement headerVolunteerGrantFormDetails;
	
	//Rejected Text
	@FindBy(xpath="(//span[contains(.,'Rejected')])[1]")
	@CacheLookup
	WebElement txtRejected;
	
	//Fiscal Year Text
	@FindBy(xpath="(//span[@class='text-neutral-7'][contains(.,'Fiscal Year')])[1]")
	@CacheLookup
	WebElement txtFiscalYearVG;
	
	//Fiscal Year Result
	@FindBy(xpath="(//span[contains(.,'2021')])[1]")
	@CacheLookup
	WebElement txtFiscalYearVGResult;
	
	//Grant Amount Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Grant Amount')]")
	@CacheLookup
	WebElement txtGrantAmount;
	
	//Grant Amount Result
	@FindBy(xpath="//span[contains(.,'$100,00')]")
	@CacheLookup
	WebElement txtGrantAmountResult;
	
	//Guidelines for Volunteer Grant Application Form Header
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Volunteer Grant Form Details')]")
	@CacheLookup
	WebElement headerGuidelinesVolunteerGrantForm;
	
	//Guideline Dropdown Button
	@FindBy(xpath="//div[contains(@class,'section-expandable-icon')]")
	@CacheLookup
	WebElement ddGuidelines;
	
	//Guidelines for Volunteer Grant Application Form Points
	@FindBy(xpath="(//div[contains(.,'•    Qualified agencies must be approved IRS registered, non-profit, non-denominational based, 501(c)3 organization.•    In order to be eligible, you need to have volunteered at least 20 hours at this agency in the current fiscal year.•    Please note that your signature and your supervisor’s signature are required.•    Upon approval, a $100 check will be made payable and sent to the organization noted below.•    Up to three grant applications will be approved per associate, per fiscal year.•    Associates can apply for more than one grant per agency, if their volunteering hours exceed 40 hrs or 60 hrs. +')])[23]")
	@CacheLookup
	WebElement txtGuidelinesVolunteerGrantForm;
	
	//Associate Information Volunteer Grants Header
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Volunteer Grant Form Details')]")
	@CacheLookup
	WebElement headerAssociateInformationVG;
	
	//Personal Time Volunteered At Organization Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Personal Time Volunteered At Organization (Fiscal Year)')]")
	@CacheLookup
	WebElement txtPersonalTimeVolunteeredAtOrganization;
	
	//Personal Time Volunteered At Organization Result
	@FindBy(xpath="//span[@class='OSFillParent'][contains(.,'30 hours')]")
	@CacheLookup
	WebElement txtPersonalTimeVolunteeredAtOrganizationResult;
	
	//Activities Performed While Volunteering Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Activities Performed While Volunteering')]")
	@CacheLookup
	WebElement txtActivitiesPerformedWhileVolunteering;
	
	//Activities Performed While Volunteering Result
	@FindBy(xpath="//span[@class='OSFillParent'][contains(.,'asd')]")
	@CacheLookup
	WebElement txtActivitiesPerformedWhileVolunteeringResult;
	
	//Address Text
	@FindBy(xpath="(//span[@class='text-neutral-7'][contains(.,'Address')])[1]")
	@CacheLookup
	WebElement txtAddress;
	
	//Address Result
	@FindBy(xpath="(//span[contains(.,'Monteserrin')])[1]")
	@CacheLookup
	WebElement txtAddressResult;
	
	//Associate City Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Associate City')]")
	@CacheLookup
	WebElement txtAssociateCity;
	
	//Associate City Result
	@FindBy(xpath="(//span[contains(.,'sdfsdfsdf')])[1]")
	@CacheLookup
	WebElement txtAssociateCityResult;
	
	//Associate State Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Associate State')]")
	@CacheLookup
	WebElement txtAssociateState;
	
	//Associate State Result
	@FindBy(xpath="(//span[contains(.,'sdfsdfsf')])[1]")
	@CacheLookup
	WebElement txtAssociateStateResult;
	
	//Associate Zip Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Associate Zip')]")
	@CacheLookup
	WebElement txtAssociateZip;
	
	//Associate Zip Text Result
	@FindBy(xpath="(//span[contains(.,'85236')])[1]")
	@CacheLookup
	WebElement txtAssociateZipResult;
	
	//Non-Profit Organization Information Header
	@FindBy(xpath="//span[@class='font-bold font-size-base'][contains(.,'Non-Profit Organization Information')]")
	@CacheLookup
	WebElement headerNonProfitOrganizationInformation;
	
	//Check Payable To Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Check Payable To')]")
	@CacheLookup
	WebElement txtCheckPayableTo;
	
	//Check Payable To Result
	@FindBy(xpath="(//span[contains(.,'asd')])[2]")
	@CacheLookup
	WebElement txtCheckPayableToResult;
	
	//Organization Director's Name Text
	@FindBy(xpath="(//span[contains(@class,'text-neutral-7')])[11]")
	@CacheLookup
	WebElement txtOrganizationDirectorName;
	
	//Organization Director's Name Result
	@FindBy(xpath="//span[contains(.,'Santiago Gangotena')]")
	@CacheLookup
	WebElement txtOrganizationDirectorNameResult;
	
	//Agency Phone Number Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Agency Phone Number')]")
	@CacheLookup
	WebElement txtAgencyPhoneNumber;
	
	//Agency Phone Number Result
	@FindBy(xpath="//span[contains(.,'8501231122')]")
	@CacheLookup
	WebElement txtAgencyPhoneNumberResult;
	
	//Tax Exempt Code # Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Tax Exempt Code #')]")
	@CacheLookup
	WebElement txtTaxExemptCodeNumber;
	
	//Tax Exempt Code # Result
	@FindBy(xpath="//span[contains(.,'161007')]")
	@CacheLookup
	WebElement txtTaxExemptCodeNumberResult;
	
	//Agency Address Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Agency Address')]")
	@CacheLookup
	WebElement txtAgencyAddress;
	
	//Agency Address Result
	@FindBy(xpath="(//span[contains(.,'Monteserrin')])[2]")
	@CacheLookup
	WebElement txtAgencyAddressResult;
	
	//Agency City Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Agency City')]")
	@CacheLookup
	WebElement txtAgencyCity;
	
	//Agency City Result
	@FindBy(xpath="(//span[contains(.,'sdfsdfsdf')])[2]")
	@CacheLookup
	WebElement txtAgencyCityResult;
	
	//Agency State Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Agency State')]")
	@CacheLookup
	WebElement txtAgencyState;
	
	//Agency State Result
	@FindBy(xpath="(//span[contains(.,'sdfsdfsf')])[2]")
	@CacheLookup
	WebElement txtAgencyStateResult;
	
	//Agency Zip Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Agency Zip')]")
	@CacheLookup
	WebElement txtAgencyZip;
	
	//Agency Zip Result
	@FindBy(xpath="(//span[contains(.,'85236')])[2]")
	@CacheLookup
	WebElement txtAgencyZipResult;
	
	//Release of Information Text
	@FindBy(xpath="//span[@class='font-bold'][contains(.,'Release of Information:')]")
	@CacheLookup
	WebElement txtReleaseofInformation;
	
	//Release of Information Result
	@FindBy(xpath="//div[@class='margin-top-s margin-bottom-s'][contains(.,'Release of Information: Park Industries may contact the above agency should they need to confirm the volunteering efforts.')]")
	@CacheLookup
	WebElement txtReleaseofInformationResult;
	
	//Check Request Header
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Check Request')]")
	@CacheLookup
	WebElement headerCheckRequest;
	
	//Address Check Request Text
	@FindBy(xpath="(//span[@class='text-neutral-7'][contains(.,'Address')])[3]")
	@CacheLookup
	WebElement txtAddressCR;
	
	//Address Check Request Result
	@FindBy(xpath="(//span[contains(.,'Monteserrin')])[3]")
	@CacheLookup
	WebElement txtAddressCRResult;
	
	//Payable To Text
	@FindBy(xpath="(//span[@class='text-neutral-7'][contains(.,'Payable To')])[2]")
	@CacheLookup
	WebElement txtPayableTo;
	
	//Payable To Result
	@FindBy(xpath="(//span[contains(.,'asd')])[3]")
	@CacheLookup
	WebElement txtPayableToResult;
	
	//G/L Account Number Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'G/L Account Number')]")
	@CacheLookup
	WebElement txtGLAccountNumber;
	
	//G/L Account Number Result
	@FindBy(xpath="//span[contains(.,'10HR.8540.APPREC')]")
	@CacheLookup
	WebElement txtGLAccountNumberResult;
	
	//USD Amount Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'USD Amount')]")
	@CacheLookup
	WebElement txtUSDAmount;
	
	//USD Amount Result
	@FindBy(xpath="//span[contains(.,'$100.00')]")
	@CacheLookup
	WebElement txtUSDAmountResult;
	
	//Volunteer Form Link Button
	public void clickVolunteerForm()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnVolunteerForm);
	}
	
	//Confirm Header "Volunteer Tracking"
	public boolean verifyHeaderVolunteerTracking()
	{
		return func.verifyElementDisplayedWithText(headerVolunteerTracking, "Volunteer Tracking");
	}
	
	//Confirm Header "Volunteer Grants"
	public boolean verifyHeaderVolunteerGrants()
	{
		return func.verifyElementDisplayedWithText(headerVolunteerGrants, "Volunteer Grants");
	}
	
	//Volunteer Form Main is displayed
	public boolean txtVolunteerFormMain()
	{
		return headerVolunteerFormMain.isDisplayed();
	}
	
	//Confirm Header "Volunteer Form"
	public boolean verifyHeaderVolunteerForms()
	{
		return func.verifyElementDisplayedWithText(headerVolunteerForm, "Volunteer Forms");
	}
	
	//Confirm Header "Volunteer Tracking Request"
	public boolean verifyHeaderVolunteerTrackingRequest()
	{
		return func.verifyElementDisplayedWithText(headerVolunteerTrackingRequest, "Volunteer Tracking Request");
	}
	
	//Confirm Header "Associate Information"
	public boolean verifyHeaderAssociateInformation()
	{
		return func.verifyElementDisplayedWithText(headerAssociateInformation, "Associate Information");
	}
	
	//Confirm Header "Volunteer Tracking Form Details"
	public boolean verifyHeaderVolunteerTrackingFormDetails()
	{
		return func.verifyElementDisplayedWithText(headerVolunteerTrackingFormDetails, "Volunteer Tracking Form Details");
	}
	
	//Confirm Header "Guidelines for Completing the Form"
	public boolean verifyHeaderGuidelinesforCompletingtheForm()
	{
		return func.verifyElementDisplayedWithText(headerGuidelinesforCompletingtheForm, "Guidelines for Completing the Form");
	}
	
	//Guidelines for Completing the Form Text is displayed
	public boolean txtGuidelinesforCompletingtheForm()
	{
		return headerVolunteerFormMain.isDisplayed();
	}
	
	//Confirm Header "Fiscal Year"
	public boolean verifyHeaderFiscalYear()
	{
		return func.verifyElementDisplayedWithText(headerFiscalYear, "Fiscal Year");
	}
	
	//Fiscal Year Text Input
	public void fiscalYearInput()
	{
		txtFiscalYear.sendKeys("2021");
	}
	
	//Confirm Header "Volunteering Quarter"
	public boolean verifyHeaderVolunteeringQuarter()
	{
		return func.verifyElementDisplayedWithText(headerVolunteeringQuarter, "Volunteering Quarter");
	}
	
	//Volunteering Quarter is clickable and displayed
	public void volunteeringQuarterClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", ddVolunteeringQuarter);
	}
	
	
	//Column Headers for Case iD, Form Name, Requester and Status
	public boolean locateVoluteeringQuarterOptions()
	{
		if(ddSelectaQuarter.isDisplayed() && ddFirstQuarter.isDisplayed() && ddSecondQuarter.isDisplayed() && ddThirdQuarter.isDisplayed() && ddFourthQuarter.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Select a Quarter is displayed
	public boolean selectaQuarterDisplayed()
	{
		return ddSelectaQuarter.isDisplayed();
	}
	
	//First Quarter is displayed
	public boolean firstQuarterDisplayed()
	{
		return ddFirstQuarter.isDisplayed();
	}
	
	//Second Quarter is displayed
	public boolean secondQuarterDisplayed()
	{
		return ddSecondQuarter.isDisplayed();
	}
	
	//Third Quarter is displayed
	public boolean thirdQuarterDisplayed()
	{
		return ddThirdQuarter.isDisplayed();
	}
		
	//Fourth Quarter is displayed
	public boolean fourthQuarterDisplayed()
	{
		return ddFourthQuarter.isDisplayed();
	}
	
	//Add Agency/ Committee is clickable and displayed
	public void fourthQuarterClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", ddFourthQuarter);
	}
	
	//Add Agency/ Committee is clickable and displayed
	public void addAgencyCommitteeClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnAgencyCommittee);
	}
	
	//Confirm Header "Agency Or ParkIndustries Committee"
	public boolean verifyHeaderAgencyOrParkIndustriesCommittee()
	{
		return func.verifyElementDisplayedWithText(headerAgencyOrParkIndustriesCommittee, "Agency Or Park Industries Committee");
	}
	
	//Agency Or ParkIndustries Committee Text Input
	public void agencyOrParkIndustriesCommitteeInput()
	{
		txtAgencyOrParkIndustriesCommittee.sendKeys("Agent 1");
	}
	
	//Confirm Header "Volunteering Activity"
	public boolean verifyHeaderVolunteeringActivity()
	{
		return func.verifyElementDisplayedWithText(headerVolunteeringActivity, "Volunteering Activity(ies)");
	}
	
	//Volunteering Activity Text Input
	public void volunteeringActivityInput()
	{
		txtVolunteeringActivity.sendKeys("Activity 1");
	}
	
	//Confirm Header "Date Start"
	public boolean verifyHeaderDateStart()
	{
		return func.verifyElementDisplayedWithText(headerDateStart, "Date Start");
	}
	
	//Date Start Text Input
	public void dateStartInput()
	{
		txtDateStart.click();
		txtDateStart.sendKeys("30072021");
	}
	
	//Confirm Header "Date End"
	public boolean verifyHeaderDateEnd()
	{
		return func.verifyElementDisplayedWithText(headerDateEnd, "Date End");
	}
	
	//Date End Text Input
	public void dateEndInput()
	{
		txtDateEnd.click();
		txtDateEnd.sendKeys("06082021");
	}
	
	//Confirm Header "Company Time Hours"
	public boolean verifyHeaderCompanyTimeHours()
	{
		return func.verifyElementDisplayedWithText(headerCompanyTimeHours, "Company Time Hours");
	}
	
	//Company Time Hours Text Input
	public void companyTimeHoursInput()
	{
		txtCompanyTimeHours.sendKeys("30");
	}
	
	//Confirm Header "Personal Time Hours"
	public boolean verifyHeaderPersonalTimeHours()
	{
		return func.verifyElementDisplayedWithText(headerPersonalTimeHours, "Personal Time Hours");
	}
	
	//Personal Time Hours Text Input
	public void personalTimeHoursInput()
	{
		txtPersonalTimeHours.sendKeys("4");
	}
	
	//Close is clickable and displayed
	public void closeClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnClose);
	}
	
	//Save and Close is clickable and displayed
	public void saveCloseClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnSaveClose);
	}
	
	//Save and Close Button Background Color
	public String btnSaveClosetBgColour()
	{
		String bgColour = Color.fromString(btnSaveClose.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Confirm Header "Agency / Committee"
	public boolean verifyHeaderAgencyCommittee()
	{
	  return func.verifyElementDisplayedWithText(headerAgencyCommittee,"Agency / Committee"); 
	}
	
	//Confirm Header "Dates"
	public boolean verifyHeaderDates()
	{
	  return func.verifyElementDisplayedWithText(headerDates,"Dates"); 
	}
	
	//Confirm Header "Hours"
	public boolean verifyHeaderHours()
	{
	  return func.verifyElementDisplayedWithText(headerHours,"Hours"); 
	}

	//Back is clickable and displayed
	public void backClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnBack);
	}
	
	//Save and Submit is clickable and displayed
	public void saveSubmitClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnSaveSubmit);
	}
	
	//Save and Submit Button Background Color
	public String btnSaveSubmitBgColor()
	{
		String bgColour = Color.fromString(btnSaveSubmit.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Volunteer Grants is clickable and displayed
	public void volunteerGrantsClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", headerVolunteerGrants);
	}
	
	//Confirm Header "Volunteer Grant Form"
	public boolean verifyHeaderVolunteerGrantForm()
	{
		return func.verifyElementDisplayedWithText(headerVolunteerGrantForm, "Volunteer Grant Form");
	}
	
	//Volunteer Grant Form Case Number 8 
	public void volunteerGrantsCaseNumber8Clicked()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", txtVolunteerGrantFormCaseNumber8);
	}
	
	//Confirm Header "Volunteer Grant Request"
	public boolean verifyHeaderVolunteerGrantRequest()
	{
		return func.verifyElementDisplayedWithText(headerVolunteerGrantRequest, "Volunteer Grant Request");
	}
	
	//Confirm Header "Personal Information"
	public boolean verifyHeaderPersonalInformation()
	{
		return func.verifyElementDisplayedWithText(headerPersonalInformation, "Personal Information");
	}
	
	//Confirm Header "Volunteer Grant Form Details"
	public boolean verifyHeaderVolunteerGrantFormDetails()
	{
		return func.verifyElementDisplayedWithText(headerVolunteerGrantFormDetails, "Volunteer Grant Form Details");
	}

	//Rejected Text Displayed
	public boolean rejectedTextDisplayed()
	{
		return txtRejected.isDisplayed();
	}
	
	//Rejected Text Button Background Color
	public String txtRejectedBgColor()
	{
		String bgColour = Color.fromString(txtRejected.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Fiscal Year Displayed
	public boolean fiscalYearDisplayed()
	{
		return txtFiscalYearVG.isDisplayed();
	}
	
	//Fiscal Year Result Displayed
	public boolean fiscalYearResultDisplayed()
	{
		return txtFiscalYearVGResult.isDisplayed();
	}
	
	//Grant Amount Displayed
	public boolean grantAmountDisplayed()
	{
		return txtGrantAmount.isDisplayed();
	}
	
	//Grant Amount Result Displayed
	public boolean grantAmountResultDisplayed()
	{
		return txtGrantAmountResult.isDisplayed();
	}
	
	//Confirm Header "Guidelines for Completing the Volunteer Grant Application Form"
	public boolean verifyHeaderGuidelinesVolunteerGrantForm()
	{
		return func.verifyElementDisplayedWithText(headerVolunteerGrantFormDetails, "Guidelines for Completing the Volunteer Grant Application Form");
	}
	
	//Guidlines Drop Down Button
	public void guidelinesDropDownClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", ddGuidelines);
	}
	
	//Guidelines for Completing the Volunteer Grant Application Form Displayed
	public boolean guidelinesVGDisplayed()
	{
		return txtGuidelinesVolunteerGrantForm.isDisplayed();
	}
	
	//Confirm Header "Associate Information"
	public boolean verifyHeaderAssociateInformationVG()
	{
		return func.verifyElementDisplayedWithText(headerAssociateInformationVG, "Associate Information");
	}
	
	//Personal Time Volunteered At Organization Displayed
	public boolean personalTimeVolunteeredAtOrganizationDisplayed()
	{
		return txtPersonalTimeVolunteeredAtOrganization.isDisplayed();
	}
	
	//Personal Time Volunteered At Organization Result Displayed
	public boolean personalTimeVolunteeredAtOrganizationResultDisplayed()
	{
		return txtPersonalTimeVolunteeredAtOrganizationResult.isDisplayed();
	}
	
	//Activities Performed While Volunteering Displayed
	public boolean activitiesPerformedWhileVolunteeringDisplayed()
	{
		return txtActivitiesPerformedWhileVolunteering.isDisplayed();
	}
	
	//Activities Performed While Volunteering Result Displayed
	public boolean activitiesPerformedWhileVolunteeringResultDisplayed()
	{
		return txtActivitiesPerformedWhileVolunteeringResult.isDisplayed();
	}
	
	//Address Displayed
	public boolean addressDisplayed()
	{
		return txtAddress.isDisplayed();
	}
	
	//Address Result Displayed
	public boolean addressResultDisplayed()
	{
		return txtAddressResult.isDisplayed();
	}
	
	//Associate City Displayed
	public boolean associateCityDisplayed()
	{
		return txtAssociateCity.isDisplayed();
	}
	
	//Associate City Result Displayed
	public boolean associateCityResultDisplayed()
	{
		return txtAssociateCityResult.isDisplayed();
	}
	
	//Associate State Displayed
	public boolean associateStateDisplayed()
	{
		return txtAssociateState.isDisplayed();
	}
	
	//Associate State Result Displayed
	public boolean associateStateResultDisplayed()
	{
		return txtAssociateStateResult.isDisplayed();
	}
	
	//Associate Zip Displayed
	public boolean associateZipDisplayed()
	{
		return txtAssociateZip.isDisplayed();
	}
	
	//Associate Zip Result Displayed
	public boolean associateZipResultDisplayed()
	{
		return txtAssociateZipResult.isDisplayed();
	}
	
	//Confirm Header "Non-Profit Organization Information"
	public boolean verifyHeaderNonProfitOrganizationInformation()
	{
		return func.verifyElementDisplayedWithText(headerNonProfitOrganizationInformation, "Non-Profit Organization Information");
	}
	
	//Check Payable To Displayed
	public boolean checkPayableToDisplayed()
	{
		return txtCheckPayableTo.isDisplayed();
	}
	
	//Check Payable To Result Displayed
	public boolean checkPayableToResultDisplayed()
	{
		return txtCheckPayableToResult.isDisplayed();
	}
	
	//Organization Director's Name Displayed
	public boolean organizationDirectorNameDisplayed()
	{
		return txtOrganizationDirectorName.isDisplayed();
	}
	
	//Organization Director's Name Result Displayed
	public boolean organizationDirectorNameResultDisplayed()
	{
		return txtOrganizationDirectorNameResult.isDisplayed();
	}
	
	//Agency Phone Number Displayed
	public boolean agencyPhoneNumberDisplayed()
	{
		return txtAgencyPhoneNumber.isDisplayed();
	}
	
	//Agency Phone Number Result Displayed
	public boolean agencyPhoneNumberResultDisplayed()
	{
		return txtAgencyPhoneNumberResult.isDisplayed();
	}
	
	//Tax Exempt Code Number Displayed
	public boolean taxExemptCodeNumberDisplayed()
	{
		return txtTaxExemptCodeNumber.isDisplayed();
	}
	
	//Tax Exempt Code Number Result Displayed
	public boolean taxExemptCodeNumberResultDisplayed()
	{
		return txtTaxExemptCodeNumberResult.isDisplayed();
	}
	
	//Agency Address Displayed
	public boolean agencyAddressDisplayed()
	{
		return txtAgencyAddress.isDisplayed();
	}
	
	//Agency Address Result Displayed
	public boolean agencyAddressResultDisplayed()
	{
		return txtAgencyAddressResult.isDisplayed();
	}
	
	//Agency City Displayed
	public boolean agencyCityDisplayed()
	{
		return txtAgencyCity.isDisplayed();
	}
	
	//Agency City Result Displayed
	public boolean agencyCityResultDisplayed()
	{
		return txtAgencyCityResult.isDisplayed();
	}
	
	//Agency State Displayed
	public boolean agencyStateDisplayed()
	{
		return txtAgencyState.isDisplayed();
	}
	
	//Agency State Result Displayed
	public boolean agencyStateResultDisplayed()
	{
		return txtAgencyStateResult.isDisplayed();
	}
	
	//Agency Zip Displayed
	public boolean agencyZipDisplayed()
	{
		return txtAgencyZip.isDisplayed();
	}
	
	//Agency Zip Result Displayed
	public boolean agencyZipResultDisplayed()
	{
		return txtAgencyZipResult.isDisplayed();
	}
	
	//Release of Information Displayed
	public boolean releaseofInformationDisplayed()
	{
		return txtReleaseofInformation.isDisplayed();
	}
	
	//Release of Information Result Displayed
	public boolean releaseofInformationResultDisplayed()
	{
		return txtReleaseofInformationResult.isDisplayed();
	}
	
	//Confirm Header "Check Request"
	public boolean verifyHeaderCheckRequest()
	{
		return func.verifyElementDisplayedWithText(headerCheckRequest, "Check Request");
	}
	
	//Address CR Displayed
	public boolean addressCRDisplayed()
	{
		return txtAddressCR.isDisplayed();
	}
	
	//Address CR Result Displayed
	public boolean addressCRResultDisplayed()
	{
		return txtAddressCRResult.isDisplayed();
	}
	
	//Payable To Displayed
	public boolean payableToDisplayed()
	{
		return txtPayableTo.isDisplayed();
	}
	
	//Payable To Result Displayed
	public boolean payableToResultDisplayed()
	{
		return txtPayableToResult.isDisplayed();
	}
	
	//G/L Account Number Displayed
	public boolean gLAccountNumberDisplayed()
	{
		return txtGLAccountNumber.isDisplayed();
	}
	
	//G/L Account Number Result Displayed
	public boolean gLAccountNumberResultDisplayed()
	{
		return txtGLAccountNumberResult.isDisplayed();
	}
	
	//USD Amount Displayed
	public boolean uSDAmountDisplayed()
	{
		return txtUSDAmount.isDisplayed();
	}
	
	//USD Amount Result Displayed
	public boolean uSDAmountResultDisplayed()
	{
		return txtUSDAmountResult.isDisplayed();
	}
	
}
