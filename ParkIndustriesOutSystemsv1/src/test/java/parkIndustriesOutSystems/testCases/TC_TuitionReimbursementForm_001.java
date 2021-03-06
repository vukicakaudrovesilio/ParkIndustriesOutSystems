package parkIndustriesOutSystems.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import parkIndustriesOutSystems.pageObjects.HumanResourcesUser;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;
import parkIndustriesOutSystems.pageObjects.ParkSupervisorUser;
import parkIndustriesOutSystems.pageObjects.TuitionReimbursementForm;

public class TC_TuitionReimbursementForm_001 extends BaseClass{

	@Test (priority=0)
	public void parkAssociateUserLogin() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
	
		pau.waitForPageLoaded();
		logger.info("HRForms login page is successfully opened");
		
		pau.clickParkAssociateUser();
		logger.info("Park Associate User is clicked");
	
	}
	
	@Test (priority=1)
	public void testAssociateForms() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
		trf.clickTuitionRTab();
		logger.info("Tuition Reimbursement Form is clicked");
		
		boolean initialHeader = trf.tuitionReimburseFormDisplayed();
		boolean associateHeader = trf.associateHeaderDisplayed();
		boolean associateForms = trf.associatePortalHeaderDisplayed();
		
		if(initialHeader && associateHeader && associateForms)
		{
			Assert.assertTrue(true);
			logger.info("Page Headers are displayed correctly");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Page Headers are not displayed correctly");
		}
		
		trf.clickAssociateFormTab();
		logger.info("Associate Forms Portal tab is clicked");
		
		boolean parkAssociate = trf.parkAssociateUserDisplayed();
		
		if(parkAssociate == true)
		{
			logger.info("\"Park Associate User's Requests\" header is displayed");
		}
		else
		{
			logger.info("\"Park Associate User's Requests\" header is not displayed");
		}
	}
	
	@Test (priority=2)
	public void clickTuitionReimbursementForm() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);

		trf.clickTuitionRTab();
		logger.info("Tuition Reimbursement Form is clicked");
		
		trf.associateHeaderDisplayed();
		logger.info("???Associate Initial Request for Tuition Reimbursement??? header is displayed");
		
		boolean login = trf.loginHeaderDisplayed();
		
		if(login == true)
		{
			logger.info("???Go to Sample Login??? header is displayed");
		}
		else
		{
			logger.info("???Go to Sample Login??? header is not displayed");
		}
		
		trf.clickSampleLogin();
		logger.info("Go to Sample header is clicked");
		
		boolean loginTxt = trf.sampleUserTextDisplayed();
		
		if(loginTxt == true)
		{
			logger.info("\"Login as Sample User\" header text is displayed");
		}
		else
		{
			logger.info("\"Login as Sample User\" header text is not displayed");
		}
	}
	
	@Test (priority=3)
	public void testParkAssociateUser() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		logger.info("HRForms login page is successfully opened");
		
		pau.clickParkAssociateUser();
		logger.info("Park Associate User is clicked");
		
//		trf.clickParkAssociateUser();
//		logger.info("Park Associate User is clicked");
		
		trf.parkAssociateUserDisplayed();
		logger.info("\"Park Associate User's Requests\" header is displayed");
		
		trf.clickTuitionRTab();
		logger.info("Tuition Reimbursement Form is clicked");
		
		boolean parkUser = trf.parkUserDisplayed();
		
		if(parkUser == true)
		{
			logger.info("???Park Associate User??? is displayed on the top right");
		}
		else
		{
			logger.info("???Park Associate User??? is not displayed on the top right");
		}
		
		trf.clickParkAssociateUser();
		logger.info("Park Associate User is clicked");
		
		trf.signInPageDisplayed();
		logger.info("\"Sign in with your Park Industries Account:\" text is displayed");
		
	}
	
	@Test (priority=4)
	public void parkAssociateUserLoginPage() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
		driver.get(baseURL);
		
		pau.waitForPageLoaded();
		logger.info("HRForms login page is successfully opened");
		
		pau.clickParkAssociateUser();
		logger.info("Park Associate User is clicked");
		
		trf.clickTuitionRTab();
		logger.info("Tuition Reimbursement Form is clicked");
		
		boolean reqList = trf.reqListHeaderDisplayed();
		boolean searchbar = trf.searchBarDisplayed();
		//placeholder
		
		if(reqList && searchbar)
		{
			Assert.assertTrue(true);
			logger.info("Request list and searchbar are displayed correctly");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Request list and searchbar are not displayed correctly");
		}
		
		trf.enterText(text);
		logger.info("Enter Nesh in Search Bar");
		
		boolean text = trf.noItemsDisplayed();
		
		if(text == true)
		{
			logger.info("\"No items to show\" text is displayed");
		}
		else
		{
			logger.info("\"No items to show\" text is not displayed");
		}
		
