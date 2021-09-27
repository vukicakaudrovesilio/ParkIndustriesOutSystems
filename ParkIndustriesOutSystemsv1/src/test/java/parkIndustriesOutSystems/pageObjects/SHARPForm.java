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
	@FindBy(xpath="//input[@type='text'][contains(@id,'StudentsName')]")
	@CacheLookup
	WebElement txtStudentName;
	
	//Student's Address Text
	@FindBy(xpath="//input[@type='text'][contains(@id,'StudentsAddress')]")
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
	@FindBy(xpath="//input[@type='text'][contains(@id,'School')]")
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
	
	//Placeholder Text Search By Case #
	@FindBy(xpath="//input[contains(@placeholder,'Search by Case #')]")
	@CacheLookup   
	WebElement txtSearchByCaseNumber;
	
	//Search Results No Items To Show 
	@FindBy(xpath="//span[@role='status'][contains(.,'No items to show...')]")
	@CacheLookup   
	WebElement txtSearchNoResults;
	
	//Search Results Case Number 35
	@FindBy(xpath="//span[contains(.,'35')]")
	@CacheLookup   
	WebElement txtSearchCaseNumber35;
	
	//New Request by Park Associate User Comments Field
	@FindBy(xpath="//span[contains(.,'New request by Park Associate User')]")
	@CacheLookup   
	WebElement txtNewRequest;
	
	//New Request by Park Associate User Comments Field
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/span")
	@CacheLookup   
	WebElement txtCreated;
	
	//Case Number 1
	@FindBy(xpath="(//span[contains(.,'1')])[1]")
	@CacheLookup   
	WebElement txtCaseNumber1;
	
	//Park Associate User 
	@FindBy(xpath="(//span[contains(.,'Park Associate User')])[2]")
	@CacheLookup   
	WebElement txtParkAssociateUser;
	
	//Associate Number 8888888
	@FindBy(xpath="(//span[contains(.,'8888888')])[1]")
	@CacheLookup   
	WebElement txtAssociateNumber8888888;
	
	//Department SS Customer Service
	@FindBy(xpath="(//span[@class='OSFillParent'][contains(.,'SS Customer Service')])[1]")
	@CacheLookup   
	WebElement txtDepartmentSSCustomerService;
	
	//Status Created
	@FindBy(xpath="//div[@class='tag border-radius-rounded background-neutral-4 OSInline'][contains(@id,'0-b5-Tag')][contains(.,'Created')]")
	@CacheLookup   
	WebElement txtStatusCreated;
	
	//Status Created
	@FindBy(xpath="(//span[contains(.,'Submitted')])[1]")
	@CacheLookup   
	WebElement txtStatusSubmitted;
	
	//Date Submitted Not Submitted Yet
	@FindBy(xpath="(//div[contains(.,'(Not Submitted Yet)')])[17]")
	@CacheLookup   
	WebElement txtDateSubmittedNotYet;
	
	//Date Submitted 09/09/2021
	@FindBy(xpath="(//div[contains(.,'(Not Submitted Yet)')])[17]")
	@CacheLookup   
	WebElement txtDateSubmitted09092021;
	
	//Close Button
	@FindBy(xpath="//button[@class='btn btn-cancel'][contains(.,'Close')]")
	@CacheLookup   
	WebElement btnClose;
	
	//Status Changed Text Comment Section
	@FindBy(xpath="//span[contains(.,'Status changed')]")
	@CacheLookup   
	WebElement txtStatusChanged1;
	
	//Submitted Text Comment Section
	@FindBy(xpath="(//span[contains(.,'Submitted')])[3]")
	@CacheLookup   
	WebElement txtSubmitted;
	
	//Pick Up Button
	@FindBy(xpath="(//button[@class='btn btn-small btn-primary'][contains(.,'Pick Up')])[1]")
	@CacheLookup   
	WebElement btnPickUp;
	
	//Status Changed Text Comment Section
	@FindBy(xpath="(//span[contains(.,'Status changed')])[1]")
	@CacheLookup   
	WebElement txtStatusChanged2;
	
	//HR Review Text Comment Section
	@FindBy(xpath="(//span[contains(.,'HR Review')])[2]")
	@CacheLookup   
	WebElement txtHRReview;
	
	//Approve Button
	@FindBy(xpath="//button[@class='btn btn-primary'][contains(.,'Approve')]")
	@CacheLookup   
	WebElement btnApprove1;
	
	//Confirm Approval Text
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Confirm Approval')]")
	@CacheLookup   
	WebElement txtConfirmApproval;
	
	//Confirm Approval Comment Text
	@FindBy(xpath="//textarea[@class='form-control OSFillParent'][contains(@id,'PopupCommentBox')]")
	@CacheLookup   
	WebElement txtConfirmApprovalComment;
	
	//Approve Button in Approval Section
	@FindBy(xpath="//button[@class='btn btn-primary OSFillParent'][contains(.,'Approve')]")
	@CacheLookup   
	WebElement btnApprove2;
	
	//Reject Button in Rejection Section
	@FindBy(xpath="//button[@class='btn btn-error ThemeGrid_MarginGutter'][contains(.,'Reject')]")
	@CacheLookup   
	WebElement btnReject1;
	
	//Reject Button in Rejection Section
	@FindBy(xpath="//div[@class='btn-label OSInline'][contains(.,'Reject')]")
	@CacheLookup   
	WebElement btnReject2;

	//Approved By HR Tag
	@FindBy(xpath="(//span[contains(.,'Approved by HR')])[1]")
	@CacheLookup   
	WebElement approvedByHRTag;
	
	//Status changed by Human Resources User Text in Comment Section
	@FindBy(xpath="//span[contains(.,'Status changed by Human Resources User')]")
	@CacheLookup   
	WebElement txtStatusChangedByHRUser;
	
	//Approved by HR Text in Comment Section
	@FindBy(xpath="(//span[contains(.,'Approved by HR')])[2]")
	@CacheLookup   
	WebElement txtApprovedByHR;
	
	//Approved Text in Comment Section
	@FindBy(xpath="(//span[contains(.,'Approved by HR')])[2]")
	@CacheLookup   
	WebElement txtApproved;
	
	//Payment Pending Tag
	@FindBy(xpath="(//span[contains(.,'Payment Pending')])[1]")
	@CacheLookup   
	WebElement paymentPendingTag;
	
	//Status Changed Text Comment Section
	@FindBy(xpath="(//span[contains(.,'Status changed')])[1]")
	@CacheLookup   
	WebElement txtStatusChanged3;
	
	//Payment Pending Text Comment Section
	@FindBy(xpath="(//span[contains(.,'Payment Pending')])[2]")
	@CacheLookup   
	WebElement txtPaymentPending;
	
	//Mark As Complete Button 
	@FindBy(xpath="//button[@class='btn ThemeGrid_MarginGutter'][contains(.,'Mark as Complete')]")
	@CacheLookup   
	WebElement btnMarkAsComplete;
	
	//Payment Completed Tag
	@FindBy(xpath="(//span[contains(.,'Payment - Completed')])[1]")
	@CacheLookup   
	WebElement paymentCompletedTag;
	
	//Status changed by Accounting User Text Comment Section
	@FindBy(xpath="//span[contains(.,'Status changed by Accounting User')]")
	@CacheLookup   
	WebElement txtStatusChangedByAccountingUser;
	
	//Payment Completed Text Comment Section
	@FindBy(xpath="(//span[contains(.,'Payment - Completed')])[2]")
	@CacheLookup   
	WebElement txtPaymentCompleted;
	
	//Rejected 1 Text Comment Section
	@FindBy(xpath="(//span[contains(.,'Rejected')])[2]")
	@CacheLookup   
	WebElement txtRejected1;
	
	//Rejected 2 Text Comment Section
	@FindBy(xpath="(//span[contains(.,'Rejected')])[3]")
	@CacheLookup   
	WebElement txtRejected2;
	
	//Rejected and Returned To HR Button
	@FindBy(xpath="//button[@class='btn'][contains(.,'Reject & Return to HR')]")
	@CacheLookup   
	WebElement btnRejectedReturnedHR;
	
	//Rejected and Returned To HR Comment Section
	@FindBy(xpath="//textarea[@class='form-control OSFillParent'][contains(@id,'PopupCommentBox2')]")
	@CacheLookup   
	WebElement txtRejectedReturnedHRComment;
	
	//Return To HR Button
	@FindBy(xpath="//div[@class='btn-label OSInline'][contains(.,'Return to HR')]")
	@CacheLookup   
	WebElement btnReturnToHR;
	
	//Returned To HR Text
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div/span")
	@CacheLookup   
	WebElement txtReturnedToHR;
	
	//Returned To HR User Text Comment Section 
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[2]/div/div[2]/div/div/span")
	@CacheLookup   
	WebElement txtReturnedToHRCommentSection;
	
	//Rejected Text Comment Section 
	@FindBy(xpath="//span[contains(.,'Rejected')]")
	@CacheLookup   
	WebElement txtRejectedCommentSection;

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
		js.executeScript("arguments[0].click()", ddAward);
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
	
	//Attached Files 1 is clickable and displayed
	public void attachedFiles1Clickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", inputAttachedFiles1);
	}
	
	//Attached Files 2 is clickable and displayed
	public void attachedFiles2Clickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", inputAttachedFiles2);
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
	
	//Placeholder Text Search By Case Number is displayed
	public boolean txtSearchByCaseNumberDisplayed()
	{
		return txtSearchByCaseNumber.isDisplayed();
	}
	
	//Search Nesh
	public void searchNesh()
	{
		txtSearchByCaseNumber.sendKeys("Nesh");
	}
	
	//Search Case # 35
	public void searchCaseNumber35()
	{
		txtSearchByCaseNumber.sendKeys("35");
	}
	
	//Case Number 1 is displayed
	public boolean caseNumber1Displayed()
	{
		return txtCaseNumber1.isDisplayed();
	}
	
	//Park Associate User is displayed
	public boolean parkAssociateUserDisplayed()
	{
		return txtParkAssociateUser.isDisplayed();
	}
	
	//Associate Number 8888888 is displayed
	public boolean associateNumber8888888Displayed()
	{
		return txtAssociateNumber8888888.isDisplayed();
	}
	
	//Department SS Customer Service is displayed
	public boolean departmentDisplayed()
	{
		return txtDepartmentSSCustomerService.isDisplayed();
	}
	
	//Status Created is displayed
	public boolean statusCreatedDisplayed()
	{
		return txtStatusCreated.isDisplayed();
	}
	
	//Status Submitted is displayed
	public boolean statusSubmittedDisplayed()
	{
		return txtStatusSubmitted.isDisplayed();
	}
	
	//Date Submitted Not Yet Submitted is displayed
	public boolean dateSubmittedNotYetDisplayed()
	{
		return txtDateSubmittedNotYet.isDisplayed();
	}
	
	//Date Submitted 09/09/2021 is displayed
	public boolean dateSubmitted09092021Displayed()
	{
		return txtDateSubmitted09092021.isDisplayed();
	}
	
	//Clear Search 
	public void clearSearch()
	{
		txtSearchByCaseNumber.clear();
	}
	
	//Search No Results is displayed
	public boolean txtSearchNoResultsDisplayed()
	{
		return txtSearchNoResults.isDisplayed();
	}
	
	//Search Case Number 35 is displayed
	public boolean txtSearchCaseNumber35Displayed()
	{
		return txtSearchCaseNumber35.isDisplayed();
	}
	
	//New Request by Park Associate User Text is displayed in comments field
	public boolean txtNewRequestDisplayed()
	{
		return txtNewRequest.isDisplayed();
	}
		
	//Created Text is displayed in comments field
	public boolean txtCreatedDisplayed()
	{
		return txtCreated.isDisplayed();
	}
	
	//Enter Student Name 
	public void enterStudentName()
	{
		txtStudentName.sendKeys("Nesh");
	}
	
	//Enter Student Address
	public void enterStudentAddress()
	{
		txtStudentAddress.sendKeys("33 ABC Drive");
	}
	
	//Click 7th Grade in Year In School
	public void clickYearInSchool()
	{
		txtYearInSchoolOption8.click();
	}
	
	//Click 5th Grade in Year In School
	public void clickYearInSchool5()
	{
		txtYearInSchoolOption6.click();
	}
	
	//Click College Junior in Year In School
	public void clickYearInSchoolCollegeJunior()
	{
		txtYearInSchoolOption16.click();
	}
	
	//Click Award Excellent
	public void clickAwardExcellent()
	{
		txtAwardOption3.click();
	}
	
	//Click Award Superior
	public void clickAwardSuperior()
	{
		txtAwardOption2.click();
	}
	
	//Click Award Superior
	public void clickImproveGPA()
	{
		txtAwardOption4.click();
	}

	//Click Award Period July - December
	public void clickAwardPeriodJuly()
	{
		txtAwardPeriodOption1.click();
	}
	
	//Click Relationship
	public void clickRelationship()
	{
		txtRelationshipOption2.click();
	}
	
	//Enter School
	public void enterSchool()
	{
		txtSchool.sendKeys("ABC School");
	}
	
	//Close Button is clickable and displayed
	public void btnCloseClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnClose);
	}
	
	//Status Changed Text is displayed in comments field
	public boolean txtStatusChanged1Displayed()
	{
		return txtStatusChanged1.isDisplayed();
	}
	
	//Submitted Text is displayed in comments field
	public boolean txtSubmittedDisplayed()
	{
		return txtSubmitted.isDisplayed();
	}
	
	//Pick Up Button is clickable and displayed
	public void btnPickUpClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnPickUp);
	}
	
	//Status Changed Text is displayed in comments field
	public boolean txtStatusChanged2Displayed()
	{
		return txtStatusChanged2.isDisplayed();
	}
	
	//HR Review Text is displayed in comments field
	public boolean txtHRReviewDisplayed()
	{
		return txtHRReview.isDisplayed();
	}
	
	//Approve 1 Button is clickable and displayed
	public void btnApprove1Clickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnApprove1);
	}
	
	//Add Comment in Approval Section
	public void addCommentApprovalSection()
	{
		txtConfirmApprovalComment.sendKeys("Approved");
	}
	
	//Add Comment in Approval Section
	public void addCommentRejectSection()
	{
		txtConfirmApprovalComment.sendKeys("Rejected");
	}
	
	//Approve 2 Button is clickable and displayed
	public void btnApprove2Clickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnApprove2);
	}
	
	//Reject Button is displayed in comments field
	public boolean btnRejectDisplayed()
	{
		return btnReject1.isDisplayed();
	}
	
	//Reject Button is clickable and displayed
	public void btnReject1Clickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnReject1);
	}
	
	//Reject Button is clickable and displayed
	public void btnReject2Clickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnReject2);
	}
	
	//Reject Button Background Color
	public String btnRejectBgColour()
	{
		String bgColour = Color.fromString(btnReject1.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Approved By HR Tag is displayed 
	public boolean approvedByHRTagDisplayed()
	{
		return approvedByHRTag.isDisplayed();
	}
	
	//Status Changed By HR User Text is displayed in comments field
	public boolean txtStatusChangedByHRUserDisplayed()
	{
		return txtStatusChangedByHRUser.isDisplayed();
	}
	
	//Approved By HR Text is displayed in comments field
	public boolean txtApprovedByHRDisplayed()
	{
		return txtApprovedByHR.isDisplayed();
	}
	
	//Approved Text is displayed in comments field
	public boolean txtApprovedDisplayed()
	{
		return txtApproved.isDisplayed();
	}
	
	//Payment Pending Tag is displayed 
	public boolean paymentPendingTagDisplayed()
	{
		return paymentPendingTag.isDisplayed();
	}
	
	//Status Changed Text is displayed in comments field
	public boolean txtStatusChanged3Displayed()
	{
		return txtStatusChanged3.isDisplayed();
	}
	
	//Payment Pending Text is displayed 
	public boolean txtPaymentPendingDisplayed()
	{
		return txtPaymentPending.isDisplayed();
	}
	
	//Mark As Complete Button is clickable and displayed
	public void btnMarkAsCompleteClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnMarkAsComplete);
	}
	
	//Payment Completed Tag is displayed
	public boolean paymentCompletedTagDisplayed()
	{
		return paymentCompletedTag.isDisplayed();
	}
	
	//Status Changed By Accounting User Text is displayed in comments field
	public boolean txtStatusChangedByAccountingUserDisplayed()
	{
		return txtStatusChangedByAccountingUser.isDisplayed();
	}
	
	//Payment Completed Text is displayed in comments field
	public boolean txtPaymentCompletedDisplayed()
	{
		return txtPaymentCompleted.isDisplayed();
	}
	
	//Rejected 1 Text is displayed in comments field
	public boolean txtRejected1Displayed()
	{
		return txtRejected1.isDisplayed();
	}
	
	//Rejected 2 Text is displayed in comments field
	public boolean txtRejected2Displayed()
	{
		return txtRejected2.isDisplayed();
	}
	
	//Rejected And Returned To HR Button
	public void clickRejectedReturnedHR()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnRejectedReturnedHR);
	}
	
	//Add Comment in Rejected And Returned To HR Comment Section
	public void addCommentRejectedReturnedHRSection()
	{
		txtRejectedReturnedHRComment.sendKeys("Rejected");
	}
	
	//Return To HR Button
	public void clickReturnToHR()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnReturnToHR);
	}
	
	//Returned To HR Displayed
	public boolean txtReturnedToHRDisplayed()
	{
		return txtReturnedToHR.isDisplayed();
	}
	
	//Returned To HR Comment Section Displayed
	public boolean txtReturnedToHRCommentSectionDisplayed()
	{
		return txtReturnedToHRCommentSection.isDisplayed();
	}
	
	//Rejected Text Comment Section Displayed
	public boolean txtRejectedCommentSectionDisplayed()
	{
		return txtRejectedCommentSection.isDisplayed();
	}
	
}
