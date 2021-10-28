package parkIndustriesOutSystems.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import parkIndustriesOutSystems.pageObjects.FinalReimbursementForm;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;
import parkIndustriesOutSystems.pageObjects.TuitionReimbursementForm;


public class TC_FinalReimbursementForm_001 extends BaseClass {
	
	@Test (priority=0)
	public void  parkAssociateUserLogin() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
	
		pau.waitForPageLoaded();
		logger.info("AssociateForms login page is successfully opened");
		
		pau.clickParkAssociateUser();
		logger.info("Park Associate User is clicked");
	
	}
	
	@Test (priority=1)
	public void  parkAssociateUserHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = pau.verifyHeaderPAUR();
		if(isPageHeader == true) 
		{
			logger.info("Park Associate User Header is displayed");
			captureScreen(driver, "ParkAssociateUser");
		}
		else
		{
			logger.info("Park Associate User Header is not displayed");
		}
		
	}
	@Test (priority=2)
	public void  testInitialReimbursementForm() throws InterruptedException, IOException 
	{
		FinalReimbursementForm fr= new FinalReimbursementForm(driver);
		
		fr.clickInitialReimbLink();
		boolean isInitialFormDisplayed = fr.verifyHeaderInitialReimb();
		if(isInitialFormDisplayed == true) 
		{
			logger.info("Initial Tuition Reimbursement Header is displayed");
		}
		else
		{
			logger.info("Initial Tuition Reimbursement Header is not displayed so user did not successfully navigate to the form");
		}
		
		boolean isFinalReqTextDisplayed = fr.verifyTxtFinalTuitReimb();
		if(isFinalReqTextDisplayed == true) 
		{
			logger.info("Final Tuition Reimbursement Requests text is displayed");
		}
		else
		{
			logger.info("Final Tuition Reimbursement Requests text is not displayed");
		}
		
		boolean isCreateFinalReimbBtnDisplayed = fr.verifyBtnCreateFinalTuitReimb();
		if(isCreateFinalReimbBtnDisplayed == true) 
			{
				logger.info("Create Final Reimbursement Request Button is displayed");
			}
		else
			{
				logger.info("Create Final Reimbursement Request Button is not displayed");
			}
		
//		String createFinalReimBgColor = fr.btnCreateFinalBgColor();
		
		fr.btnCreateFinalBgColor();
		logger.info("New Request Text Background Color is displayed");
		System.out.println("Background Color is :" + fr.btnCreateFinalBgColor());
		
	}
		
		@Test(priority=3)
		public void testPersonalInfo()
		{
			FinalReimbursementForm fr= new FinalReimbursementForm(driver);

			fr.verifyPrsnlInfoHeader();
			logger.info("“Personal Info” header is displayed");
			fr.verifyTxtEmpNumb();
			logger.info("“Employee Number” header is displayed");
			fr.verifyEmpNumbField();
			logger.info("\"8888888\" is displayed as Employee Number");
			fr.verifyTxtAssoName();
			logger.info("“Associate Name” header is displayed");
			fr.verifyTxtParkAssoUsr();
			logger.info("\"Park Associate User\" is displayed");
			fr.verifyTxtDeprtmnt();
			logger.info("“Department” header is displayed");
			fr.verifyTxtSrvceFS();
			logger.info("\"SS Customer Service FS FS\" is displayed as Department");

		}
	
	
	@Test(priority=4)
	
	//Test=4
	//57-66
	public void testAddCommentForm() throws InterruptedException, IOException 
	{
		FinalReimbursementForm fr= new FinalReimbursementForm(driver);
		
		boolean cmt = fr.verifyAddCommentHeader();
		boolean placeholder = fr.placeholderTxtDisplayed();
		boolean saveBtn = fr.verifyBtnSave();
		String colour = fr.btnBckgrndSave();
		
		if(cmt && placeholder && saveBtn ) //&& colour.equals("#2652AF")
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
//			if(!colour.equals("#2652AF"))
//			{
//				logger.info("Save btn colour not displayed");
//			}
			Assert.assertTrue(false);
		}
		
		fr.setComment(comment);
		logger.info("Comment is entered");
		
		fr.clickSaveBtn();
		logger.info("Save button is clicked");
		
		boolean timeline = fr.newTimelineDisplayed();
		boolean parkUser = fr.parkCommentDisplayed();
		boolean parkUserTest = fr.parkCommentTestDisplayed();
		
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
	
	@Test(priority=5)
	//Test=5
	//67-71
	public void finalReimReqSection()
	{
		FinalReimbursementForm fr = new FinalReimbursementForm(driver);
		
		//verify final reimbursement request header
		boolean isFinalRmbrsmntHeader = fr.verifyHeaderFinalReimb();
		if(isFinalRmbrsmntHeader == true) 
			{
				logger.info("Final Reimbursement Request header is displayed");
			}
		else
			{
				logger.info("Final Reimbursement Request header is not displayed");
			}
		
		fr.clickCreateBtn();
		
		//verify Go To Initial Reimbursement Request Button
		boolean isGoToInitialReimbReqBtn = fr.verifyBtnInitialReimbReq();
		if(isGoToInitialReimbReqBtn == true) 
			{
				logger.info("Go To Initial Reimbursement Request Button is displayed");
			}
		else
			{
				logger.info("Go To Initial Reimbursement Request Button is not displayed");
			}
		
		//verify created tag 
		boolean isCreatedTagDisplayed = fr.verifyCreatedTag();
		if(isCreatedTagDisplayed == true) 
			{
				logger.info("Created Tag is displayed");
			}
		else
			{
				logger.info("Created Tag is not displayed");
			}
		
//		String createTagColor = fr.btnCreatedTag();

		fr.btnCreatedTag();
		logger.info("New Request Text Background Color is displayed");
		System.out.println("Background Color is :" + fr.btnCreatedTag());
		
		//verify case number text
		boolean isCaseNumbTxtDisplayed= fr.verifyCaseNumberTxt();
		if(isCaseNumbTxtDisplayed == true) 
			{
				logger.info("Case # text is displayed");
			}
		else
			{
				logger.info("Case # text is not displayed");
			}
	}
	
	@Test(priority=6)
	//Test =6
	//72-81
	public void testDeleteRequest()
	{
		FinalReimbursementForm fr = new FinalReimbursementForm(driver);
		
		//verify delete request link
		boolean isDeleteLinkDisplayed= fr.verifyDeleteReqLink();
		if(isDeleteLinkDisplayed == true) 
			{
				logger.info("Delete link is displayed");
			}
		else
			{
				logger.info("Delete link is not displayed");
			}
//		String deleteLinkColor = fr.linkDeleteReq();

		fr.linkDeleteReq();
		logger.info("New Request Text Background Color is displayed");
		System.out.println("Background Color is :" + fr.linkDeleteReq());
		
		fr.clickDeleteRequest();	
		logger.info("Clicked delete link");
		
		Alert alert = driver.switchTo().alert();
		
		//Click Cancel
		alert.dismiss();
		logger.info("User is taken back to Final Reimbursement Request form");
		
		//verify clicking cancel redirection
		boolean isFinalReimbReqDisplayed= fr.verifyHeaderFinalReimb();
		if(isFinalReimbReqDisplayed == true) 
		{
			logger.info("User redirected to Final Reimbursement Request form");
		}
		else
		{
			logger.info("Final Reimbursement Request form is not displayed");
		}
		
		fr.clickDeleteRequest();	
		logger.info("Clicked delete link");
				
		//Click Ok
		alert.accept();
		logger.info("User is taken back to Park Associate User's Requests form");
		
		boolean isNavigationCorrect= fr.verifyAssociateFinalHeader();
		if(isNavigationCorrect == true) 
		{
			logger.info("User redirected to Associate Final Request for Tuition Reimbursement form");
		}
		else
		{
			logger.info("Associate Final Request for Tuition Reimbursement form is not displayed");
		}
	}
	
	@Test(priority=7)
	//Test=7
	//82-135
	public void testFinalReimbReqForm()
	{
		FinalReimbursementForm fr = new FinalReimbursementForm(driver);
		
		fr.clickInitialReimbursement();
		logger.info("Initial Reimbursement clicked");	
		
		boolean associateInitialDisplayed= fr.verifyAssociateInitialHeader();
		if(associateInitialDisplayed == true) 
		{
		
			logger.info("Associate Initial Request for Tuition Reimbursement header is displayed");
		}
		else
		{
			logger.info("Associate Initial Request for Tuition Reimbursement header is not displayed");
		}
		
		fr.clickCompStatus();
		logger.info("Initial Reimbursement with Completed status clicked");
		
		fr.clickCreateBtn();
		
		boolean isFinalRmbrsmntHeader = fr.verifyHeaderFinalReimb();
		if(isFinalRmbrsmntHeader == true) 
		{
			logger.info("Final Reimbursement Request header is displayed");
		}
		else
		{
			logger.info("Final Reimbursement Request header is not displayed");
		}
		
		//Tuition assistance policy section
		boolean policyHeader = fr.policyHeaderDisplayed();
		boolean assistHeader = fr.assistanceHeaderDisplayed();
		boolean assistTxt = fr.assistanceTextDisplayed();
		
		if(policyHeader && assistHeader && assistTxt)
		{
			Assert.assertTrue(true);
			logger.info("Header's and Tuition Assistance text are displayed");
		}
		else
		{
			if(!policyHeader)
			{
				logger.info("Unable to locate “Tuition Assistance Policy” header");
			}
			if(!assistHeader)
			{
				logger.info("Unable to locate “Tuition Assistance” header");
			}
			if(!assistTxt)
			{
				logger.info("Unable to locate “Tuition Assistance” text");
			}
			Assert.assertTrue(false);
		}
		
		boolean eligibilty = fr.eligibilityHeaderDisplayed();
		boolean eligibilityTxt = fr.eligibilityTextDisplayed();
		
		if(eligibilty && eligibilityTxt)
		{
			Assert.assertTrue(true);
			logger.info("Header and Eligibility text are displayed");
		}
		else
		{
			if(!eligibilty)
			{
				logger.info("Unable to locate “Eligibility” header ");
			}
			if(!eligibilityTxt)
			{
				logger.info("Unable to locate “Eligibility” text");
			}
			Assert.assertTrue(false);
		}
		
		boolean terminationHeader = fr.terminationHeaderDisplayed();
		boolean text1 = fr.terminationTxt1Displayed();
		boolean text2 = fr.terminationTxt2Displayed();
		boolean text3 = fr.terminationTxt3Displayed();
		boolean text4 = fr.terminationTxt4Displayed();
		String italics = fr.textItalics();
		
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
		
		boolean timeAway = fr.timeAwayHeaderDisplayed();
		boolean timeText = fr.timeAwayTxtrDisplayed();
		
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
		
		boolean repaymnt = fr.repaymentHeaderDisplayed();
		boolean repaymntText = fr.repaymentTxtDisplayed();
		
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
		
		boolean repayment = fr.repaymentHeader2Displayed();
		boolean repaymentText = fr.repaymentTxt2Displayed();
		
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
		
		boolean col = fr.locateCol();
		
		if(col == true)
		{
			logger.info("All columns are displayed");
		}
		else
		{
			logger.info("All columns are not displayed");
		}
		
		boolean associate = fr.associateTxtDisplayed();
		boolean months = fr.monthsTxtDisplayed();
		boolean amt = fr.amountTxtDisplayed();
		boolean num = fr.numberTxtDisplayed();
		boolean num1 = fr.number1TxtDisplayed();
		boolean percent = fr.percentTxtDisplayed();
		boolean total = fr.totalTxtDisplayed();
		
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
		
		boolean masters = fr.mastersTxtDisplayed();
		boolean monthsSec = fr.monthsSecTxtDisplayed();
		boolean amtSec = fr.amountSecTxtDisplayed();
		boolean numSec = fr.numberSecTxtDisplayed();
		boolean num1Sec = fr.number1SecTxtDisplayed();
		boolean percentSec = fr.percentSecTxtDisplayed();
		boolean totalSec = fr.totalSecTxtDisplayed();
		
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
		
		
		//here
		
		
		//Continuation of Repayment Amount section
//		boolean isVerifyTheseSentDisplayed =fr.verifyTheseNumbersSentence();
//		boolean isVerifyForSentDisplayed = fr.verifyForExampleSentence();
		boolean isAllFinalSentDisplayed = fr.verifyAllFinalReimbrmntReqSentnce();
		boolean isPleaseNoteSentDisplayed =fr.verifyPleaseNoteSentence();
		boolean isInstiTxtDisplayed = fr.verifyInstitutionText();
		boolean isUniAmercaTxtDisplayed = fr.verifyUniversityOfAmericaText();
		
		if (isAllFinalSentDisplayed && isPleaseNoteSentDisplayed && isInstiTxtDisplayed && isUniAmercaTxtDisplayed) {
			Assert.assertTrue(true);
			logger.info("**These numbers are hypothetical to show an example of what this may look like for an associate that may owe Park text is displayed correctly");
			logger.info("For example, if you received $5,250............sentence is displayed correctly");
			logger.info("All final reimbursement requests must be submitted..........sentence  displayed correctly");
			logger.info("Please note: if you plan.............sentence is displayed correctly");
			logger.info("Instituition text is displayed correctly");
			logger.info("University of America text displayed correctly");
		}
		else {
//			if(!isVerifyTheseSentDisplayed){
//				logger.info("Unable to locate **These numbers are hypothetical to show an example of what this may look like for an associate that may owe Park text");
//			}
//			if(!isVerifyForSentDisplayed){
//				logger.info("Unable to locate For example, if you received $5,250............sentence");
//			}
			if(!isAllFinalSentDisplayed){
				logger.info("Unable to locate All final reimbursement requests must be submitted..........sentence ");
			}
			if(!isPleaseNoteSentDisplayed){
				logger.info("Unable to locate Please note: if you plan.............sentence");
			}
			if(!isInstiTxtDisplayed){
				logger.info("Unable to locate Instituition text");
			}
			if(!isUniAmercaTxtDisplayed){
				logger.info("Unable to locate University of America text");
			}
			Assert.assertTrue(false);
		}
		
//		String finalSentColor = fr.sentenceFinalColor();

		
//		String noteSentColor = fr.sentenceNoteColor();
		fr.sentenceNoteColor();
		logger.info("New Request Text Background Color is displayed");
		System.out.println("Background Color is :" + fr.sentenceNoteColor());
	}
	
	
	@Test(priority=8)
	//Test=8
	//136-150
	public void testAddReimbursement()
	{
		FinalReimbursementForm fr = new FinalReimbursementForm(driver);
		//verify +Add Reimbursement Item button 
		boolean isAddReimbursementBtnDisplayed= fr.verifyAddReimbrsemntBtn();
		if(isAddReimbursementBtnDisplayed == true) 
		{
			logger.info("+Add Reimbursement Item button is displayed");
		}
		else
		{
			logger.info("+Add Reimbursement Item button is not displayed");
		}
		
//		String addReimbBtnColor = fr.addReimbBtnColor();
		
		fr.addReimbBtnColor();
		logger.info("New Request Text Background Color is displayed");
		System.out.println("Background Color is :" + fr.addReimbBtnColor());
		
		fr.clickAddReimbrsemntBtn();
		
		//verify New Item header and form 
		boolean isNewItemFormDisplayed= fr.verifyNewItemHeader();
		if(isNewItemFormDisplayed == true) 
		{
		
			logger.info("New Item form and header is displayed");
		}
		else
		{
			logger.info("New Item form and header is not displayed");
		}
		
		//verify Reimbursement Type text
		boolean isReimbmntTypeTxtDisplayed= fr.verifyReimbmntTypeTxt();
		if(isReimbmntTypeTxtDisplayed == true) 
		{
			logger.info("Reimbursement Type text is displayed");
		}
		else
		{
			logger.info("Reimbursement Type text is not displayed");
		}
		
		boolean dropdownDisplayed = fr.reimbursementDDdisplayed();
		if(dropdownDisplayed == true) 
		{
			logger.info("Reimbursement Type drop down is displayed");
		}
		else
		{
			logger.info("Reimbursement Type drop down is not displayed");
		}
		
		fr.dropdownClick();
		logger.info("Drop down is clicked");
		
		boolean optionsDisplayed = fr.dropdownOptions();
		if(optionsDisplayed == true) 
		{
			logger.info("Drop down options are displayed");
		}
		else
		{
			logger.info("Drop down options are not displayed");
		}
		
		//New Item form section
		boolean isActualCostTxtDisplayed =fr.verifyActualCostText();
		boolean isActualCostFieldDisplayed = fr.verifyActualCostField();
		boolean isDescTxtDisplayed = fr.verifyDescriptionText();
		boolean isDescFieldDisplayed = fr.fieldDescription();
		boolean isReimbAmntDisplayed =fr.verifyReimbsmntAmnt();
		boolean isVerifyTxtAttachDisplayed = fr.verifytxtAttachSprtngdOC();
		
		
		if (isActualCostTxtDisplayed && isActualCostFieldDisplayed && isDescTxtDisplayed && isDescFieldDisplayed && isReimbAmntDisplayed && isVerifyTxtAttachDisplayed) {
			Assert.assertTrue(true);
			logger.info("Actual Cost text is displayed correctly");
			logger.info("Actual Cost field is displayed correctly");
			logger.info("Description text is displayed correctly");
			logger.info("Description field is displayed correctly");
			logger.info("Reimbursement Amount text is displayed correctly");
			logger.info("Attach supporting docs text is displayed correctly");
		}
		else {
			if(!isActualCostTxtDisplayed){
				logger.info("Unable to locate Actual Cost text");
			}
			if(!isActualCostFieldDisplayed){
				logger.info("Unable to locate Actual Cost field");
			}
			if(!isDescTxtDisplayed){
				logger.info("Unable to locate Description text");
			}
			if(!isDescFieldDisplayed){
				logger.info("Unable to locate Description field");
			}
			if(!isReimbAmntDisplayed){
				logger.info("Unable to locate Reimbursement Amount text");
			}
			if(!isVerifyTxtAttachDisplayed){
				logger.info("Unable to locate Attach supporting docs text");
			}
			Assert.assertTrue(false);
		}
		
		boolean isUploadFileBtnDisplayed =fr.uploadFileBtn();
		boolean isSaveAndCloseBtnDisplayed = fr.btnSaveClose();
		if(isUploadFileBtnDisplayed && isSaveAndCloseBtnDisplayed)
		{
			Assert.assertTrue(true);
			logger.info("Upload File Button is displayed correctly");
			logger.info("Save and Close button is displayed correctly");
		}
		else {
			if(!isUploadFileBtnDisplayed){
				logger.info("Unable to locate Upload File Button");
			}
			if(!isSaveAndCloseBtnDisplayed){
				logger.info("Unable to locate Save and Close button");
			}	
			Assert.assertTrue(false);
		}	
	}
	
	@Test(priority=9)
	//Test=10
	//191-217
	public void testAddReimbursementBtn()
	{
		FinalReimbursementForm fr = new FinalReimbursementForm(driver);
		
		fr.clickOther();
		logger.info("Other is selected as Reimbursement Type field");
		
		fr.setActualCost();
		logger.info("100 is entered");
		
		fr.setDescrip();
		logger.info("test is entered");
		
		WebElement upload = driver.findElement(By.xpath("//input[contains(@type,'file')]"));
		upload.sendKeys("C:\\Users\\Dilshana\\Documents\\Sample.txt");
		
	}

	@Test(priority=10)
	//Test=9
	//151-190
	public void testOtherReimbursementType()
	{
		FinalReimbursementForm fr = new FinalReimbursementForm(driver);
		
		boolean isDwnldFileBtnDisplayed =fr.uploadFileBtn();
		boolean isTrashBtnDisplayed = fr.btnSaveClose();
		if(isDwnldFileBtnDisplayed && isTrashBtnDisplayed)
		{
			Assert.assertTrue(true);
			logger.info("Download File Button is displayed correctly");
			logger.info("Trash can symbol button is displayed correctly");
		}
		else {
			if(!isDwnldFileBtnDisplayed){
				logger.info("Unable to locate download File Button");
			}
			if(!isTrashBtnDisplayed){
				logger.info("Unable to locate trash can symbol button");
			}	
			Assert.assertTrue(false);
		}
		
		fr.clickFileDownload();
		logger.info("File is downloaded");
		
		fr.clickTrashCan();
		logger.info("Clicked trash can symbol");
		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
		Alert alert = driver.switchTo().alert();
		
		//Click Cancel
		alert.dismiss();
		logger.info("User is taken back to Attach Supporting Documentation form");
				
		fr.clickTrashCan();
		logger.info("Clicked trash can symbol");
		
		//Click Ok
		alert.accept();
		logger.info("User is taken back to Edit Item form");
		}
		catch (NoAlertPresentException e)
		{
			System.out.println("NoAlertPresentException is handled");
		}
		
		fr.clickSaveClose();
		
		//Reimbursement item entries
		boolean isItemTypeTxtDisplayed =fr.verifyItemTypeTxt();
		boolean isOtherTextDisplayed = fr.verifyOtherText();
		boolean isDescTxtDisplayed = fr.verifyTxtDesc();
		boolean isTestTxtDisplayed = fr.verifyTxtTest();
		boolean isActualCostsTxtDisplayed =fr.verifyTxtActualCost();
		boolean isAmntDisplayed = fr.verifyAmntActualCost();
		boolean isApprvdAmntTxtDisplayed = fr.verifyAppprvedAmnt();
		boolean isAmntApprovedDisplayed = fr.verifyAmntApprvdAmnt();
		boolean isTotalCostTxtDisplayed = fr.verifyTotalActualCosts();
		
		
		if (isItemTypeTxtDisplayed && isOtherTextDisplayed && isDescTxtDisplayed && isTestTxtDisplayed && isActualCostsTxtDisplayed 
				&& isAmntDisplayed && isApprvdAmntTxtDisplayed && isAmntApprovedDisplayed && isTotalCostTxtDisplayed) {
			Assert.assertTrue(true);
			logger.info("Item type text is displayed correctly");
			logger.info("Other text is displayed correctly");
			logger.info("Description text is displayed correctly");
			logger.info("Test text is displayed correctly");
			logger.info("Actual Costs text is displayed correctly");
			logger.info("$100.00 underneath Actual Costs is displayed correctly");
			logger.info("Approved Amount text is displayed correctly");
			logger.info("$0.00 unuderneath Approved Amount is displayed correctly");
			logger.info("Total Actual Costs text is displayed correctly");
		}
		else {
			if(!isItemTypeTxtDisplayed){
				logger.info("Unable to locate Item type text");
			}
			if(!isOtherTextDisplayed){
				logger.info("Unable to locate Other text");
			}
			if(!isDescTxtDisplayed){
				logger.info("Unable to locate Description text");
			}
			if(!isTestTxtDisplayed){
				logger.info("Unable to locate Test text");
			}
			if(!isActualCostsTxtDisplayed){
				logger.info("Unable to locate Actual Costs text");
			}
			if(!isAmntDisplayed){
				logger.info("Unable to locate $100.00 underneath Actual Costs");
			}
			if(!isApprvdAmntTxtDisplayed){
				logger.info("Unable to locate Approved Amount text");
			}
			if(!isAmntApprovedDisplayed){
				logger.info("Unable to locate $0.00 unuderneath Approved Amount");
			}
			if(!isTotalCostTxtDisplayed){
				logger.info("Unable to locate Total Actual Costs text");
			}
			Assert.assertTrue(false);
		}
		
		boolean isEditPenIconDisplayed =fr.editPenIcon();
		boolean isTrashCanSymbolDisplayed = fr.trashCanSymbolBtn();
		if(isEditPenIconDisplayed && isTrashCanSymbolDisplayed)
		{
			Assert.assertTrue(true);
			logger.info("Edit pen icon is displayed correctly");
			logger.info("Trash can symbol button is displayed correctly");
		}
		else {
		if(!isEditPenIconDisplayed){
			logger.info("Unable to locate edit pen icon Button");
		}
		if(!isTrashCanSymbolDisplayed){
			logger.info("Unable to locate trash can symbol button");
		}	
			Assert.assertTrue(false);
		}
	}

	@Test(priority=11)
	public void testTrashCanIcon()
	{
		FinalReimbursementForm fr = new FinalReimbursementForm(driver);
		
		fr.clickTrashCanIcon();	
		logger.info("Trash can icon is clicked");
		
		Alert alert = driver.switchTo().alert();
		
		//Click Cancel
		alert.dismiss();
		logger.info("User is taken back to \"Final Reimbursement Request\" header form");
		
		fr.clickTrashCanIcon();	
		logger.info("Trash can icon is clicked");
		
		//Click Ok
		alert.accept();
		logger.info("User is taken back to \"Final Reimbursement Request\" header form");		
	}

	@Test(priority=12)
	public void testAddReimbursementBtnAgain()
	{
		FinalReimbursementForm fr = new FinalReimbursementForm(driver);
		
		fr.clickAddReimbrsemntBtn();
		logger.info("Add Reimbursement button is clicked");
		
		boolean isNewItemFormDisplayed= fr.verifyNewItemHeader();
		if(isNewItemFormDisplayed == true) 
		{
		
			logger.info("New Item form and header is displayed");
		}
		else
		{
			logger.info("New Item form and header is not displayed");
		}
		
		fr.clickOther();
		logger.info("Other is selected as Reimbursement Type field");
		
		fr.setActualCost();
		logger.info("100 is entered");
		
		fr.setDescrip();
		logger.info("test is entered");
		
		WebElement upload = driver.findElement(By.xpath("//input[contains(@type,'file')]"));
		upload.sendKeys("C:\\Users\\Dilshana\\Documents\\Sample.txt");
		
		fr.clickSaveClose();
		logger.info("Save & Close button is clicked");
		
		fr.clickEditIcon();
		logger.info("Edit Icons is clicked");
		
		boolean isEditItemDisplayed = fr.verifyEditItemHeader();
		if(isEditItemDisplayed == true) 
		{
		
			logger.info("Edit Item form and header is displayed");
		}
		else
		{
			logger.info("Edit Item form and header is not displayed");
		}
		
		fr.clickSaveClose();
		logger.info("Save & Close button is clicked");
		
		fr.verifyHeaderFinalReimb();
		logger.info("User is taken back to \"Final Reimbursement Request\" header form");
		
		boolean remainingAmtDisplayed = fr.remainingAmtDisplayed();
		if(remainingAmtDisplayed == true) 
		{
		
			logger.info("Remaining amount text is displayed");
		}
		else
		{
			logger.info("Remaining amount text is not displayed");
		}
		
		fr.saveSubmitColor();
		logger.info("Save & Submit button Background Color is displayed");
		System.out.println("Background Color is :" + fr.saveSubmitColor());
		
		fr.clickSaveSubmit();
		logger.info("Save & Submit button is clicked");
		
		Alert alert = driver.switchTo().alert();

		//Click Cancel
		alert.dismiss();
		logger.info("User is taken back to \"Final Reimbursement Request\" header form");

		fr.clickSaveSubmit();
		logger.info("Save & Submit button is clicked");
		
		//Click Ok
		alert.accept();
		logger.info("User is taken back to \"Final Reimbursement Request\" header form");		
	
		fr.submittedTagDisplayed();
		logger.info("Created Tag is updated to Submitted");
		
		fr.submittedStatusDisplayed();
		logger.info("\"Status changed\" text is displayed");
		
		fr.submittedTxtDisplayed();
		logger.info("\"Submitted\" text is displayed");
	}
	
}