//		trf.clear();
		trf.enterNum(number);
		logger.info("Enter 47 in Search Bar");
		
		boolean num = trf.numberDisplayed();
		
		if(num == true)
		{
			logger.info("Case # 47 is displayed");
		}
		else
		{
			logger.info("Case # 47 is not displayed");
		}
		
		trf.clear();
		logger.info("All results are displayed");
	}
		
	@Test (priority=5)
	public void testColumnsDisplayed() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
		boolean col = trf.locateColumnHeaders();
		
		if(col == true)
		{
			Assert.assertTrue(true);
			logger.info("Column Headers are displayed correctly");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Column Headers are not displayed correctly");
		}
		
		trf.clickCol1();
		logger.info("Case # column is clicked");
		
		trf.case1Displayed();
		logger.info("Case # 1 is displayed in first row");
		
		trf.clickCol1();
		
		trf.clickCol2();
		logger.info("Associate column is clicked");
		
		trf.parkAssociateUserColDisplayed();
		logger.info("Park Associate User is displayed in first row");
		
		trf.clickCol3();
		logger.info("Associate # column is clicked");
		
		trf.associateNumDisplayed();
		logger.info("8888888 is displayed in first row");
		
		trf.clickCol4();
		logger.info("Department column is clicked");
		
		trf.custServiceDisplayed();
		logger.info("SS Customer Service FS FS is displayed in first row");
		
		trf.clickCol4();
		logger.info("Department column is clicked");
		
		trf.custServiceDisplayed();
		logger.info("SS Customer Service FS FS is displayed in first row");
		
		trf.clickCol5();
		logger.info("Status column is clicked");
		
		trf.HRDisplayed();
		logger.info("Approved by HR is displayed in first row");
		
		trf.clickCol5();
		logger.info("Status column is clicked");
		
		trf.submittedDisplayed();
		logger.info("Submitted is displayed in first row");
		
		trf.clickCol6();
		logger.info("Date Submitted is clicked");
		
		trf.oldDateDisplayed();
		logger.info("05/19/2021 is displayed in first row");
		
		trf.clickCol6();
		logger.info("Date Submitted is clicked");
		
		trf.newDateDisplayed();
		logger.info("08/23/2021 is displayed in first row");
		
	}
		
	@Test (priority = 6)
	public void testPageMovement() throws InterruptedException, IOException 
	{	
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
		trf.pagesliderDisplayed();
		logger.info("Page slider is displayed");
		
		trf.pageItems1Displayed();
		logger.info("Page items are displayed");
		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		trf.clickPage2();
//		
//		trf.pageItems2Displayed();
//		logger.info("Page 2 items displayed");
	}
	
	@Test (priority=7)
	public void testNewRequestDisplayed() throws InterruptedException, IOException 
	{	
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
		boolean header = trf.associateHeaderDisplayed();
		
		if(header == true)
		{
			logger.info("???Associate Initial Request for Tuition Reimbursement??? header is displayed");
		}
		else
		{
			logger.info("Unable to locate header");
		}
	
		boolean reqBtn = trf.requestBtnDisplayed();
		
		if(reqBtn ==true)
		{
			logger.info("New Request Button is displayed");
		}
		else
		{
			logger.info("Unable to loc request button");
		}
		
		trf.btnReqColour();
		logger.info("New Request Text Background Color is displayed");
		System.out.println("Background Color is :" + trf.btnReqColour());

		trf.clickReqBtn();
		logger.info("New Request button is clicked");
		
		trf.initialReqHeaderDisplayed();	
		logger.info("???Intial Reimbursement Request??? header is displayed");
		trf.personalInfoHeaderDisplayed();
		logger.info("???Personal Info??? header is displayed");
		trf.empNumberFieldDisplayed();
		logger.info("???Employee Number??? header is displayed");
		trf.userEmpNumberDisplayed();
		logger.info("\"8888888\" is displayed as Employee Number");
		trf.associateNameDisplayed();
		logger.info("???Associate Name??? header is displayed");
		trf.associateNameValueDisplayed();
		logger.info("\"Park Associate User\" is displayed");
		trf.departmentFieldDisplayed();
		logger.info("???Department??? header is displayed");
		trf.departmentValueDisplayed();
		logger.info("\"SS Customer Service FS FS\" is displayed as Department");

	}
	
	@Test (priority=8)
	public void testAddCommentForm() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
		boolean cmt = trf.addCommentHeaderDisplayed();
		boolean placeholder = trf.placeholderTxtDisplayed();
		boolean saveBtn = trf.saveBtnDisplayed();
		String colour = trf.btnSaveColour();
		
		if(cmt && placeholder && saveBtn ) 
		{
			Assert.assertTrue(true);
			logger.info("Comment header, Placeholder text and Save button is displayed");
//			logger.info("Comment header, Placeholder text and Save button is displayed and Background Colour is: '" + colour + "'");
		}
		else
		{
			if(!cmt)
			{
				logger.info("Comment header not displayed");
			}
			if(!placeholder)
			{
				logger.info("Placeholder text not displayed");
			}
			if(!saveBtn)
			{
				logger.info("Save btn not displayed");
			}
			Assert.assertTrue(false);
		}
		
		trf.btnSaveColour();
		logger.info("Save button Background Color is displayed");
		System.out.println("Background Color is :" + trf.btnSaveColour());

		
		trf.setComment(comment);
		logger.info("Comment is entered");
		
		trf.clickSaveBtn();
		logger.info("Save button is clicked");
		
		boolean timeline = trf.newTimelineDisplayed();
		boolean parkUser = trf.parkCommentDisplayed();
		boolean parkUserTest = trf.parkCommentTestDisplayed();
		
		if(timeline && parkUser && parkUserTest)
		{
			Assert.assertTrue(true);
			logger.info("New timeline is updated and \"Park Associate User\" text is displayed");
		}
		else
		{
			if(!timeline)
			{
				logger.info("New timeline is not updated");
			}
			if(!parkUser)
			{
				logger.info("\"Park Associate User\" text is not displayed");
			}
			if(!parkUserTest)
			{
				logger.info("\"Test\" comment is not displayed");
			}
			Assert.assertTrue(false);
		}
		
	}
	
	@Test (priority=9)
	public void testTuitionReimbursementForm() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
		boolean header = trf.initialTuitionDisplayed();
		boolean createBtn = trf.createBtnDisplayed();
		String colour = trf.btnCreateColour();
		boolean caseNum = trf.caseNumDisplayed();
		
		if(header && createBtn && caseNum ) 
		{
			Assert.assertTrue(true);
			logger.info("Header, Create button, Case Number is displayed");
//			logger.info("Header, Create button, Case Number and Background Colour is: '" + colour + "'");
		}
		else 
		{
			if(!header)
			{
				logger.info("Unable to locate header");
			}
			if(!createBtn)
			{
				logger.info("Unable to locate create tag");
			}
			if(!caseNum)
			{
				logger.info("Unable to locate case number");
			}
			Assert.assertTrue(false);
		}
		
		trf.btnCreateColour();
		logger.info("Create button Background Color is displayed");
		System.out.println("Background Color is :" + trf.btnCreateColour());
	}
	
	@Test (priority=10)
	public void  testDeleteReq() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
		boolean delReq = trf.delReqDisplayed();
		
		if(delReq ) 
		{
			Assert.assertTrue(true);
			logger.info("Delete Request link displayed correctly");
//			logger.info("Delete Request link displayed correctly and Background Colour is: '" + colour + "'");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Delete Request link not displayed correctly");
		}
		
		trf.btnDeleteColour();
		logger.info("Delete button Background Color is displayed");
		System.out.println("Background Color is :" + trf.btnDeleteColour());
		
		trf.clickDelReqBtn();
		logger.info("Delete Request link clicked");
		
		//pop up
		Alert alert = driver.switchTo().alert();
		
		//Click cancel
		alert.dismiss();
		logger.info("User is taken back to \"Intial Reimbursement Request\" header form");
		
		trf.clickDelReqBtn();
		logger.info("Delete Request link clicked");
		
		//Click ok
		alert.accept();
		logger.info("User is taken back to \"Request List\" header form");
	}
		
	@Test (enabled = false)
