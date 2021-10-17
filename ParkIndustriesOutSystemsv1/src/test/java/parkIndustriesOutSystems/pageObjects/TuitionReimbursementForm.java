package parkIndustriesOutSystems.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import parkIndustriesOutSystems.common.WebElementFunctions;

public class TuitionReimbursementForm {

	WebDriver ldriver;
	WebElementFunctions func = new WebElementFunctions();
	
	public TuitionReimbursementForm(WebDriver rdriver) //a constructor; ldriver = local driver, rdriver = remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Tuition Form Link Button
	@FindBy(xpath="//button[contains(text(),'Tuition Reimbursement')]")
	@CacheLookup
	WebElement tuitionTab;
	
	//Initial Reimbursement Header
	@FindBy(xpath="//a[contains(text(),'Initial Reimbursement')]")
	@CacheLookup
	WebElement initialHeader;
	
	//Associate Forms Header
	@FindBy(xpath="//a[contains(text(),'Associate Forms Portal')]")
	@CacheLookup
	WebElement associatePortalHeader;
	
	//Park Associate User's Requests header
	@FindBy(xpath="//span[contains(text(),\"Park Associate User's Requests\")]")
	@CacheLookup
	WebElement parkAssociateUserHeader;
	
	//Final Reimbursement Header
	@FindBy(xpath="//a[contains(text(),'Final Reimbursement')]")
	@CacheLookup
	WebElement finalHeader;
	
	//Go To Sample Login Header
	@FindBy(xpath="//a[contains(text(),'Go To Sample Login')]")
	@CacheLookup
	WebElement loginHeader;
	
	//Login as sample user text
	@FindBy(xpath="//span[contains(text(),'Login as Sample User')]")
	@CacheLookup
	WebElement sampleLoginText;
	
	//Park Associate User login
	@FindBy(xpath="//span[contains(text(),'Park Associate User')]")
	@CacheLookup
	WebElement parkAssociateUser;

	//click PAU
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/nav[1]/div[2]/div[1]/div[1]/div[2]/a[1]/i[1]")
	@CacheLookup
	WebElement clickParkAssociateUser;
	
	//Sign in page
	@FindBy(xpath="//div[contains(text(),'Sign in with your Park Industries Account:')]")
	@CacheLookup
	WebElement signInPage;
	
	//Request List header
	@FindBy(xpath="//div[contains(text(),'Request List')]")
	@CacheLookup
	WebElement reqList;
	
	//search box
	@FindBy(xpath="//input[@id='Input_TextVar']")
	@CacheLookup
	WebElement searchBar;
	
	//Placeholder text
	
	
	
	
	//No items to show
	@FindBy(xpath="//span[contains(text(),'No items to show...')]")
	@CacheLookup
	WebElement noItemsText;
	
	//#47
	@FindBy(xpath="//span[contains(text(),'47')]")
	@CacheLookup
	WebElement numDisplayed;
	
	//header
	@FindBy(xpath="//span[contains(text(),'Associate Initial Request for Tuition Reimbursemen')]")
	@CacheLookup
	WebElement associateHeader;
	
	//“Tuition Reimbursement Forms” header 
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement tuitionReimburseForm;
	
	//col 1
	@FindBy(xpath="//thead/tr[1]/th[1]")
	@CacheLookup
	WebElement col1;
	
