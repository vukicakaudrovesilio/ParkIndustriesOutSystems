package parkIndustriesOutSystems.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parkIndustriesOutSystems.common.WebElementFunctions;

public class SHARPForm {

	WebDriver ldriver;
	WebElementFunctions func = new WebElementFunctions();
	
	public SHARPForm(WebDriver rdriver) //a constructor; ldriver = local driver, rdriver = remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//SHARP Form Link Button
	@FindBy(xpath="//a[@class='ThemeGrid_MarginGutter'][contains(.,'SHARP Form')]")
	@CacheLookup
	WebElement lbtnSHARPForm;
	
	//SHARP Header
	@FindBy(xpath="//a[@class='ThemeGrid_MarginGutter active'][contains(.,'SHARP')]")
	@CacheLookup
	WebElement headerSHARP;
	
	//SHARP Main Header
	@FindBy(xpath="//span[@class='font-bold'][contains(.,'SHARP')]")
	@CacheLookup
	WebElement headerSHARPMain;
	
	//SCHOLASTIC HONORS AND RECOGNITION PROGRAM (SHARP) Header
	@FindBy(xpath="//span[contains(.,'SHARP)')]")
	@CacheLookup
	WebElement headerSHARPForm;
	
	//SHARP Request Header
	@FindBy(xpath="//h1[contains(.,'SHARP Request')]")
	@CacheLookup
	WebElement headerSHARPRequest;
	
	//SHARP Form Details Header
	@FindBy(xpath="//span[@class='heading3'][contains(.,'SHARP Form Details')]")
	@CacheLookup
	WebElement headerSHARPFormDetails;
	
	//Program Overview Header
	@FindBy(xpath="//div[@class='dividers full-width'][contains(.,'Program Overview')]")
	@CacheLookup
	WebElement headerProgramOverview;
	
	//PROGRAM OVERVIEW Header
	@FindBy(xpath="//span[contains(.,'PROGRAM OVERVIEW')]")
	@CacheLookup
	WebElement headerPROGRAMOVERVIEW;
	
	//PROGRAM OVERVIEW Text
	@FindBy(xpath="(//div[contains(.,'PROGRAM OVERVIEWAs an associate of Park Industries, your dependent children and grandchildren are eligible to receive SHARP incentives for their academic success!Once you are eligible for Park’s benefits (the first of the month following 30 days of employment with Park Industries), your student(s) fromKindergarten through their senior year of college will be eligible for Park Industries’ Scholastic Honors and RecognitionProgram (SHARP).The reward plan is as follows:KindergartenCollegeHigh Honors (all A’s) $40.00$100.00Superior Marks (All A’s and B’s, majority A’s)$25.00$75.00Excellent Marks (All A’s and B’s, majority B’s) $20.00$50.00Improvement in Grade Point Average (GPA)$20.00$50.00Marks meeting or exceeding standards*$15.00*$40.00** Including marks from a grading scale other than the traditional A, B,C, D, etc.PROGRAM DETAILS•    At the end of the grading period (quarter, trimester, or semester), but no more than two times per year, a copy of your student’s grade card can be turned in to Human Resources and a check will be mailed out in your student’s name.•    Students will receive the highest reward they qualify for, but cannot qualify for multiple rewards in one award period.•    Undergraduate college or university students must be enrolled in a minimum of three courses.•    Students who receive Tuition Reimbursement through Park Industries are not eligible for this program.•    The parent or guardian must be eligible for Park’s benefits before the student will be eligible to participate (i.e. Associates must be eligible for benefits before the end of the award period, but need not be eligible during the entire award period).')])[24]")
	@CacheLookup
	WebElement txtPROGRAMOVERVIEW;
	
	//Kindergarten Text
	@FindBy(xpath="//th[contains(.,'Kindergarten')]")
	@CacheLookup
	WebElement txtKindergarten;
	