//	@Test (priority = 11)
	public void testNewReq() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
		boolean text = trf.textDisplayed();
		String colour = trf.textColour();
		
		if(text ) //&& colour.equals("#EE3224")
		{
			Assert.assertTrue(true);
//			logger.info("Text is displayed correctly and Background Colour is: '" + colour + "'");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Text is not displayed correctly");
		}
		
		trf.textColour();
		logger.info("Text Background Color is displayed");
		System.out.println("Background Color is :" + trf.textColour());
		
		boolean policyHeader = trf.policyHeaderDisplayed();
		boolean assistHeader = trf.assistanceHeaderDisplayed();
		boolean assistTxt = trf.assistanceTextDisplayed();
		
		if(policyHeader && assistHeader && assistTxt)
		{
			Assert.assertTrue(true);
			logger.info("Header's and Tuition Assistance text are displayed");
		}
		else
		{
			if(!policyHeader)
			{
				logger.info("Unable to locate ???Tuition Assistance Policy??? header");
			}
			if(!assistHeader)
			{
				logger.info("Unable to locate ???Tuition Assistance??? header");
			}
			if(!assistTxt)
			{
				logger.info("Unable to locate ???Tuition Assistance??? text");
			}
			Assert.assertTrue(false);
		}
		
		boolean eligibilty = trf.eligibilityHeaderDisplayed();
		boolean eligibilityTxt = trf.eligibilityTextDisplayed();
		
		if(eligibilty && eligibilityTxt)
		{
			Assert.assertTrue(true);
			logger.info("Header and Eligibility text are displayed");
		}
		else
		{
			if(!eligibilty)
			{
				logger.info("Unable to locate ???Eligibility??? header ");
			}
			if(!eligibilityTxt)
			{
				logger.info("Unable to locate ???Eligibility??? text");
			}
			Assert.assertTrue(false);
		}
		
		boolean terminationHeader = trf.terminationHeaderDisplayed();
		boolean text1 = trf.terminationTxt1Displayed();
		boolean text2 = trf.terminationTxt2Displayed();
		boolean text3 = trf.terminationTxt3Displayed();
		boolean text4 = trf.terminationTxt4Displayed();
		String italics = trf.textItalics();
		
		if(terminationHeader && text1 && text2 && text3 && text4 && italics.equals(italics))
		{
			Assert.assertTrue(true);
			logger.info("Header and texts are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Header and texts are not displayed");
		}
		
		boolean timeAway = trf.timeAwayHeaderDisplayed();
		boolean timeText = trf.timeAwayTxtrDisplayed();
		
		if(timeAway && timeText)
		{
			Assert.assertTrue(true);
			logger.info("Header and Time Away text are displayed");
		}
		else
		{
			if(!timeAway)
			{
				logger.info("Unable to locate Header");
			}
			if(!timeText)
			{
				logger.info("Unable to locate text");
			}
			Assert.assertTrue(false);
		}
		
		boolean repaymnt = trf.repaymentHeaderDisplayed();
		boolean repaymntText = trf.repaymentTxtDisplayed();
		
		if(repaymnt && repaymntText)
		{
			Assert.assertTrue(true);
			logger.info("Header and Repayment if terminated text are displayed");
		}
		else
		{
			if(!repaymnt)
			{
				logger.info("Unable to locate Header");
			}
			if(!repaymntText)
			{
				logger.info("Unable to locate text");
			}
			Assert.assertTrue(false);
		}
		
		boolean repayment = trf.repaymentHeader2Displayed();
		boolean repaymentText = trf.repaymentTxt2Displayed();
		
		if(repayment && repaymentText)
		{
			Assert.assertTrue(true);
			logger.info("Header and Repayment Amount text are displayed");
		}
		else
		{
			if(!repayment)
			{
				logger.info("Unable to locate Header");
			}
			if(!repaymentText)
			{
				logger.info("Unable to locate text");
			}
			Assert.assertTrue(false);
		}
		
		boolean col = trf.locateCol();
		
		if(col == true)
		{
			logger.info("All columns are displayed");
		}
		else
		{
			logger.info("All columns are not displayed");
		}
		
		boolean associate = trf.associateTxtDisplayed();
		boolean months = trf.monthsTxtDisplayed();
		boolean amt = trf.amountTxtDisplayed();
		boolean num = trf.numberTxtDisplayed();
		boolean num1 = trf.number1TxtDisplayed();
		boolean percent = trf.percentTxtDisplayed();
		boolean total = trf.totalTxtDisplayed();
		
		if(associate && months && amt && num && num1 && percent && total)
		{
			Assert.assertTrue(true);
			logger.info("All table data in 1st row are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("All table data in 1st row are not displayed");
		}
		
		boolean masters = trf.mastersTxtDisplayed();
		boolean monthsSec = trf.monthsSecTxtDisplayed();
		boolean amtSec = trf.amountSecTxtDisplayed();
		boolean numSec = trf.numberSecTxtDisplayed();
		boolean num1Sec = trf.number1SecTxtDisplayed();
		boolean percentSec = trf.percentSecTxtDisplayed();
		boolean totalSec = trf.totalSecTxtDisplayed();
		
		if(masters && monthsSec && amtSec && numSec && num1Sec && percentSec && totalSec)
		{
			Assert.assertTrue(true);
			logger.info("All table data in 2nd row are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("All table data in 2nd row are not displayed");
		}
		
		boolean ins = trf.insHeaderDisplayed();
		boolean insText = trf.insTextDisplayed();
		
		if(ins && insText)
		{
			Assert.assertTrue(true);
			logger.info("Instructions header and texts are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Instructions header and texts are not displayed");
		}
		
	}
	
	@Test (priority = 12)
	public void testPreapprovalInfo() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
	
		boolean preapproval = trf.preapprovalHeaderDisplayed();
		if(preapproval == true)
		{
			logger.info("Header is displayed");
		}
		else
		{
			logger.info("Unable to locate header");
		}
		
		boolean ins = trf.institutionTextDisplayed();
		if(ins == true)
		{
			logger.info("Institution text is displayed");
		}
		else
		{
			logger.info("Unable to locate institution text");
		}
		
		boolean insField = trf.insFieldDisplayed();
		if(insField == true)
		{
			logger.info("Institution field is displayed");
		}
		else
		{
			logger.info("Unable to locate institution field");
		}
		
		boolean loc = trf.locTextDisplayed();
		if(loc == true)
		{
			logger.info("Location text is displayed");
		}
		else
		{
			logger.info("Unable to locate location text");
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		boolean locField = trf.locFieldDisplayed();
		if(locField == true)
		{
			logger.info("Location field is displayed");
		}
		else
		{
			logger.info("Unable to locate location field");
		}
		
		boolean program = trf.programTextDisplayed();
		if(program == true)
		{
			logger.info("Program text is displayed");
		}
		else
		{
			logger.info("Unable to locate Program text");
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		boolean progField = trf.programFieldDisplayed();
		if(progField == true)
		{
			logger.info("Program field is displayed");
		}
		else
		{
			logger.info("Unable to locate Program field");
		}
		
		}
		
	@Test (priority = 13)
//	@Test (enabled = false)
	public void testPreapprovalInfo2() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
//		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
//		try {
		boolean major = trf.majorTextDisplayed();
		boolean majField = trf.majorFieldDisplayed();

		if(major && majField)
		{
			Assert.assertTrue(true);
			logger.info("Fields are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Fields are not displayed");
		}
	
		
//	@Test (priority = 14)
////	@Test (enabled = false)
//	public void testPreapprovalInfo3() throws InterruptedException, IOException 
//	{
//		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
//		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		boolean descrip = trf.descripTextDisplayed();
		if(descrip == true)
		{
			logger.info("Description text is displayed");
		}
		else
		{
			logger.info("Unable to locate Description text");
		}
		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		boolean descripField = trf.descripFieldDisplayed();
		if(descripField == true)
		{
			logger.info("Description field is displayed");
		}
		else
		{
			logger.info("Unable to locate Description field");
		}
		
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		boolean total = trf.totalcostTextDisplayed();
		if(total == true)
		{
			logger.info("Total cost text is displayed");
		}
		else
		{
			logger.info("Unable to locate Total cost text");
		}
		
		boolean totalField = trf.totalcostFieldDisplayed();
		if(totalField == true)
		{
			logger.info("Total cost field is displayed");
		}
		else
		{
			logger.info("Unable to locate Total cost field");
		}

		
		boolean career = trf.careerTextDisplayed();
		if(career == true)
		{
			logger.info("Career text is displayed");
		}
		else
		{
			logger.info("Unable to locate Career text");
		}
		
		boolean careerField = trf.careerFieldDisplayed();
		if(careerField == true)
		{
			logger.info("Career field is displayed");
		}
		else
		{
			logger.info("Unable to locate Career field");
		}
		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		boolean link = trf.linkDisplayed();
		if(link == true)
		{
			logger.info("Link is displayed");
		}
		else
		{
			logger.info("Unable to locate link");
		}
		
		boolean linkText = trf.linkTextDisplayed();
		if(linkText == true)
		{
			logger.info("Link text is displayed");
		}
		else
		{
			logger.info("Unable to locate link text");
		}
		
		boolean remainingText = trf.remainingAmtDisplayed();
		if(remainingText == true)
		{
			logger.info("Remaining text is displayed");
		}
		else
		{
			logger.info("Unable to locate Remaining text");
		}
		
		boolean backBtn = trf.backBtnDisplayed();
		if(backBtn == true)
		{
			logger.info("Back button is displayed");
		}
//		}
//		catch( StaleElementReferenceException e)
//		{
//			System.out.println("Exception handled");
//		}

	}
	
	@Test (priority=14)
//	@Test (enabled = false)
	public void testBackButton() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
		trf.clickBackBtn();
		logger.info("Back button is clicked. User is taken to Request List Form");
		
		trf.associateHeaderDisplayed();
		logger.info("\"Associate Initial Request for Tuition Reimbursement\" header is displayed");

	}
		

	@Test (priority=15)
	public void testPreapprovalFields() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
				
		trf.clickReqBtn();
		logger.info("New Request button is clicked");
		
		trf.clickAttachBtn();
		logger.info("Attached files is clicked");
		
		boolean attachDoc = trf.attachDocFormDisplayed();
		boolean uploadBtn = trf.uploadBtnDisplayed();
		boolean closeBtn = trf.closeBtnDisplayed();
		
		if(attachDoc && uploadBtn && closeBtn)
		{
			Assert.assertTrue(true);
			logger.info("Attach Documentation, Upload and Close buttons are displayed");
		}
		else
		{
			if(!attachDoc)
			{
				logger.info("Unable to locate header");			
			}
			if(!uploadBtn)
			{
				logger.info("Unable to locate upload button");			
			}
			if(!closeBtn)
			{
				logger.info("Unable to locate close button");			
			}
			Assert.assertTrue(false);
//			logger.info("Attach Documentation, Upload and Close buttons are not displayed");
		}
		
		trf.clickCloseBtn();
		logger.info("Close button is clicked");
		
		trf.clickAttachBtn();
		logger.info("Attached files is clicked");
		
		
		WebElement upload = driver.findElement(By.xpath("//input[contains(@type,'file')]"));
		upload.sendKeys("C:\\Users\\Dilshana\\Documents\\Sample.txt");
		
		boolean dwnBtn = trf.downloadBtnDisplayed();
		boolean trash = trf.trashBtnDisplayed();
		
		if(dwnBtn && trash)
		{
			Assert.assertTrue(true);
			logger.info("Download and Trash buttons are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Download and Trash buttons are not displayed");
		}
		
		trf.clickDownloadBtn();
		logger.info("Download button is clicked");
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		trf.clickTrashBtn();
		logger.info("Trash button is clicked");
		
		Alert alert = driver.switchTo().alert();
		
		//Click cancel
		alert.dismiss();
		logger.info("User is taken back to \"Attach Supporting documentation (including curriculum)\" header form");
		
		trf.clickTrashBtn();
		logger.info("Trash button is clicked");
		
		//Click ok
		alert.accept();
		logger.info("User is taken back to \"Attach Supporting documentation (including curriculum)\" header form");
		
		trf.clickCloseBtn();
		logger.info("Close button is clicked");
		
		trf.setUni(uni);
		logger.info("University of America is entered successfully");
		
		trf.setLoc(Loc);
		logger.info("America is entered successfully");
		
		trf.setDegree(degree);
		logger.info("MBA is entered successfully");
		
		trf.setMajor(Major);
		logger.info("Business is entered successfully");
		
		trf.setDescrip(description);
		logger.info("Masters in Business Administration. Completion in 15/04/2023 is entered successfully");
	
		trf.setCost(cost);
		logger.info("100 is entered successfully");
		
		trf.setCareer(Career);
		logger.info("For promotion is entered successfully");
		
		trf.clickAttachBtn();
		logger.info("Attached files is clicked");
		
		WebElement upload2 = driver.findElement(By.xpath("//input[contains(@type,'file')]"));
		upload2.sendKeys("C:\\Users\\Dilshana\\Documents\\Sample.txt");
		
		boolean submitBtn = trf.submitBtnDisplayed();