	//case #1
	@FindBy(xpath="//tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement case1;
	
	//col 2
	@FindBy(xpath="//thead/tr[1]/th[2]")
	@CacheLookup
	WebElement col2;
	
	//Park associate user
	@FindBy(xpath="//tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement parkAssociateUserCol;
	
	//col 3
	@FindBy(xpath="//thead/tr[1]/th[3]")
	@CacheLookup
	WebElement col3;
	
	//8888
	@FindBy(xpath="//tbody/tr[1]/td[3]")
	@CacheLookup
	WebElement associateNum;
	
	//col 4
	@FindBy(xpath="//thead/tr[1]/th[4]")
	@CacheLookup
	WebElement col4;
	
	//ss customer service
	@FindBy(xpath="//tbody/tr[1]/td[4]")
	@CacheLookup
	WebElement custService;
	
	//col 5
	@FindBy(xpath="//thead/tr[1]/th[5]")
	@CacheLookup
	WebElement col5;
	
	//approved by HR
	@FindBy(xpath="//tbody/tr[1]/td[5]")
	@CacheLookup
	WebElement HR;
	
	//submitted
	@FindBy(xpath="//tbody/tr[1]/td[5]")
	@CacheLookup
	WebElement submitted;
	
	//col 6
	@FindBy(xpath="//thead/tr[1]/th[6]")
	@CacheLookup
	WebElement col6;
	
	//new date
	@FindBy(xpath="//tbody/tr[1]/td[6]")
	@CacheLookup
	WebElement oldDate;
	
	//last date
	@FindBy(xpath="//tbody/tr[1]/td[6]")
	@CacheLookup
	WebElement newDate;
	
	//Page slider
	@FindBy(xpath="//div[contains(@aria-label,'Pagination')]")
	@CacheLookup
	WebElement pageSlider;
	
	//Page 1 items
	@FindBy(xpath="//div[@class='pagination-counter OSInline' and @role='status']")
	@CacheLookup
	WebElement pageItems1;
	
	//Page 2
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement page2;
	
	//Page 2 items
	@FindBy(xpath="//div[@class='pagination-counter OSInline' and @role='status']")
	@CacheLookup
	WebElement pageItems2;
	
	//Request btn
	@FindBy(xpath="//body/div[@id='reactContainer']/div[@id='transitionContainer']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")
	@CacheLookup  ////div[@class='OSInline']//button[@class='btn btn-primary OSFillParent']
	WebElement reqBtn;
	
	//Initial Reimbursement Request header 
	@FindBy(xpath="//h1[contains(text(),'Initial Reimbursement Request')]")
	@CacheLookup
	WebElement initialReqForm;
	
	//Personal info header
	@FindBy(xpath="//span[contains(text(),'Personal Info')]")
	@CacheLookup
	WebElement personalInfoHeader;
	
	//Employee number field
	@FindBy(xpath="//span[contains(text(),'Employee Number')]")
	@CacheLookup
	WebElement empNumberField;
	
	//User Employee number
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	@CacheLookup
	WebElement userEmpNumberField;
	
	//Associate name field
	@FindBy(xpath="//div[contains(text(),'Associate Name')]")
	@CacheLookup
	WebElement associateNameField;
	
	//Associate name value
	@FindBy(xpath="//div[@class='item-text']//span[contains(text(),'Park Associate User')]")
	@CacheLookup
	WebElement associateNameValue;
	
	//Department name field
	@FindBy(xpath="//span[contains(text(),'Department')]")
	@CacheLookup
	WebElement departmentField;
	
	//Department value
	@FindBy(xpath="//span[contains(text(),'SS Customer Service')]|//span[contains(text(),'FS FS')]")
	@CacheLookup
	WebElement departmentValue;
	
	//Add comment header
	@FindBy(xpath="//span[contains(text(),'Add Comment')]")
	@CacheLookup
	WebElement addCmntHeader;
	
	//Placeholder text
	@FindBy(xpath="//textarea[@placeholder='Enter your comments here...']")
	@CacheLookup
	WebElement placeholderTxt;
	
	//Save btn
	@FindBy(xpath="//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement saveBtn;
	
	//Park user comment
	@FindBy(xpath="//span[contains(text(),'Park Associate User Comment')]")
	@CacheLookup
	WebElement parkComment;
	
	@FindBy(xpath="//span[contains(text(),'Test')]")
	@CacheLookup
	WebElement parkCommentTest;
	
	//new timeline
	@FindBy(xpath="//body/div[@id='reactContainer']/div[@id='transitionContainer']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement newTimeline;
	
	//Delete req
	@FindBy(xpath="//div[contains(text(),'Delete Request')]")
	@CacheLookup
	WebElement delReq;
	
	//“Initial Tuition Reimbursement Form Details” header 
	@FindBy(xpath="//span[contains(text(),'Initial Tuition Reimbursement Form Details')]")
	@CacheLookup
	WebElement initialTuitionReqForm;
	
	//Created btn
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement createBtn;
	
	//Case number
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/span[1]")
	@CacheLookup
	WebElement caseNum;
	
	//Text displayed
	@FindBy(xpath="//div[@class='text-align-center margin-top-s text-red']")
	@CacheLookup
	WebElement textDisplayed;
	
	//Tuition Assistance Policy
	@FindBy(xpath="//div[contains(text(),'Tuition Assistance Policy')]")
	@CacheLookup
	WebElement policyHeader;
	
	//Tuition assistance header
	@FindBy(xpath="//body/div[@id='reactContainer']/div[@id='transitionContainer']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement assistanceHeader;
	
	//Text displayed
	@FindBy(xpath="//div[contains(text(),'The purpose of this policy is to provide an opport')]")
	@CacheLookup
	WebElement assistanceText;
	
	//Eligibility header
	@FindBy(xpath="//div[contains(text(),'Eligibility')]")
	@CacheLookup
	WebElement eligibilityHeader;
	
	//Eligibility text
	@FindBy(xpath="//body/div[@id='reactContainer']/div[@id='transitionContainer']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]")
	@CacheLookup
	WebElement eligibilityText;
	
	//Termination header
	@FindBy(xpath="//div[contains(text(),'Termination of Employment:')]")
	@CacheLookup
	WebElement terminationHeader;
	
	//Text 1
	@FindBy(xpath="//div[contains(text(),'Additionally, upon termination, voluntary or invol')]")
	@CacheLookup
	WebElement terminationTxt1;
	
	//Text 2
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[5]")
	@CacheLookup
	WebElement terminationTxt2;
	
	//Text 3
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[6]")
	@CacheLookup
	WebElement terminationTxt3;
	
	//Text 4
	@FindBy(xpath="//span[contains(text(),'*Reimbursements will count towards the calendar ye')]")
	@CacheLookup
	WebElement terminationTxt4;
	
	//Time away from work
	@FindBy(xpath="//div[contains(text(),'Time away from work:')]")
	@CacheLookup
	WebElement timeAwayHeader;
	
	//Text
	@FindBy(xpath="//div[contains(text(),'Educational courses under this policy must be take')]")
	@CacheLookup
	WebElement timeAwayTxt;
	
	//Repayment header
	@FindBy(xpath="//div[contains(text(),'Repayment if terminated:')]")
	@CacheLookup
	WebElement repaymentHeader;
	
	//Text
	@FindBy(xpath="//div[contains(text(),'If you voluntarily terminate employment with Park ')]")
	@CacheLookup
	WebElement repaymentTxt;
	
	//Repayment header
	@FindBy(xpath="//div[contains(text(),'Repayment Amount:')]")
	@CacheLookup
	WebElement repaymentHeader2;
	
	//Text 2
	@FindBy(xpath="//div[contains(text(),'You will be responsible for paying Park back a pro')]")
	@CacheLookup
	WebElement repaymentTxt2;
	
	//col1
	@FindBy(xpath="//th[contains(text(),'Degree Type')]")
	@CacheLookup
	WebElement degreeCol;
	
	//col2
	@FindBy(xpath="//thead/tr[1]/th[2]")
	@CacheLookup
	WebElement employmentCol;
	
	//col3
	@FindBy(xpath="//thead/tr[1]/th[3]")
	@CacheLookup
	WebElement amtCol;
	
	//col4
	@FindBy(xpath="//thead/tr[1]/th[4]")
	@CacheLookup
	WebElement monthsCol;
	
	//col5
	@FindBy(xpath="//thead/tr[1]/th[5]")
	@CacheLookup
	WebElement notEmployedCol;
	
	//col6
	@FindBy(xpath="//thead/tr[1]/th[6]")
	@CacheLookup
	WebElement percentCol;
	
	//col7
	@FindBy(xpath="//thead/tr[1]/th[7]")
	@CacheLookup
	WebElement totalCol;
	
	//First row data
	@FindBy(xpath="//tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement associate;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement months;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]")
	@CacheLookup
	WebElement amount;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]")
	@CacheLookup
	WebElement number;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]")
	@CacheLookup
	WebElement number1;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]")
	@CacheLookup
	WebElement percent;
	
	@FindBy(xpath="//tbody/tr[1]/td[7]")
	@CacheLookup
	WebElement totalamt;
	
	//Second row data
	@FindBy(xpath="//tbody/tr[2]/td[1]")
	@CacheLookup
	WebElement masters;
	
	@FindBy(xpath="//tbody/tr[2]/td[2]")
	@CacheLookup
	WebElement monthsSec;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]")
	@CacheLookup
	WebElement amountSec;
	
	@FindBy(xpath="//tbody/tr[2]/td[4]")
	@CacheLookup
	WebElement numberSec;
	
	@FindBy(xpath="//tbody/tr[2]/td[5]")
	@CacheLookup
	WebElement number1Sec;
	
	@FindBy(xpath="//tbody/tr[2]/td[6]")
	@CacheLookup
	WebElement percentSec;
	
	@FindBy(xpath="//tbody/tr[2]/td[7]")
	@CacheLookup
	WebElement totalamtSec;
	
	//Text
	@FindBy(xpath="")
	@CacheLookup
	WebElement text;
	
	//Paragraph
	@FindBy(xpath="")
	@CacheLookup
	WebElement paragraph;
	
	//Instructions
	@FindBy(xpath="//div[contains(text(),'Instructions')]")
	@CacheLookup
	WebElement insHeader;
	
	//Instruction text
	@FindBy(xpath="//body/div[@id='reactContainer']/div[@id='transitionContainer']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement insText;
	
	//Associate Pre-Approval Information
	@FindBy(xpath="//span[contains(text(),'Associate Pre-Approval Information')]")
	@CacheLookup
	WebElement preapprovalHeader;
	
	//Institution (School/Facility Name) text
	@FindBy(xpath="//label[contains(text(),'Institution (School/Facility Name)')]")
	@CacheLookup
	WebElement institutionText;
	
	//Institution field
	@FindBy(xpath="//input[@id='Input_Institution']")
	@CacheLookup
	WebElement insField;
	
	//Location text
	@FindBy(xpath="//label[contains(text(),'Location (where the institution is located)')]")
	@CacheLookup
	WebElement locText;
	
	//Location field
	@FindBy(xpath="//input[@id='Input_Location']")
	@CacheLookup
	WebElement locField;
	
	//Program text
	@FindBy(xpath="//label[contains(text(),'Degree Program Name')]")
	@CacheLookup
	WebElement programText;
	
	//Program name field
	@FindBy(xpath="//input[@id='Input_DegreeProgramName']")
	@CacheLookup
	WebElement programField;
	
	//Major text
	@FindBy(xpath="//div[@class='margin-top-s ThemeGrid_Width6 ThemeGrid_MarginGutter']//label[contains(text(),'Degree Major')]")
	@CacheLookup
	WebElement majorText;
	
	//Degree major field
	@FindBy(xpath="//div[@class='margin-top-s ThemeGrid_Width6 ThemeGrid_MarginGutter']//input[@id='Input_DegreeMajor']")
	@CacheLookup
	WebElement majorField;
	
	//Decription text
	@FindBy(xpath="//div[@class='margin-top-s']//label[contains(text(),'Degree Program Description (include estimated comp')]")
	@CacheLookup
	WebElement descripText;
	
	//Program descrip field
	@FindBy(xpath="//div//textarea[@id='TextArea_DegreeProgramDescription']")
	@CacheLookup
	WebElement descripField;
	
	//Total cost text
	@FindBy(xpath="//div//label[@for='Input_CostDetails'][@class='mandatory OSFillParent']")
	@CacheLookup
	WebElement totalcostText;
	
	//Total cost field
	@FindBy(xpath="//input[@id='Input_CostDetails']")
	@CacheLookup
	WebElement totalcostField;
	
	//Career text
	@FindBy(xpath="//label[@for='TextArea_DegreeRelationPark']")
	@CacheLookup
	WebElement careerText;
	
	//Career plan field
	@FindBy(xpath="//textarea[@id='TextArea_DegreeRelationPark']")
	@CacheLookup
	WebElement careerField;
	
	//Link
	@FindBy(xpath="//div[@class='margin-top-base']//a[@href='javascript:void(0);']")
	@CacheLookup
	WebElement link;
	
	//Link text
	@FindBy(xpath="//div[contains(text(),'*Attach the Program Curriculum. (must list all cla')]")
	@CacheLookup
	WebElement linkText;
	
	//Text
	@FindBy(xpath="//body/div[@id='reactContainer']/div[@id='transitionContainer']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[16]")
	@CacheLookup
	WebElement Text;
	
	//Back btn
	@FindBy(xpath="//button[contains(text(),'Back')]")
	@CacheLookup
	WebElement backBtn;
	
	//Save and submit btn
	@FindBy(xpath="//body/div[@id='reactContainer']/div[@id='transitionContainer']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[17]/div[1]/button[2]")
	@CacheLookup
	WebElement submitBtn;
	
	//Attach link form
	@FindBy(xpath="//div[contains(text(),'Attach Supporting documentation (including curricu')]")
	@CacheLookup
	WebElement attachDoc;
	
	//Upload btn
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement uploadBtn;
	
	//Close btn
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
	@CacheLookup
	WebElement closeBtn;
	
	//File download btn
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]/i[1]")
	@CacheLookup
	WebElement downloadBtn;
	
	//Trashcan symbol
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[2]/i[1]")
	@CacheLookup
	WebElement trashBtn;
	
	//
	@FindBy(xpath="//span[contains(text(),'Tuition Assistance Repayment Agreement')]")
	@CacheLookup
	WebElement tuitionForm;
	
	@FindBy(xpath="//span[contains(text(),\"Park Industries' Reimbursement Plan\")]")
	@CacheLookup
	WebElement parkIndustForm;
	
	@FindBy(xpath="//div[@class='text-align-justify margin-top-m']")
	@CacheLookup
	WebElement formContent;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	@CacheLookup
	WebElement formCloseBtn;
	
	@FindBy(xpath="//div[contains(text(),'Accept & Submit')]")
	@CacheLookup
	WebElement acceptBtn;
	
	@FindBy(xpath="//span[@class='text-yellow-dark margin-top-xs']")
	@CacheLookup
	WebElement awaitingText;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement submittedTag;
	
	@FindBy(xpath="//span[contains(text(),'Status changed')]")
	@CacheLookup
	WebElement status;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement statusSubmitted;
	
	//Park Supervisor
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement associateForms;
	
	//Taskbox header
	@FindBy(xpath="//a[contains(text(),'Taskbox')]")
	@CacheLookup
	WebElement taskbox;
	
	//Click case #
	@FindBy(xpath="//thead/tr[1]/th[1]")
	@CacheLookup
	WebElement clickCase;
	
	//Submitted ITR
	@FindBy(xpath="//span[contains(text(),'Initial Tuition Reimbursement')]")
	@CacheLookup
	WebElement submittedInitial;
	
	//Approved btn
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement approve;
	
	//Reject btn
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[2]")
	@CacheLookup
	WebElement reject;
	
	//confirm approval
	@FindBy(xpath="//span[contains(text(),'Confirm Approval')]")
	@CacheLookup
	WebElement confirm;
	
	//add comment
	@FindBy(xpath="//span[contains(text(),'Add Comment (Optional)')]")
	@CacheLookup
	WebElement addComment;
	
	//approve btn
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement approveBtn;
	
	//cancel btn
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
	@CacheLookup
	WebElement cancel;
	
	//Approved by supervisor
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement approvedBy;
	
	//Status changed
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement statusChanged;
	
	//Approved tag
	@FindBy(xpath="//div[@class='tag tag-small border-radius-soft background-neutral-3 status-tag OSInline']//span[contains(text(),'Approved by Supervisor')]")
	@CacheLookup
	WebElement approvedByTag;
	
	//HR pickup
	@FindBy(xpath="//tbody/tr[1]/td[7]/button[1]")
	@CacheLookup ////td[@data-header='Assignment']//button[contains(text(), 'Pick Up')]
	WebElement pickup;
	
	//HR Tag
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement HRtag;
	
	//Approve btn
	@FindBy(xpath="//button[contains(text(),'Approve')]")
	@CacheLookup
	WebElement approveHR;
	
	//Reject btn
	@FindBy(xpath="//button[contains(text(),'Reject')]")
	@CacheLookup
	WebElement rejectHR;
	
	//Cancel btn
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	@CacheLookup
	WebElement cancelFormHR;
	
	//Approve btn
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement approveFormHR;
	
	//Approved by hr
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement approvedByHR;
	
	//Status
	@FindBy(xpath="//span[contains(text(),'Status changed by Human Resources User')]")
	@CacheLookup
	WebElement statusHR;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]")
	@CacheLookup
	WebElement statusApprovedByHR;
	