	//College Text
	@FindBy(xpath="//th[contains(.,'College')]")
	@CacheLookup
	WebElement txtCollege;

	//High Honors Text
	@FindBy(xpath="//span[contains(.,'High Honors (all A’s)')]")
	@CacheLookup
	WebElement txtHighHonors;
	
	//Superior Marks Text
	@FindBy(xpath="//span[contains(.,'Superior Marks (All A’s and B’s, majority A’s)')]")
	@CacheLookup
	WebElement txtSuperiorMarks;

	//Excellent Marks Text
	@FindBy(xpath="//span[contains(.,'Excellent Marks (All A’s and B’s, majority B’s)')]")
	@CacheLookup
	WebElement txtExcellentMarks;
		
	//Improvement in Grade Point Average Text
	@FindBy(xpath="//span[contains(.,'Improvement in Grade Point Average (GPA)')]")
	@CacheLookup
	WebElement txtImprovementInGPA;
		
	//Marks meeting or exceeding standards Text
	@FindBy(xpath="//td[contains(.,'Marks meeting or exceeding standards*')]")
	@CacheLookup
	WebElement txtMarksMeetingOrExceedingStandards;
	
	//Kindergarten Price 1 Text
	@FindBy(xpath="(//span[contains(.,'$40.00')])[1]")
	@CacheLookup
	WebElement txtKindergartenPrice1;
	
	//Kindergarten Price 2 Text
	@FindBy(xpath="//span[contains(.,'$25.00')]")
	@CacheLookup
	WebElement txtKindergartenPrice2;
		
	//Kindergarten Price 3 Text
	@FindBy(xpath="(//span[contains(.,'$20.00')])[1]")
	@CacheLookup
	WebElement txtKindergartenPrice3;
		
	//Kindergarten Price 4 Text
	@FindBy(xpath="(//span[contains(.,'$20.00')])[2]")
	@CacheLookup
	WebElement txtKindergartenPrice4;
	
	//Kindergarten Price 5 Text
	@FindBy(xpath="//span[contains(.,'$15.00*')]")
	@CacheLookup
	WebElement txtKindergartenPrice5;
	
	//College Price 1 Text
	@FindBy(xpath="//span[contains(.,'$100.00')]")
	@CacheLookup
	WebElement txtCollegePrice1;
	
	//College Price 2 Text
	@FindBy(xpath="//span[contains(.,'$75.00')]")
	@CacheLookup
	WebElement txtCollegePrice2;
		
	//College Price 3 Text
	@FindBy(xpath="(//span[contains(.,'$50.00')])[1]")
	@CacheLookup
	WebElement txtCollegePrice3;
		
	//College Price 4 Text
	@FindBy(xpath="(//span[contains(.,'$50.00')])[2]")
	@CacheLookup
	WebElement txtCollegePrice4;
		
	//College Price 5 Text
	@FindBy(xpath="//span[contains(.,'$40.00*')]")
	@CacheLookup
	WebElement txtCollegePrice5;
	
	//Including Marks... Text
	@FindBy(xpath="//span[@class='center-content'][contains(.,'* Including marks from a grading scale other than the traditional A, B,C, D, etc.')]")
	@CacheLookup
	WebElement txtIncludingMarks;
	
	//PROGRAM DETAILS Header
	@FindBy(xpath="//span[@class='font-semi-bold'][contains(.,'PROGRAM DETAILS')]")
	@CacheLookup
	WebElement headerPROGRAMDETAILS;
	
	//PROGRAM DETAILS Text
	@FindBy(xpath="(//div[@class='margin-top-s'][contains(.,'PROGRAM DETAILS•    At the end of the grading period (quarter, trimester, or semester), but no more than two times per year, a copy of your student’s grade card can be turned in to Human Resources and a check will be mailed out in your student’s name.•    Students will receive the highest reward they qualify for, but cannot qualify for multiple rewards in one award period.•    Undergraduate college or university students must be enrolled in a minimum of three courses.•    Students who receive Tuition Reimbursement through Park Industries are not eligible for this program.•    The parent or guardian must be eligible for Park’s benefits before the student will be eligible to participate (i.e. Associates must be eligible for benefits before the end of the award period, but need not be eligible during the entire award period).')])[2]")
	@CacheLookup
	WebElement txtPROGRAMDETAILS;
	