//		String colour = trf.submitColour();
		
		if(submitBtn ) 
		{
			Assert.assertTrue(true);
			logger.info("Submit button is displayed");
//			logger.info("Submit button is displayed and  Background Colour is: '" + colour + "'");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Submit button is not displayed");
		}
		
		trf.clickSubmitBtn();
		logger.info("Submit button is clicked");
		
		boolean tuitionForm = trf.tuitionFormDisplayed();
		boolean PIform = trf.PIFormDisplayed();
		boolean form = trf.formContentDisplayed();
		
		if(tuitionForm && PIform && form )
		{
			Assert.assertTrue(true);
			logger.info("Form header and content are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Form header and content are not displayed");
		}
		
		boolean closebtn = trf.closeBtnFormDisplayed();
		
		if(closebtn == true)
		{
			logger.info("Close button is displayed");
		}
		else
		{
			logger.info("Close button is not displayed");
		}
		
		boolean acceptbtn = trf.acceptSubmitDisplayed();

		if(acceptbtn == true)
		{
			logger.info("Accept button is displayed");
		}
		else
		{
			logger.info("Accept button is not displayed");
		}
		
//		String colour = trf.acceptbtnColour();
		
		trf.acceptbtnColour();
		logger.info("Accept button Background Color is displayed");
		System.out.println("Background Color is :" + trf.acceptbtnColour());
		
		trf.clickCloseFormBtn();
		logger.info("Close button is clicked");
		
		trf.clickSubmitBtn();
		logger.info("Submit button is clicked");
			

		trf.clickAcceptFormBtn();
		logger.info("Accept & Submit Button is clicked");
		logger.info("User is taken to Initial Reimbursement Request form");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		boolean await = trf.awaitingTextDisplayed();
		boolean submitTag = trf.submittedTagDisplayed();
		boolean status = trf.statustDisplayed();
		boolean statusSubmit = trf.statusSubmitDisplayed();
		
		if(await && submitTag && status && statusSubmit)
		{
			Assert.assertTrue(true);
			logger.info("Awaiting text, Submitted tag and satus change are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Awaiting text, Submitted tag and satus change are not displayed");
		}
		
	}
	
	@Test (priority=16)
	public void  parkSupervisorUserLogin() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
	
		driver.get(baseURL);
		
		pau.waitForPageLoaded();
		logger.info("AssociateForms login page is successfully opened");
		
		psu.clickParkSupervisorUser();
		logger.info("Park Supervisor User is clicked");
		
		boolean associate = trf.associateFormsDisplayed();
		boolean taskbox = trf.taskboxDisplayed();
		
		if(associate && taskbox)
		{
			Assert.assertTrue(true);
			logger.info("Associate Form Portal and Taskbox is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Associate Form Portal and Taskbox is not displayed");
		}
		
	}
	