	@FindBy(xpath="//body/div[@id='reactContainer']/div[@id='transitionContainer']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement statusChangedHR;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement completed;
	
	@FindBy(xpath="//div//span[contains(text(),'Request closed')]")
	@CacheLookup
	WebElement reqClosed;
	
	public void clickTuitionRTab()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", tuitionTab);
	}
	
	public boolean intitalHeaderDisplayed()
	{
		return func.verifyElementDisplayedWithText(initialHeader, "Initial Reimbursement");
	}
	
	public boolean associatePortalHeaderDisplayed()
	{
		return func.verifyElementDisplayedWithText(associatePortalHeader, "Associate Forms Portal");
	}
	
	public void clickAssociateFormTab()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", associatePortalHeader);
	}
	
	public boolean parkAssociateUserDisplayed()
	{
		return parkAssociateUserHeader.isDisplayed();
	}
	
	public boolean finalHeaderDisplayed()
	{
		return func.verifyElementDisplayedWithText(finalHeader, "Final Reimbursement");
	}
	
	public boolean loginHeaderDisplayed()
	{
		return func.verifyElementDisplayedWithText(loginHeader, "Go to Sample Login");
	}
	
	public void clickSampleLogin()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", loginHeader);
	}
	
	public boolean sampleUserTextDisplayed()
	{
		return sampleLoginText.isDisplayed();
	}
	
	public boolean parkUserDisplayed()
	{
		return func.verifyElementDisplayedWithText(parkAssociateUser, "Park Associate User");
	}
	
	public void clickParkAssociateUser()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", clickParkAssociateUser);
	}
	
	public boolean signInPageDisplayed()
	{
		return signInPage.isDisplayed();
	}
	
	public boolean reqListHeaderDisplayed()
	{
		return reqList.isDisplayed();
	}
	
	public boolean searchBarDisplayed()
	{
		return searchBar.isDisplayed();
	}
	
	//Placeholder text
	
	public void enterText(String text)
	{
		searchBar.sendKeys(text);
	}
	
	//not display
	public boolean noItemsDisplayed()
	{
		return noItemsText.isDisplayed();
	}
	
	public void enterNum(String number)
	{
		searchBar.clear();
		searchBar.sendKeys(number);
	}
	
	//display
	public boolean numberDisplayed()
	{
		return numDisplayed.isDisplayed();
	}
	
	public void clear()
	{
		searchBar.clear();
	}
	
	public boolean associateHeaderDisplayed()
	{
		return associateHeader.isDisplayed();
	}
	
	public boolean tuitionReimburseFormDisplayed()
	{
		return tuitionReimburseForm.isDisplayed();
	}
	
	public boolean locateColumnHeaders()
	{
		if(col1.isDisplayed() && col2.isDisplayed() && col3.isDisplayed() && col4.isDisplayed() && col5.isDisplayed() && col6.isDisplayed())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void clickCol1()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", col1);
		
//		col1.click();
	}
	
	public boolean case1Displayed()
	{
		return func.verifyElementDisplayedWithText(case1, "1");
	}
	
	public void clickCol2()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", col2);
	}
	
	public boolean parkAssociateUserColDisplayed()
	{
		return func.verifyElementDisplayedWithText(parkAssociateUserCol, "Park Associate User");
	}
	
	public void clickCol3()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", col3);
	}
	
	public boolean associateNumDisplayed()
	{
		return func.verifyElementDisplayedWithText(associateNum, "8888888");
	}
	
	public void clickCol4()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", col4);
	}
	
	public boolean custServiceDisplayed()
	{
		return func.verifyElementDisplayedWithText(custService, "SS Customer Service");
	}
	
	public void clickCol5()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", col5);
	}
	
	public boolean HRDisplayed()
	{
		return func.verifyElementDisplayedWithText(HR, "Approved by HR");
	}
	
	public boolean submittedDisplayed()
	{
		return func.verifyElementDisplayedWithText(submitted, "Submitted");
	}
	
	public void clickCol6()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", col6);
	}
	
	public boolean oldDateDisplayed()
	{
		return func.verifyElementDisplayedWithText(oldDate, "05/19/2021");
	}
	
	public boolean newDateDisplayed()
	{
		return func.verifyElementDisplayedWithText(newDate, "09/09/2021");
	}
	
	public boolean pagesliderDisplayed()
	{
		return pageSlider.isDisplayed();
	}
	
	public boolean pageItems1Displayed()
	{
		return pageItems1.isDisplayed();
	}
	
	public void clickPage2()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", page2);