	//Student's Name Text
	@FindBy(xpath="//label[contains(@for,'Input_StudentsName')]")
	@CacheLookup
	WebElement txtStudentName;
	
	//Student's Address Text
	@FindBy(xpath="//label[contains(@for,'Input_StudentsAddress')]")
	@CacheLookup
	WebElement txtStudentAddress;
	
	//Year In School Text
	@FindBy(xpath="//label[@class='mandatory OSFillParent'][contains(.,'Year In School')]")
	@CacheLookup
	WebElement txtYearInSchool;
	
	//Year In School Drop Down
	@FindBy(xpath="//select[contains(@id,'YearInSchoolDropdown')]")
	@CacheLookup
	WebElement ddYearInSchool;
	
	//Year In School Option 1 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[2]")
	@CacheLookup
	WebElement txtYearInSchoolOption1;
	
	//Year In School Option 2 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[3]")
	@CacheLookup
	WebElement txtYearInSchoolOption2;
		
	//Year In School Option 3 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[4]")
	@CacheLookup
	WebElement txtYearInSchoolOption3;
		
	//Year In School Option 4 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[5]")
	@CacheLookup
	WebElement txtYearInSchoolOption4;
		
	//Year In School Option 5 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[6]")
	@CacheLookup
	WebElement txtYearInSchoolOption5;
		
	//Year In School Option 6 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[7]")
	@CacheLookup
	WebElement txtYearInSchoolOption6;
		
	//Year In School Option 7 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[8]")
	@CacheLookup
	WebElement txtYearInSchoolOption7;
		
	//Year In School Option 8 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[9]")
	@CacheLookup
	WebElement txtYearInSchoolOption8;
		
	//Year In School Option 9 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[10]")
	@CacheLookup
	WebElement txtYearInSchoolOption9;
		
	//Year In School Option 10 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[11]")
	@CacheLookup
	WebElement txtYearInSchoolOption10;
		
	//Year In School Option 11 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[12]")
	@CacheLookup
	WebElement txtYearInSchoolOption11;
		
	//Year In School Option 12 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[13]")
	@CacheLookup
	WebElement txtYearInSchoolOption12;
		
	//Year In School Option 13 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[14]")
	@CacheLookup
	WebElement txtYearInSchoolOption13;
		
	//Year In School Option 14 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[15]")
	@CacheLookup
	WebElement txtYearInSchoolOption14;
		
	//Year In School Option 15 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[16]")
	@CacheLookup
	WebElement txtYearInSchoolOption15;
		
	//Year In School Option 16 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[17]")
	@CacheLookup
	WebElement txtYearInSchoolOption16;
		
	//Year In School Option 17 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[1]/div/div/div/select/option[18]")
	@CacheLookup   
	WebElement txtYearInSchoolOption17;
	
	//Award Text
	@FindBy(xpath="//label[contains(@for,'TermDropdown')]")
	@CacheLookup   
	WebElement txtAward;
	
	//Award Drop Down
	@FindBy(xpath="//div[@class='dropdown-display'][contains(.,'Select an Item...')]")
	@CacheLookup   
	WebElement ddAward;
	
	//Award Option 1 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div[2]/span")
	@CacheLookup   
	WebElement txtAwardOption1;
	
	//Award Option 2 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div[3]/span")
	@CacheLookup   
	WebElement txtAwardOption2;
		
	//Award Option 3 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div[4]/span")
	@CacheLookup   
	WebElement txtAwardOption3;
		
	//Award Option 4 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div[5]/span")
	@CacheLookup   
	WebElement txtAwardOption4;
		