//	@Test (enabled = false)
	@Test (priority=17)
	public void  testSubmittedInitialTuition() throws InterruptedException, IOException 
	{
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
//		trf.clickCase();
		
		trf.clickSubmittedInitialLink();
		logger.info("Submitted Initial Tuition Reimbursement is clicked");
		
		trf.submittedTagDisplayed();
		logger.info("Submitted tag is displayed");
		
		boolean approve = trf.approveBtnDisplayed();
		String appColour = trf.approvebtnColour();
		boolean reject = trf.rejectBtnDisplayed();
		String rejColour = trf.rejectbtnColour();
		
		if(approve && reject )
		{
			Assert.assertTrue(true);
			logger.info("Approve and Reject button are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Approve and Reject button are not displayed");
		}
		
		trf.approvebtnColour();
		logger.info("Approve button Background Color is displayed");
		System.out.println("Background Color is :" + trf.approvebtnColour());

		trf.rejectbtnColour();
		logger.info("Reject button Background Color is displayed");
		System.out.println("Background Color is :" + trf.rejectbtnColour());
		
		trf.clickApproveBtn();
		logger.info("Approve button is clicked");
		
		boolean confirm = trf.confirmDisplayed();
		boolean comment = trf.commentDisplayed();
		boolean approveBtn = trf.approveBtn1Displayed();
		boolean cancelBtn = trf.cancelBtn1Displayed();
		
		if(confirm && comment && approveBtn && cancelBtn)
		{
			Assert.assertTrue(true);
			logger.info("Confirm approval header, add comment text, Approve and Cancel button are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Confirm approval header, add comment text, Approve and Cancel button are not displayed");
		}
		
		trf.clickApproveBtn1();
		logger.info("Approved button is clicked");
		
		boolean appBy = trf.approvedByDisplayed();
		boolean status = trf.statusChangedDisplayed();
		boolean appTag = trf.approvedByTagDisplayed();
		
		if(appBy && status && appTag)
		{
			Assert.assertTrue(true);
			logger.info("Approved By Supervisor, Status and Approved by Tag are displayed");
		}
		else
		{
			if(!appBy)
			{
				logger.info("Unable to locate header");	
			}
			if(!status)
			{
				logger.info("Unable to locate status");	
			}
			if(!appTag)
			{
				logger.info("Unable to locate app tag");	
			}
			Assert.assertTrue(false);
//			logger.info("Approved By Supervisor, Status and Approved by Tag are not displayed");
		}
		
		trf.clickSampleLogin();
		logger.info("Go to Sample login clicked");
	
	}
	