//		page2.click();
	}
	
	public boolean pageItems2Displayed()
	{
		return pageItems2.isDisplayed();
	}
	
	public boolean requestBtnDisplayed()
	{
		return reqBtn.isDisplayed();
	}
	
	public String btnReqColour()
	{
		String bgColour = Color.fromString(reqBtn.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	public void clickReqBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", reqBtn);
	}
	
	public boolean initialReqHeaderDisplayed()
	{
		return func.verifyElementDisplayedWithText(initialReqForm, "Initial Reimbursement Request");
//		return initialReqForm.isDisplayed();
	}
	
	public boolean personalInfoHeaderDisplayed()
	{
		return personalInfoHeader.isDisplayed();
	}
	
	public boolean empNumberFieldDisplayed()
	{
		return empNumberField.isDisplayed();
	}
	
	public boolean userEmpNumberDisplayed()
	{
//		return func.verifyElementDisplayedWithText(userEmpNumberField, "8888888");
		return userEmpNumberField.isDisplayed();
	}
	
	public boolean associateNameDisplayed()
	{
		return associateNameField.isDisplayed();
	}
	
	public boolean associateNameValueDisplayed()
	{
		return associateNameValue.isDisplayed();
	}
	
	public boolean departmentFieldDisplayed()
	{
		return departmentField.isDisplayed();
	}
	
	public boolean departmentValueDisplayed()
	{
		return departmentValue.isDisplayed();
	}
	
	public boolean addCommentHeaderDisplayed()
	{
//		return addCmntHeader.isDisplayed();
		return func.verifyElementDisplayedWithText(addCmntHeader, "Add Comment");
	}
	
	public boolean placeholderTxtDisplayed()
	{
		return placeholderTxt.isDisplayed();
	}
	
	public boolean saveBtnDisplayed()
	{
		return func.verifyElementDisplayedWithText(saveBtn, "Save");
	}
	
	public String btnSaveColour()
	{
		String bgColour = Color.fromString(saveBtn.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	public void setComment(String Comment) 
	{
		placeholderTxt.sendKeys(Comment);	
	}
	
	public void clickSaveBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", saveBtn);
	}
	
	public boolean newTimelineDisplayed()
	{
		return newTimeline.isDisplayed();
	} 
	
	public boolean parkCommentDisplayed()
	{
		return parkComment.isDisplayed();
	}
	
	public boolean parkCommentTestDisplayed()
	{
		return parkCommentTest.isDisplayed();
	}
	
	public boolean initialTuitionDisplayed()
	{
//		return initialTuitionReqForm.isDisplayed();
		return func.verifyElementDisplayedWithText(initialTuitionReqForm, "Initial Tuition Reimbursement Form Details");
	}
	
	public boolean createBtnDisplayed()
	{
		return func.verifyElementDisplayedWithText(createBtn, "Created");
	}
	
	public String btnCreateColour()
	{
		String bgColour = Color.fromString(createBtn.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	public boolean caseNumDisplayed()
	{
		return caseNum.isDisplayed();
	}
	
	public boolean delReqDisplayed()
	{
//		return delReq.
		return func.verifyElementIsClickable(delReq, ldriver);
	}
	
	public String btnDeleteColour()
	{
		String bgColour = Color.fromString(delReq.getCssValue("text-error")).asHex();
		return bgColour;
	}
	
	public void clickDelReqBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", delReq);
	}
	
	public boolean textDisplayed()
	{
		return textDisplayed.isDisplayed();
	}
	
	public String textColour()
	{
		String bgColour = Color.fromString(textDisplayed.getCssValue("color")).asHex();
		return bgColour;
	}
	
	public boolean policyHeaderDisplayed()
	{
		return policyHeader.isDisplayed();
	}
	
	public boolean assistanceHeaderDisplayed()
	{
		return assistanceHeader.isDisplayed();
	}
	
	public boolean assistanceTextDisplayed()
	{
		return assistanceText.isDisplayed();
	}
	
	public boolean eligibilityHeaderDisplayed()
	{
		return eligibilityHeader.isDisplayed();
	}
	
	public boolean eligibilityTextDisplayed()
	{
		return eligibilityText.isDisplayed();
	}
	
	public boolean terminationHeaderDisplayed()
	{
		return terminationHeader.isDisplayed();
	}
	
	public boolean terminationTxt1Displayed()
	{
		return terminationTxt1.isDisplayed();
	}
	
	public boolean terminationTxt2Displayed()
	{
		return terminationTxt2.isDisplayed();
	}
	
	public boolean terminationTxt3Displayed()
	{
		return terminationTxt3.isDisplayed();
	}
	
	public boolean terminationTxt4Displayed()
	{
		return terminationTxt4.isDisplayed();
	}
	
	public String textItalics()
	{
		String textItalics = ldriver.findElement(By.xpath("//span[contains(text(),'*Reimbursements will count towards the calendar ye')]")).getCssValue("font-style");
		return textItalics;
	}

	public boolean timeAwayHeaderDisplayed()
	{
		return timeAwayHeader.isDisplayed();
	}
	
	public boolean timeAwayTxtrDisplayed()
	{
		return timeAwayTxt.isDisplayed();
	}
	
	public boolean repaymentHeaderDisplayed()
	{
		return repaymentHeader.isDisplayed();
	}
	
	public boolean repaymentTxtDisplayed()
	{
		return repaymentTxt.isDisplayed();
	}
	
	public boolean repaymentHeader2Displayed()
	{
		return repaymentHeader2.isDisplayed();
	}
	
	public boolean repaymentTxt2Displayed()
	{
		return repaymentTxt2.isDisplayed();
	}
	
	public boolean locateCol()
	{
		if(degreeCol.isDisplayed() && employmentCol.isDisplayed() && amtCol.isDisplayed() && monthsCol.isDisplayed() && notEmployedCol.isDisplayed() && percentCol.isDisplayed() && totalCol.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean associateTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(associate, "Associate and Bachelor");
	}
	
	public boolean monthsTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(months, "24 months");
	}
	
	public boolean amountTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(amount, "$5,250.00");
	}
	
	public boolean numberTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(number, "10");
	}
	
	public boolean number1TxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(number1, "14");
	}
	
	public boolean percentTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(percent, "58%");
	}
	
	public boolean totalTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(totalamt, "$3,045.00");
	}
	
	public boolean mastersTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(masters, "Masters");
	}
	
	public boolean monthsSecTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(monthsSec, "36 months");
	}
	
	public boolean amountSecTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(amountSec, "$5,250.00");
	}
	
	public boolean numberSecTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(numberSec, "10");
	}
	
	public boolean number1SecTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(number1Sec, "26");
	}
	
	public boolean percentSecTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(percentSec, "72%");
	}
	
	public boolean totalSecTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(totalamtSec, "$3,780.00");
	}
	
	public boolean textisDisplayed()
	{
		return text.isDisplayed();
	}
	
	public boolean paragraphDisplayed()
	{
		return paragraph.isDisplayed();
	}
	
	public boolean insHeaderDisplayed()
	{
		return insHeader.isDisplayed();
	}
	
	public boolean insTextDisplayed()
	{
		return insText.isDisplayed();
	}
	
	public boolean preapprovalHeaderDisplayed()
	{
		return func.verifyElementDisplayedWithText(preapprovalHeader, "Associate Pre-Approval Information");
//		return preapprovalHeader.isDisplayed();
	}
	
	public boolean institutionTextDisplayed()
	{
		return func.verifyElementDisplayedWithText(institutionText, "Institution (School/Facility Name)");
//		return institutionText.isDisplayed();
	}
	
	public boolean insFieldDisplayed()
	{
		return insField.isDisplayed();
	}
	
	public boolean locTextDisplayed()
	{
		return func.verifyElementDisplayedWithText(locText, "Location (where the institution is located)");
//		return locField.isDisplayed();
	}
	
	public boolean locFieldDisplayed()
	{
		return locField.isDisplayed();
	}
	
	public boolean programTextDisplayed()
	{
		return func.verifyElementDisplayedWithText(programText, "Degree Program Name");
//		return programText.isDisplayed();
	}
	
	public boolean programFieldDisplayed()
	{
		return programField.isDisplayed();
	}
	
	public boolean majorTextDisplayed()
	{
		return func.verifyElementDisplayedWithText(majorText, "Degree Major");
//		return majorText.isDisplayed();
	}
	
	public boolean majorFieldDisplayed()
	{
		return majorField.isDisplayed();
	}
	
	public boolean descripTextDisplayed()
	{
		return func.verifyElementDisplayedWithText(descripText, "Degree Program Description (include estimate completion date)");
//		return descripText.isDisplayed();
	}
	
	public boolean descripFieldDisplayed()
	{
		return descripField.isDisplayed();
	}
	
	public boolean totalcostTextDisplayed()
	{
		return func.verifyElementDisplayedWithText(totalcostText, "Provide approximate total cost details (books, lab fees, etc.)");
//		return totalcostText.isDisplayed();
	}
	
	public boolean totalcostFieldDisplayed()
	{
		return totalcostField.isDisplayed();
	}
	
	public boolean careerTextDisplayed()
	{
		return func.verifyElementDisplayedWithText(careerText, "How does degree relate to your career plan at Park?");
//		return careerText.isDisplayed();
	}
	
	public boolean careerFieldDisplayed()
	{
		return careerField.isDisplayed();
	}
	
	public boolean linkDisplayed()
	{
		return link.isDisplayed();
	}
	
	public boolean linkTextDisplayed()
	{
		return func.verifyElementDisplayedWithText(linkText, "*Attach the Program Curriculum. (must list all classes/courses required");
//		return linkText.isDisplayed();
	}
	
	public boolean remainingAmtDisplayed()
	{
		return Text.isDisplayed();
	}
	
	public boolean backBtnDisplayed()
	{
		return func.verifyElementDisplayedWithText(backBtn, "Back");
	}
	
	public void clickBackBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", backBtn);
	}
	
	public void clickAttachBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", link);
	}
	
	public boolean attachDocFormDisplayed()
	{
		return attachDoc.isDisplayed();
	}
	
	public boolean uploadBtnDisplayed()
	{
//		return func.verifyElementDisplayedWithText(uploadBtn, "Upload File");
		return uploadBtn.isDisplayed();
	}
	
	public boolean closeBtnDisplayed()
	{
		return func.verifyElementDisplayedWithText(closeBtn, "Close");
	}
	
	public void clickCloseBtn()
	{
		for(int i=0; i<=2;i++){
			  try{
			     ldriver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
			     break;
			  }
			  catch(StaleElementReferenceException e){
				  System.out.println(e.getMessage());
			  }
			  
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", closeBtn);
		}
	}
	
	public void clickUploadBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", uploadBtn);
	}
	
	public boolean downloadBtnDisplayed()
	{
//		return func.verifyElementIsClickable(downloadBtn, ldriver);
		return downloadBtn.isDisplayed();
	}
	
	public boolean trashBtnDisplayed()
	{
		return trashBtn.isDisplayed();
	}
	
	public void clickDownloadBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", downloadBtn);
	}
	
	public void clickTrashBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", trashBtn);
	}
	
	//Alert
	
	
	public void setUni(String uni)
	{
		insField.sendKeys(uni);
	}
	
	public void setLoc(String Loc)
	{
		locField.sendKeys(Loc);
	}
	
	public void setDegree(String degree)
	{
		programField.sendKeys(degree);
	}
	
	public void setMajor(String Major)
	{
		majorField.sendKeys(Major);
	}
	
	public void setDescrip(String description)
	{
		descripField.sendKeys(description);
	}
	
	public void setCost(String cost)
	{
		totalcostField.sendKeys(cost);
	}
	
	public void setCareer(String Career)
	{
		careerField.sendKeys(Career);
	}
	
	public boolean submitBtnDisplayed()
	{
		return func.verifyElementDisplayedWithText(submitBtn, "Save & Submit");
	}
	
	public String submitColour()
	{
		String bgColour = Color.fromString(submitBtn.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	public void clickSubmitBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", submitBtn);
	}
	
	public boolean tuitionFormDisplayed()
	{
		return tuitionForm.isDisplayed();
	}
	
	public boolean PIFormDisplayed()
	{
		return parkIndustForm.isDisplayed();
	}
	
	public boolean formContentDisplayed()
	{
		return formContent.isDisplayed();
	}
	
	public boolean closeBtnFormDisplayed()
	{
		return func.verifyElementDisplayedWithText(formCloseBtn, "Close");
	}
	
	public void clickCloseFormBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", formCloseBtn);
	}
	
	public boolean acceptSubmitDisplayed()
	{
		return func.verifyElementDisplayedWithText(acceptBtn, "Accept & Submit");
//		return acceptBtn.isDisplayed();
	}
	
	public void clickAcceptFormBtn()
	{
		for(int i=0; i<=2;i++){
			  try{
			     ldriver.findElement(By.xpath("//div[contains(text(),'Accept & Submit')]")).click();
			     break;
			  }
			  catch(StaleElementReferenceException e){
				  System.out.println(e.getMessage());
			  }
//		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", acceptBtn);
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", acceptBtn);
		}
	}
	
	public String acceptbtnColour()
	{
		String bgColour = Color.fromString(acceptBtn.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	public boolean awaitingTextDisplayed()
	{
		return awaitingText.isDisplayed();
	}
	
	public boolean submittedTagDisplayed()
	{
		return func.verifyElementDisplayedWithText(submittedTag, "Submitted");
	}
	
	public boolean statustDisplayed()
	{
		return status.isDisplayed();
	}
	
	public boolean statusSubmitDisplayed()
	{
		return func.verifyElementDisplayedWithText(statusSubmitted, "Submitted");
	}
	
	public boolean associateFormsDisplayed()
	{
		return func.verifyElementDisplayedWithText(associateForms, "Associate Forms Portal");
	}
	
	public boolean taskboxDisplayed()
	{
		return func.verifyElementDisplayedWithText(taskbox, "Taskbox");
	}
	
	public void clickCase()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", clickCase);
	}
	
	public void clickSubmittedInitialLink()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", submittedInitial);
	}
	
	public boolean approveBtnDisplayed()
	{
		return func.verifyElementDisplayedWithText(approve, "Approve");
//		return approve.isDisplayed();
	}
	
	public String approvebtnColour()
	{
		String bgColour = Color.fromString(approve.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	public void clickApproveBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", approve);
	}
	
	public boolean rejectBtnDisplayed()
	{
		return func.verifyElementDisplayedWithText(reject, "Reject");
//		return reject.isDisplayed();
	}
	
	public String rejectbtnColour()
	{
		String bgColour = Color.fromString(reject.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	public boolean confirmDisplayed()
	{
		return func.verifyElementDisplayedWithText(confirm, "Confirm Approval");
	}
	
	public boolean commentDisplayed()
	{
		return func.verifyElementDisplayedWithText(addComment, "Add Comment (Optional)");
	}
	
	public boolean approveBtn1Displayed()
	{
		return func.verifyElementDisplayedWithText(approveBtn, "Approve");
	}
	
	public void clickApproveBtn1()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", approveBtn);
	}
	
	public boolean cancelBtn1Displayed()
	{
		return func.verifyElementDisplayedWithText(cancel, "Cancel");
	}
	
	public boolean approvedByDisplayed()
	{
		return approvedBy.isDisplayed();
//		return func.verifyElementDisplayedWithText(approvedBy, "Approved by Supervisor");
	}
	
	public boolean statusChangedDisplayed()
	{
		return statusChanged.isDisplayed();
	}
	
	public boolean approvedByTagDisplayed()
	{
		return func.verifyElementDisplayedWithText(approvedByTag, "Approved by Supervisor");
	}
	
	public void clickPickup()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", pickup);
	}
	
	public boolean HRTagDisplayed()
	{
		return func.verifyElementDisplayedWithText(HRtag, "HR Review");
	}
	
	public boolean approveHRDisplayed()
	{
		return func.verifyElementDisplayedWithText(approveHR, "Approve");
	}
	
	public String approveHRbtnColour()
	{
		String bgColour = Color.fromString(approveHR.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	public boolean rejectHRDisplayed()
	{
		return func.verifyElementDisplayedWithText(rejectHR, "Reject");
	}
	
	public String rejectHRbtnColour()
	{
		String bgColour = Color.fromString(rejectHR.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	public void clickApproveHR()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", approveHR);
	}
	
	public boolean cancelFormHRDisplayed()
	{
		return func.verifyElementDisplayedWithText(cancelFormHR, "Cancel");
	}
	
	public boolean approveFormHRDisplayed()
	{
		return func.verifyElementDisplayedWithText(approveFormHR, "Approve");
	}
	
	public void clickApproveFormHR()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", approveFormHR);
	}
	
	public boolean approvedByHRDisplayed()
	{
		return func.verifyElementDisplayedWithText(approvedByHR, "Approved By HR");
	}
	
	public boolean statusHRDisplayed()
	{
		return statusHR.isDisplayed();
	}
	
	public boolean statusApprovedByHRDisplayed()
	{
		return func.verifyElementDisplayedWithText(statusApprovedByHR, "Approved By HR");
	}
	
	public boolean statusChangedHRDisplayed()
	{
		return statusChangedHR.isDisplayed();
	}
	
	public boolean completedDisplayed()
	{
		return func.verifyElementDisplayedWithText(completed, "Completed");
	}
	
	public boolean reqClosedDisplayed()
	{
		return reqClosed.isDisplayed();
	}
	
}