	//Award Option 5 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div[6]/span")
	@CacheLookup   
	WebElement txtAwardOption5;
	
	//Award Period Text
	@FindBy(xpath="//label[@class='mandatory OSFillParent'][contains(.,'Award Period')]")
	@CacheLookup   
	WebElement txtAwardPeriod;
	
	//Award Period Drop Down
	@FindBy(xpath="//select[contains(@id,'Dropdown1')]")
	@CacheLookup   
	WebElement ddAwardPeriod;
	
	//Award Period Option 1 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[3]/div/div/div[1]/div/div/div/select/option[2]")
	@CacheLookup    
	WebElement txtAwardPeriodOption1;
	
	//Award Period Option 2 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[3]/div/div/div[1]/div/div/div/select/option[3]")
	@CacheLookup   
	WebElement txtAwardPeriodOption2;
	
	//Relationship Text
	@FindBy(xpath="//label[@class='mandatory OSFillParent'][contains(.,'Relationship')]")
	@CacheLookup   
	WebElement txtRelationship;
	
	//Relationship Drop Down
	@FindBy(xpath="//select[contains(@id,'Relationship')]")
	@CacheLookup   
	WebElement ddRelationship;
	
	//Relationship Option 1 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[3]/div/div/div[2]/div/div/div/select/option[2]")
	@CacheLookup   
	WebElement txtRelationshipOption1;
	
	//Relationship Option 2 Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/form/div[3]/div[3]/div/div/div[2]/div/div/div/select/option[3]")
	@CacheLookup   
	WebElement txtRelationshipOption2;
	
	//School Text
	@FindBy(xpath="//label[contains(@for,'Input_School')]")
	@CacheLookup   
	WebElement txtSchool;
	
	//School Input
	@FindBy(xpath="//input[@type='text'][contains(@id,'School')]")
	@CacheLookup   
	WebElement inputSchool;
	
	//Attached Files 1
	@FindBy(xpath="//a[@href='javascript:void(0);'][contains(.,'Attached Files (Student Grade Reports)')]")
	@CacheLookup   
	WebElement inputAttachedFiles1;
	
	//Attached Files Text
	@FindBy(xpath="(//div[contains(.,'*Attach a copy of the student’s grade report. If you are submitting a form for an improvement in GPA between two terms, please attach copies of both terms.')])[21]")
	@CacheLookup   
	WebElement txtAttachedFiles;
	
	//Attached Files
	@FindBy(xpath="//input[contains(@type,'file')]")
	@CacheLookup   
	WebElement inputAttachedFiles2;
	
	//Button Back
	@FindBy(xpath="//button[@class='btn OSFillParent'][contains(.,'Back')]")
	@CacheLookup   
	WebElement btnBack;
	
	//Save And Submit Back
	@FindBy(xpath="//div[@class='btn-label OSInline'][contains(.,'Save & Submit')]")
	@CacheLookup   
	WebElement btnSaveSubmit;
	