//	@Test (enabled =false)
	@Test (priority=18)
	public void  testHRUser() throws InterruptedException, IOException 
	{
		HumanResourcesUser hru= new HumanResourcesUser(driver);
		TuitionReimbursementForm trf = new TuitionReimbursementForm(driver);
		
		hru.clickHumanResourcesUser();
		logger.info("Human Resources User is clicked");
		
		trf.clickPickup();
		logger.info("Pickup button is clicked");
		
		trf.initialTuitionDisplayed();
		logger.info("Initial Tuition Reimbursement Form Details is displayed");
		
		trf.HRTagDisplayed();
		logger.info("HR Review tag is displayed");
		
		boolean approve = trf.approveHRDisplayed();
		String approveColour = trf.approveHRbtnColour();
		boolean reject = trf.rejectHRDisplayed();
		String rejectColour = trf.rejectHRbtnColour();
		
		if(approve && reject )
		{
			Assert.assertTrue(true);
			logger.info("Approve and Reject button are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Approve and Reject button are not displayed");
		}
		
		trf.clickApproveHR();
		logger.info("Approve button is clicked");
		
		boolean confirm = trf.confirmDisplayed();
		boolean comment = trf.commentDisplayed();
		boolean approveBtn = trf.approveFormHRDisplayed();
		boolean cancelBtn = trf.cancelFormHRDisplayed();
		
		if(confirm && comment && approveBtn && cancelBtn)
		{
			Assert.assertTrue(true);
			logger.info("Confirm approval header, add comment text, Approve and Cancel button are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Confirm approval header, add comment text, Approve and Cancel button are not displayed");
		}
		
		trf.clickApproveFormHR();
		logger.info("Approve button is clicked");
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		boolean HR = trf.approvedByHRDisplayed();
		if(HR == true)
		{
			logger.info("Approved by HR displayed");
		}
		else
		{
			logger.info("Approved by HR not displayed");
		}
		
		boolean status = trf.statusHRDisplayed();
		if(status == true)
		{
			logger.info("Status changed by Human Resources User displayed");
		}
		else
		{
			logger.info("Status changed by Human Resources User not displayed");
		}
		
		boolean statusApp = trf.statusApprovedByHRDisplayed();
		if(statusApp == true)
		{
			logger.info("Approved By HR text displayed");
		}
		else
		{
			logger.info("Approved By HR text not displayed");
		}
		
		boolean statusChange = trf.statusChangedHRDisplayed();
		if(statusChange == true)
		{
			logger.info("Status changed displayed");
		}
		else
		{
			logger.info("Status changed not displayed");
		}
		
		trf.clickAssociateFormTab();
		
		trf.clickForms();
		
		trf.clickTuition();
		
		trf.clickCompleted();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		boolean comp = trf.completedDisplayed();
		if(comp == true)
		{
			logger.info("Completed tag displayed");
		}
		else
		{
			logger.info("Completed tag not displayed");
		}
		
		boolean req = trf.reqClosedDisplayed();
		if(req == true)
		{
			logger.info("Request closed displayed");
		}
		else
		{
			logger.info("Request closed not displayed");
		}
		
	}
	
}

