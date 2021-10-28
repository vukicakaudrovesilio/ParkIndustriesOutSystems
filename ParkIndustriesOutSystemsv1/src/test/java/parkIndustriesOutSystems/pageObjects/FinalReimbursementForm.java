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

import parkIndustriesOutSystems.common.WebElementFunctions;

public class FinalReimbursementForm {
	
	WebDriver ldriver;
	WebElementFunctions func = new WebElementFunctions();
	
	public FinalReimbursementForm(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Park Associate User Link Button
	@FindBy(xpath="//span[@class='OSFillParent'][contains(.,'Park Associate User')]")
	@CacheLookup
	WebElement lbtnParkAssociateUser;
	
	//Initial tuition reimbursement form link with Completed Status
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[7]/td[2]/a[1]/span[1]")
	@CacheLookup
	WebElement initialFormLink;
	
	//Initial Tuition Reimbursement Form
	@FindBy(xpath="//span[contains(text(),'Initial Tuition Reimbursement Form Details')]")
	@CacheLookup
	WebElement initialReimbForm;
	
	//Final tuition reimbursement form header
	@FindBy(xpath="//span[contains(text(),'Final Tuition Reimbursement Requests')]")
	@CacheLookup
	WebElement finalTuitionHeader;
	
	//Create Final Reimbursement Request button
	@FindBy(xpath="//button[@class='btn btn-primary margin-top-s OSFillParent']")
	@CacheLookup
	WebElement btnCreateFinal;
	
	//Personal Info header
	@FindBy(xpath="//span[contains(text(),'Personal Info')]")
	@CacheLookup
	WebElement prsonalInfoHeader;
	
	//Employee Number text
	@FindBy(xpath="//span[contains(text(),'Employee Number')]")
	@CacheLookup
	WebElement employeeNumbTxt;
	
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
	
	//Add comment text field
	@FindBy(xpath="//textarea[@id='TextArea_CommentBoxText']")
	@CacheLookup
	WebElement addCommentTxtField;
	
	//new timeline
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement newTimeline;
	
	//Final Reimbursement Request header
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h1[1]")
	@CacheLookup
	WebElement finalReimbReqHeader;
	
	//Go To Initial Reimbursement Request button
	@FindBy(xpath="//button[contains(text(),'Go To Initial Reimbursement Request')]")
	@CacheLookup
	WebElement goInitialReimbReeBtn;
	
	//Create Tag
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement tagCreated;
	
	//Case Number
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/span[1]")
	@CacheLookup
	WebElement caseNumber;
	
	//Delete request link
	@FindBy(xpath="//div[contains(text(),'Delete Request')]")
	@CacheLookup
	WebElement linkDeleteRequest;

	
	//Park Associate User's Requests header form
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement parkAssUserReqForm;
	
	//Final Reimbursement Request form
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[1]")
	@CacheLookup
	WebElement finalReimbReqForm;
	
	//Back Button at the bottom of the page
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[12]/button[1]")
	@CacheLookup
	WebElement btnBack;
	
	//Tuition Assistance Policy
		@FindBy(xpath="//div[contains(text(),'Tuition Assistance Policy')]")
		@CacheLookup
		WebElement policyHeader;
		
		//Tuition assistance header
		@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]")
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
		@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]")
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
		@FindBy(xpath="//body/div[@id='reactContainer']/div[@id='transitionContainer']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[5]")
		@CacheLookup
		WebElement terminationTxt2;
		
		//Text 3
		@FindBy(xpath="//body/div[@id='reactContainer']/div[@id='transitionContainer']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[6]")
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
	
	//Repayment Amount sentence **These numbers ..............
	@FindBy(xpath="//*[@id=\"$b16\"]/div[11]/text()[1]")
	@CacheLookup
	WebElement repaymntAmount;
	
	//Repayment Amount sentence **For example,if you received..............
	@FindBy(xpath="//*[@id=\"$b16\"]/div[11]/text()[2]")
	@CacheLookup
	WebElement repaymntAmountSentence;
	
	//All final reimbursement requests must be submitted......... sentence
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/span[1]")
	@CacheLookup
	WebElement redNoteAllFinalReimbRequests;
	
	//Please note: if you plan.......... sentence
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/span[3]")
	@CacheLookup
	WebElement redNotePlsNote;
	
	//Institution text 
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[6]/span[1]")
	@CacheLookup
	WebElement textInstitution;
	
	//University of America text
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/span[1]")
	@CacheLookup
	WebElement textUniAmerica;
	
	//Add Reimbursement Item Button
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/button[1]")
	@CacheLookup
	WebElement addReimbrsmntItemBtn;
	
	//New item header
	@FindBy(xpath="//div[contains(text(),'New Item')]")
	@CacheLookup
	WebElement headerNewItem;

	//Reimbursement Type text
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/span[1]")
	@CacheLookup
	WebElement txtReimbrsmntType;
	
	//Drop down
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement reimbursementDD;
	
	@FindBy(xpath="//select[@id='Dropdown1']/option[1]")
	@CacheLookup
	WebElement option1;
	
	@FindBy(xpath="//select[@id='Dropdown1']/option[2]")
	@CacheLookup
	WebElement option2;
	
	@FindBy(xpath="//select[@id='Dropdown1']/option[3]")
	@CacheLookup
	WebElement option3;
	
	@FindBy(xpath="//select[@id='Dropdown1']/option[4]")
	@CacheLookup
	WebElement option4;
	
	@FindBy(xpath="//select[@id='Dropdown1']/option[5]")
	@CacheLookup
	WebElement option5;
	
	//Actual Cost text
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/label[1]/span[1]")
	@CacheLookup
	WebElement txtActualCost;
	
	//Actual Cost field
	@FindBy(xpath="//input[@id='Input_ActualCosts']")
	@CacheLookup
	WebElement fieldActualCost;
	
	//Description text
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/label[1]")
	@CacheLookup
	WebElement textDescription;
	
	//Description field
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/span[1]/textarea[1]")
	@CacheLookup
	WebElement fieldDescription;
	
	//Reimbursement Amount text
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement txtReimbrsmntAmnt;
	
	//Attach supporting documentation text
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement txtAttachSprtngDoc;
	
	//Upload file button
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement btnUploadFile;
	
	//Save and close button
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/button[2]")
	@CacheLookup
	WebElement btnSaveClose;
	
	//File download button
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]/i[1]")
	@CacheLookup
	WebElement btnFileDownload;
	
	//Trashcan symbol
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[2]/i[1]")
	@CacheLookup
	WebElement trashcanSymbol;
	
	//Item Type text
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement txtItemType;
	
	//Other text underneath item type
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	@CacheLookup
	WebElement txtOther;
	
	//Description text
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
	@CacheLookup
	WebElement txtDesc;
	
	//Test text under description
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")
	@CacheLookup
	WebElement txtTest;
	
	//Actual Costs text
	@FindBy(xpath="//div[@class='text-align-left']//span[contains(text(), 'Actual Costs')]")
	@CacheLookup
	WebElement txtActualCosts;
	
	//Amount under actual costs
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/span[1]")
	@CacheLookup
	WebElement amntActualCost;
	
	//Approved Amount text
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement txtApprovedAmount;
	
	//Amount under approved amount
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]")
	@CacheLookup
	WebElement amntApprvedAmount;
	
	//Total Actual Costs text
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[8]/span[1]")
	@CacheLookup
	WebElement txtTotalActualCosts;
	
	//Edit Pen Icon
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement editPenIcon;
	
	//Trash Can Icon two
	@FindBy(xpath="//body/div[@id='reactContainer']/div[@id='transitionContainer']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement trashCanIconTwo;
	
	//create btn
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement createFinalBtn;
	
	@FindBy(xpath="//span[contains(text(),'Associate Final Request for Tuition Reimbursement')]")
	@CacheLookup
	WebElement associateFinal;
	
	@FindBy(xpath="//a[contains(text(),'Initial Reimbursement')]")
	@CacheLookup
	WebElement initialReimbursement;
	
	@FindBy(xpath="//span[contains(text(),'Associate Initial Request for Tuition Reimbursemen')]")
	@CacheLookup
	WebElement associateInitial;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/span[1]")
	@CacheLookup
	WebElement compStatus;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement editItem;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[10]/span[1]")
	@CacheLookup
	WebElement remainingAmt;
	
	@FindBy(xpath="//button[contains(text(),'Save & Submit')]")
	@CacheLookup
	WebElement saveSubmit;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement submittedTag;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement submittedStatus;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement submittedTxt;
	
	//Click Park Associate User Link Button
	public void clickParkAssociateUser()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnParkAssociateUser);
	}

	//Click Park Initial Reimbursement Form link with status completed
	
	public void clickInitialReimbLink()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", initialFormLink);
	}
	
	public void clickInitialReimbursement()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", initialReimbursement);
	}
	
	//Confirm initial tuition reimbursement form is displayed
	public boolean verifyHeaderInitialReimb()
	{
		return func.verifyElementDisplayedWithText(initialReimbForm, "Initial Reimbursement Request");
	}
	
	//Confirm Final Tuition Reimbursement Requests text is displayed
	public boolean verifyTxtFinalTuitReimb()
	{
		return func.verifyElementDisplayedWithText(finalTuitionHeader, "Final Tuition Reimbursement Requests");
	}

	//Confirm Create Final Reimbursement Requests button is displayed
	public boolean verifyBtnCreateFinalTuitReimb()
	{
		return func.verifyElementDisplayedWithText(btnCreateFinal, "Create Final Reimbursement Request");
	}

	//Create Final Reimbursement Request Button Background Color
	public String btnCreateFinalBgColor()
	{
		String bgColour = Color.fromString(btnCreateFinal.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Confirm Personal Info Header is displayed
	public boolean verifyPrsnlInfoHeader()
	{
		return func.verifyElementDisplayedWithText(prsonalInfoHeader, "Personal Info");
	}
	
	//Confirm Employee Number Text is displayed
	public boolean verifyTxtEmpNumb()
	{
		return func.verifyElementDisplayedWithText(employeeNumbTxt, "Employee Number");
	}
	
	//Confirm 8888888 as employee number is displayed
	public boolean verifyEmpNumbField()
	{
		return func.verifyElementDisplayedWithText(userEmpNumberField, "8888888");
	}
	
	//Confirm Associate Name text is displayed
	public boolean verifyTxtAssoName()
	{
		return func.verifyElementDisplayedWithText(associateNameField, "Associate Name");
	}
	
	//Confirm Park Associate User text is displayed
	public boolean verifyTxtParkAssoUsr()
	{
		return func.verifyElementDisplayedWithText(associateNameValue, "Park Associate User");
	}
	
	//Confirm Department text is displayed
	public boolean verifyTxtDeprtmnt()
	{
		return func.verifyElementDisplayedWithText(departmentField, "Department");
	}
	
	//Confirm SS Customer Service FS FS text is displayed
	public boolean verifyTxtSrvceFS()
	{
		return func.verifyElementDisplayedWithText(departmentValue, "SS Customer Service FS FS");
	}
	
	//Confirm Add Comment Header is displayed
	public boolean verifyAddCommentHeader()
	{
		return func.verifyElementDisplayedWithText(addCmntHeader, "Add Comment");
	}
	
	public boolean placeholderTxtDisplayed()
	{
		return placeholderTxt.isDisplayed();
	}
	
	//Confirm Add Save Button is displayed
	public boolean verifyBtnSave()
	{
		return func.verifyElementDisplayedWithText(saveBtn, "Save");
	}
	
	//Create Final Reimbursement Request Button Background Color
	public String btnBckgrndSave()
	{
		String bgColour = Color.fromString(saveBtn.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Confirm add comment text field is displayed
	public boolean addCommentField()
	{
		return addCommentTxtField.isDisplayed();
	}
	
	public void setComment(String comment)
	{
		addCommentTxtField.sendKeys(comment);
	}
	
	public void clickSaveBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", saveBtn);
	}
	
	//Confirm timeline update is displayed
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
	
	//Confirm Final Reimbursement Request header is displayed
	public boolean verifyHeaderFinalReimb()
	{
		return func.verifyElementDisplayedWithText(finalReimbReqHeader, "Final Reimbursement Request");
	}
	
	//Confirm Go To Initial Reimbursement Request Button is displayed
	public boolean verifyBtnInitialReimbReq()
	{
		return func.verifyElementDisplayedWithText(goInitialReimbReeBtn, "Go To Initial Reimbursement Request");
	}
	
	//Confirm Created Tag is displayed
	public boolean verifyCreatedTag()
	{
		return func.verifyElementDisplayedWithText(tagCreated, "Created");
	}
	
	//Created Tag Button Background Color
	public String btnCreatedTag()
	{
		String bgColour = Color.fromString(tagCreated.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Confirm Case Number Text displayed
	public boolean verifyCaseNumberTxt()
	{
		return caseNumber.isDisplayed();
//		return func.verifyElementDisplayedWithText(caseNumber, "Case #");
	}
	
	//Confirm Delete Request Link is displayed
	public boolean verifyDeleteReqLink()
	{
		return func.verifyElementDisplayedWithText(linkDeleteRequest, "Delete Request");
	}
	
	//Delete Request Link Color
	public String linkDeleteReq()
	{
		String bgColour = Color.fromString(linkDeleteRequest.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Click Delete Request
	public void clickDeleteRequest()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", linkDeleteRequest);
	}
	
	//Confirm Park Associate User's Requests header displayed
	public boolean verifyParkAssUserReqHeader()
	{
		return func.verifyElementDisplayedWithText(parkAssUserReqForm, "Park Associate User's Requests");
	}
	
	//Click Final Tuition Reimbursement Request  Button
	public void clickFinalTuitionReimbReqBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", finalReimbReqForm);
	}
	
	//Click Back  Button
	public void clickBackBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver; //when testing, it should just verify by clciking. If it cannot click, then btn is not present
		js.executeScript("arguments[0].click()", btnBack);
	}
	
	public boolean verifyAssociateFinalHeader()
	{
		return func.verifyElementDisplayedWithText(associateFinal, "Associate Final Request for Tuition Reimbursement");
	}
	
	public boolean verifyAssociateInitialHeader()
	{
		return func.verifyElementDisplayedWithText(associateInitial, "Associate Initial Request for Tuition Reimbursement");
	}
	
	public void clickCompStatus()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", compStatus);
	}
	
	//Confirm "**These numbers are hypothetical to show an example of what this may look like for an associate that may owe Park." text is displayed
	public boolean verifyTheseNumbersSentence()
	{
		return repaymntAmount.isDisplayed();
//		return func.verifyElementDisplayedWithText(repaymntAmount, "**These numbers are hypothetical to show an example of what this may look like for an associate that may owe Park.");
	}

	//Confirm For example, if you received $5,250............sentence is displayed 
	public boolean verifyForExampleSentence()
	{
		return repaymntAmountSentence.isDisplayed();
//		return func.verifyElementDisplayedWithText(repaymntAmountSentence, "For example, if you received $5,250 for educational courses towards a Bachelor’s degree and work only nine months after completion of the course, you will refund Park 63% of the $5,250 or $3,307.50 (15 months not employed divided by 24 equals 63%).");
	}
	
	//Confirm All final reimbursement requests must be submitted..........sentence is displayed
	public boolean verifyAllFinalReimbrmntReqSentnce()
	{
		return redNoteAllFinalReimbRequests.isDisplayed();
	}
	
	//All final........ sentence color
	public String sentenceFinalColor()
	{
		String bgColour = Color.fromString(redNoteAllFinalReimbRequests.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Confirm Please note: if you plan.............sentence is displayed
	public boolean verifyPleaseNoteSentence()
	{
		return redNotePlsNote.isDisplayed();
	}
	
	//**Please note sentence color
	public String sentenceNoteColor()
	{
		String bgColour = Color.fromString(redNotePlsNote.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Confirm Instituition text is displayed
	public boolean verifyInstitutionText()
	{
		return func.verifyElementDisplayedWithText(textInstitution, "Institution");
	}
	
	//Confirm University of America text is displayed
	public boolean verifyUniversityOfAmericaText()
	{
		return func.verifyElementDisplayedWithText(textUniAmerica, "University of America");
	}
	
	//Confirm "+ Add Reimbursement Item" Button is displayed
	public boolean verifyAddReimbrsemntBtn()
	{
		return func.verifyElementDisplayedWithText(addReimbrsmntItemBtn, "+Add Reimbursement Item");
	}
	
	//Have to further work on this for driver to look for status that reads "Completed"
	public void clickAddReimbrsemntBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", addReimbrsmntItemBtn);
	}
	
	//Add Reimbursement button color
	public String addReimbBtnColor()
	{
		String bgColour = Color.fromString(addReimbrsmntItemBtn.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Confirm New Item header is displayed
	public boolean verifyNewItemHeader()
	{
		return func.verifyElementDisplayedWithText(headerNewItem, "New Item");
	}
	
	//Confirm Reimbursement Type text is displayed
	public boolean verifyReimbmntTypeTxt()
	{
		return func.verifyElementDisplayedWithText(txtReimbrsmntType, "Reimbursement Type");
	}
	
	public boolean reimbursementDDdisplayed()
	{
		return reimbursementDD.isDisplayed();
	}
	
	public void dropdownClick()
	{
		reimbursementDD.click(); 
	}
	
	public boolean dropdownOptions()
	{
		if(option1.isDisplayed() && option2.isDisplayed() && option3.isDisplayed() && option4.isDisplayed() && option5.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//Confirm Actual Cost text is displayed
	public boolean verifyActualCostText()
	{
		return func.verifyElementDisplayedWithText(txtActualCost, "Actual Cost");
	}
	
	//Confirm Actual Cost field is displayed
	public boolean verifyActualCostField()
	{
		return fieldActualCost.isDisplayed();
	}
	
	//Confirm Description text is displayed
	public boolean verifyDescriptionText()
	{
		return func.verifyElementDisplayedWithText(textDescription, "Description");
	}
	
	//Confirm Description field is displayed
	public boolean fieldDescription()
	{
		return fieldDescription.isDisplayed();
	}
	
	//Confirm Reimbursement Amount text is displayed
	public boolean verifyReimbsmntAmnt()
	{
		return func.verifyElementDisplayedWithText(txtReimbrsmntAmnt, "Reimbursement Amount");
	}
	
	//Confirm Attach Supporting Documentation (Including Curriculum) text is displayed
	public boolean verifytxtAttachSprtngdOC()
	{
		return func.verifyElementDisplayedWithText(txtAttachSprtngDoc, "Attach Supporting Documentation (Including Curriculum)");
	}
	
	//Confirm Upload File button is displayed
	public boolean uploadFileBtn()
	{
		return btnUploadFile.isDisplayed();
	}
	
	//Confirm Save Close button is displayed
	public boolean btnSaveClose()
	{
		return btnSaveClose.isDisplayed();
	
	}
	
	//Click file download button
	public void clickSaveClose()
	{
		for(int i=0; i<=2;i++){
			  try{
			     ldriver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/button[2]")).click();
			     break;
			  }
			  catch(StaleElementReferenceException e){
				  System.out.println(e.getMessage());
			  }
			  
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnSaveClose);
		}
	}
	//Confirm File Download button is displayed
	public boolean btnFileDownld()
	{
		return btnFileDownload.isDisplayed();
	}
	
	//Click file download button
	public void clickFileDownload()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnFileDownload);
	}
	
	//Confirm Trashcan symbol is displayed
	public boolean trashCanBtn()
	{
		return trashcanSymbol.isDisplayed();
	}
	
	//Click trash can symbol button
	public void clickTrashCan()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", trashcanSymbol);
	}
	
	//Confirm Item Type text
	public boolean verifyItemTypeTxt()
	{
		return func.verifyElementDisplayedWithText(txtItemType, "Item Type");
	}
	
	//Confirm Item Type text
//	public boolean verifyItemTypeTxt()
//	{
//		return func.verifyElementDisplayedWithText(txtItemType, "Item Type");
//	}
	
	//Confirm Other text
	public boolean verifyOtherText()
	{
		return func.verifyElementDisplayedWithText(txtOther, "Other");
	}
	
	//Confirm Description text
	public boolean verifyTxtDesc()
	{
		return func.verifyElementDisplayedWithText(txtDesc, "Description");
	}
	
	//Confirm Test text under description
	public boolean verifyTxtTest()
	{
		return func.verifyElementDisplayedWithText(txtTest, "test");
	}
	
	//Confirm Actual Costs text is displayed
	public boolean verifyTxtActualCost()
	{
//		return txtActualCosts.isDisplayed();
		return func.verifyElementDisplayedWithText(txtActualCosts, "Actual Costs");
	}
	
	//Confirm Amount under actual costs is displayed
	public boolean verifyAmntActualCost()
	{
		return func.verifyElementDisplayedWithText(amntActualCost, "$100.00");
	}
	
	//Confirm Approved Amount text is displayed
	public boolean verifyAppprvedAmnt()
	{
		return func.verifyElementDisplayedWithText(txtApprovedAmount, "Approved Amount");
	}
	
	//Confirm Amount under approved amount
	public boolean verifyAmntApprvdAmnt()
	{
		return func.verifyElementDisplayedWithText(amntApprvedAmount, "$0.00");
	}
	
	//Confirm "Total Actual Costs: $100.00" text is displayed
	public boolean verifyTotalActualCosts()
	{
		return txtTotalActualCosts.isDisplayed();
//		return func.verifyElementDisplayedWithText(txtTotalActualCosts, "Total Actual Costs: $100.00");
	}
	
	//Confirm Edit Pen Icon is displayed
	public boolean editPenIcon()
	{
		return editPenIcon.isDisplayed();
	}
	
	public void clickEditIcon()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", editPenIcon);
	}
	
	public boolean verifyEditItemHeader()
	{
		return func.verifyElementDisplayedWithText(editItem, "Edit Item");
	}
	
	//Confirm Trashcan symbol is displayed
	public boolean trashCanSymbolBtn()
	{
		return trashCanIconTwo.isDisplayed();
	}
	
	public void clickCreateBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", createFinalBtn);
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
	
	public void clickOther()
	{
		option3.click();
	}
	
	public void setActualCost()
	{
		fieldActualCost.sendKeys("100");
	}
	
	public void setDescrip()
	{
		fieldDescription.sendKeys("test");
	}
	
	public void clickTrashCanIcon()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", trashCanIconTwo);
	}
	
	public boolean remainingAmtDisplayed()
	{
		return remainingAmt.isDisplayed();
	}
	
	public boolean saveSubmitDisplayed()
	{
		return func.verifyElementDisplayedWithText(saveSubmit, "Save & Submit");
	}
	
	public String saveSubmitColor()
	{
		String bgColour = Color.fromString(saveSubmit.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	public void clickSaveSubmit()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", saveSubmit);
	}
	
	public boolean submittedTagDisplayed()
	{
		return func.verifyElementDisplayedWithText(submittedTag, "Submitted");
	}
	
	public boolean submittedStatusDisplayed()
	{
		return func.verifyElementDisplayedWithText(submittedStatus, "Submitted");
	}
	
	public boolean submittedTxtDisplayed()
	{
		return func.verifyElementDisplayedWithText(submittedTxt, "Submitted");
	}
}