	//SHARP Form Link Button
	public void clickSHARPForm()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnSHARPForm);
	}
	
	//Confirm Header "SHARP"
	public boolean verifyHeaderSHARP()
	{
		return func.verifyElementDisplayedWithText(headerSHARP, "SHARP");
	}
	
	//SHARP Form Main is displayed
	public boolean txtSHARPFormMain()
	{
		return headerSHARPMain.isDisplayed();
	}
	
	//Confirm Header "SHARP" Form
	public boolean verifyHeaderSHARPForm()
	{
		return func.verifyElementDisplayedWithText(headerSHARPForm, "SCHOLASTIC HONORS AND RECOGNITION PROGRAM (SHARP)");
	}
	
	//Confirm Header "SHARP Request" 
	public boolean verifyHeaderSHARPRequest()
	{
		return func.verifyElementDisplayedWithText(headerSHARPRequest, "SHARP Request");
	}
	
	//Confirm Header "SHARP Form Details" 
	public boolean verifyHeaderSHARPFormDetails()
	{
		return func.verifyElementDisplayedWithText(headerSHARPFormDetails, "SHARP Form Details");
	}
	
	//Confirm Header "Program Overview" 
	public boolean verifyHeaderProgramOverview()
	{
		return func.verifyElementDisplayedWithText(headerProgramOverview, "Program Overview");
	}
	
	//Confirm Header "PROGRAM OVERVIEW" 
	public boolean verifyHeaderPROGRAMOVERVIEW()
	{
		return func.verifyElementDisplayedWithText(headerPROGRAMOVERVIEW, "PROGRAM OVERVIEW");
	}
	
	//PROGRAM OVERVIEW is displayed
	public boolean txtPROGRAMOVERVIEWDisplyed()
	{
		return txtPROGRAMOVERVIEW.isDisplayed();
	}
	
	//Kindergarten is displayed
	public boolean txtKindergartenDisplyed()
	{
		return txtKindergarten.isDisplayed();
	}
	
	//College is displayed
	public boolean txtCollegeDisplyed()
	{
		return txtCollege.isDisplayed();
	}
	
	//High Honors is displayed
	public boolean txtHighHonorsDisplyed()
	{
		return txtHighHonors.isDisplayed();
	}
	
	//Superior Marks is displayed
	public boolean txtSuperiorMarksDisplyed()
	{
		return txtSuperiorMarks.isDisplayed();
	}
	
	//Excellent Marks is displayed
	public boolean txtExcellentMarksDisplyed()
	{
		return txtExcellentMarks.isDisplayed();
	}
	
	//Improvement In GPA is displayed
	public boolean txtImprovementInGPADisplyed()
	{
		return txtImprovementInGPA.isDisplayed();
	}
	
	//Marks Meeting Or Exceeding Standards is displayed
	public boolean txtMarksMeetingOrExceedingStandardsDisplyed()
	{
		return txtMarksMeetingOrExceedingStandards.isDisplayed();
	}
	
	//Kindergarten Price 1 is displayed
	public boolean txtKindergartenPrice1Displyed()
	{
		return txtKindergartenPrice1.isDisplayed();
	}
	
	//Kindergarten Price 2 is displayed
	public boolean txtKindergartenPrice2Displyed()
	{
		return txtKindergartenPrice2.isDisplayed();
	}
	
	//Kindergarten Price 3 is displayed
	public boolean txtKindergartenPrice3Displyed()
	{
		return txtKindergartenPrice3.isDisplayed();
	}
		
	//Kindergarten Price 4 is displayed
	public boolean txtKindergartenPrice4Displyed()
	{
		return txtKindergartenPrice4.isDisplayed();
	}
		
	//Kindergarten Price 5 is displayed
	public boolean txtKindergartenPrice5Displyed()
	{
		return txtKindergartenPrice5.isDisplayed();
	}
	
	//College Price 1 is displayed
	public boolean txtCollegePrice1Displyed()
	{
		return txtCollegePrice1.isDisplayed();
	}
	
	//College Price 2 is displayed
	public boolean txtCollegePrice2Displyed()
	{
		return txtCollegePrice2.isDisplayed();
	}
	
	//College Price 3 is displayed
	public boolean txtCollegePrice3Displyed()
	{
		return txtCollegePrice3.isDisplayed();
	}
		
	//College Price 4 is displayed
	public boolean txtCollegePrice4Displyed()
	{
		return txtCollegePrice4.isDisplayed();
	}
		
	//College Price 5 is displayed
	public boolean txtCollegePrice5Displyed()
	{
		return txtCollegePrice5.isDisplayed();
	}
	
	//Including Marks 5 is displayed
	public boolean txtIncludingMarksDisplyed()
	{
		return txtIncludingMarks.isDisplayed();
	}
	
	//Confirm Header "PROGRAM DETAILS" 
	public boolean verifyHeaderPROGRAMDETAILS()
	{
		return func.verifyElementDisplayedWithText(headerPROGRAMDETAILS, "PROGRAM DETAILS");
	}
	
	//Including Marks is displayed
	public boolean txtPROGRAMDETAILSDisplyed()
	{
		return txtPROGRAMDETAILS.isDisplayed();
	}
	
	//Student Name is displayed
	public boolean txtStudentNameDisplyed()
	{
		return txtStudentName.isDisplayed();
	}
	
	//Student Address is displayed
	public boolean txtStudentAddressDisplyed()
	{
		return txtStudentAddress.isDisplayed();
	}
	
	//Year In School Drop Down is clicked and displayed
	public void clickYearInSchoolDropDown()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", ddYearInSchool);
	}
	
	//Year In School Options
	public boolean locateYearInSchoolOptions()
	{
		if(txtYearInSchoolOption1.isDisplayed() && txtYearInSchoolOption2.isDisplayed() && txtYearInSchoolOption3.isDisplayed() && txtYearInSchoolOption4.isDisplayed() && txtYearInSchoolOption5.isDisplayed() && txtYearInSchoolOption6.isDisplayed() && txtYearInSchoolOption7.isDisplayed() && txtYearInSchoolOption8.isDisplayed() && txtYearInSchoolOption9.isDisplayed() && txtYearInSchoolOption10.isDisplayed() && txtYearInSchoolOption11.isDisplayed() && txtYearInSchoolOption12.isDisplayed() && txtYearInSchoolOption13.isDisplayed() && txtYearInSchoolOption14.isDisplayed() && txtYearInSchoolOption15.isDisplayed() && txtYearInSchoolOption16.isDisplayed() && txtYearInSchoolOption17.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Award is clicked and displayed
	public void clickAwardDropDown()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", ddYearInSchool);
	}
	
	//Award Options is displayed
	public boolean locateAwardOptions()
	{
		if(txtAwardOption1.isDisplayed() && txtAwardOption2.isDisplayed() && txtAwardOption3.isDisplayed() && txtAwardOption4.isDisplayed() && txtAwardOption5.isDisplayed()) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Award Period is clicked and displayed
	public void clickAwardPeriodDropDown()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", ddAwardPeriod);
	}
	
	//Award Period Options is displayed
	public boolean locateAwardPeriodOptions()
	{
		if(txtAwardPeriodOption1.isDisplayed() && txtAwardPeriodOption2.isDisplayed()) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Relationship is clicked and displayed
	public void clickRelationshipDropDown()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", ddAwardPeriod);
	}
	
	//Relationship Options is displayed
	public boolean locateRelationshipOptions()
	{
		if(txtRelationshipOption1.isDisplayed() && txtRelationshipOption2.isDisplayed()) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//School is displayed
	public boolean inputSchoolDisplyed()
	{
		return inputSchool.isDisplayed();
	}
	
	//Attached Files is displayed
	public boolean inputAttachedFilesDisplyed()
	{
		return inputAttachedFiles1.isDisplayed();
	}
	
	//Attached Files Text is displayed
	public boolean txtAttachedFilesDisplyed()
	{
		return txtAttachedFiles.isDisplayed();
	}
	
	//Back Button is displayed
	public boolean btnBackDisplyed()
	{
		return btnBack.isDisplayed();
	}
	
	//Back Button is clickable and displayed
	public void backClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnBack);
	}
	
	//Save and Submit Button is displayed
	public boolean btnSaveSubmitDisplyed()
	{
		return btnSaveSubmit.isDisplayed();
	}
	
	//Save and Submit Button Background Color
	public String btnSaveSubmitBgColor()
	{
		String bgColour = Color.fromString(btnSaveSubmit.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Save and Submit Button is clickable and displayed
	public void saveSubmitClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnSaveSubmit);
	}
	
}
