package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.BootsAndLuggageReimbursementForm;
import parkIndustriesOutSystems.pageObjects.LoginPage;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;
import parkIndustriesOutSystems.pageObjects.ParkSupervisorUser;
import parkIndustriesOutSystems.pageObjects.SHARPForm;

public class TC_SHARPFormApproval_001 extends BaseClass {

	
	@Test (priority=0)
	public void  parkAssociateUserLogin() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		LoginPage lp= new LoginPage(driver);
	
		pau.waitForPageLoaded();
		logger.info("Login Screen is displayed");
		
		pau.clickParkAssociateUser();
		logger.info("Logged in as: Park Associate User is displayed");
		logger.info("AssociateForms Portal is successfully opened");
		
		lp.txtParkAssociateUsersRequestsDisplayed();
		logger.info("Park Associate User's Requests Header is displayed");
	
	}
	
	@Test (priority=1)
	public void  clickSHARPForms() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		sf.clickSHARPForm();
		logger.info("SHARP Form is displayed");
		
		balrf.newRequestClickable();
		logger.info("SHARP Request Form is displayed");
		
	}
	
	@Test (priority=2)
	public void  commentsField() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		sf.txtNewRequestDisplayed();
		logger.info("New Request by Park Associate User Text is displayed");
		
		sf.txtCreatedDisplayed();
		logger.info("Created Text is displayed");
	}
	
	@Test (priority=3)
	public void  enterDetails1() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		sf.enterStudentName();
		logger.info("Nesh is entered");
		
		sf.enterStudentAddress();
		logger.info("33 ABC Drive is entered");
		
		sf.clickYearInSchoolDropDown(); 
		logger.info("Field is selected");
		sf.clickYearInSchool(); 
		logger.info("7th Grade is selected");
		  
		sf.clickAwardDropDown(); 
		logger.info("Field is selected");
		sf.clickAwardExcellent(); 
		logger.info("Excellent Marks is selected");
		  
		sf.clickAwardPeriodDropDown(); 
		logger.info("Field is selected");
		sf.clickAwardPeriodJuly(); 
		logger.info("July - December is selected");
		  
		sf.clickRelationshipDropDown(); 
		logger.info("Field is selected");
		
		sf.clickRelationship(); 
		logger.info("Child is selected");
		  
		sf.enterSchool(); 
		logger.info("ABC School is entered");
		
		sf.attachedFiles1Clickable();
		logger.info("Attach Files form is displayed");
		
		WebElement upload = driver.findElement(By.xpath("//input[contains(@type,'file')]"));
		upload.sendKeys("C:\\BootsReceipt.jpg");
		logger.info("\"File uploaded!\" message is displayed");
	
		sf.btnCloseClickable();
		logger.info("User is taken to SHARP Request form");
		
		sf.saveSubmitClickable();
		logger.info("\"Form is Submitted!\" message is displayed");
		
		sf.txtStatusChanged1Displayed();
		logger.info("\"Status changed\" text is displayed");
		
		sf.txtSubmittedDisplayed();
		logger.info("\"Submitted\" text is displayed");
		 
	}
	
	@Test (priority=4)
	public void  hrLogin() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		LoginPage lp= new LoginPage(driver);
		
		pau.waitForPageLoaded();
		pau.goToSampleLoginClickable();
		logger.info("AssociateForms form is displayed");
		
		lp.clickHRUser();
		logger.info("Logged in as: Human Resources User message is displayed");
		logger.info("Associate Forms Portal Screen is displayed");
		
		boolean isPageHeader = psu.verifyHeaderTaskbox();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Taskbox Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Taskbox Header is not displayed");
		}
	}
	
	@Test (priority=5)
	public void  hrDetails1() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		sf.btnPickUpClickable();
		logger.info("User is taken to SHARP Request form");
		
		sf.txtStatusChanged2Displayed();
		logger.info("\"Status changed\" text is displayed");
		
		sf.txtHRReviewDisplayed();
		logger.info("\"HR Review\" text is displayed");
		
		sf.btnApprove1Clickable();
		logger.info("Confirm Approval form is displayed");
		
		sf.addCommentApprovalSection();
		logger.info("\"Approved\" text is entered");
		
		sf.btnApprove2Clickable();
		logger.info("\"Form Approved\" message is displayed");
	}
	
	@Test (priority=6)
	public void  hrDetails2() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		sf.approvedByHRTagDisplayed();
		logger.info("Submitted tag is updated to Approved by HR");
		
		sf.txtStatusChangedByHRUserDisplayed();
		logger.info("\"Status changed by Human Resources User\" text is displayed");
		
		sf.txtApprovedByHRDisplayed();
		logger.info("\"Approved by HR\" text is displayed");
		
		sf.txtApprovedDisplayed();
		logger.info("\"Approved\" text is displayed");
		
	}
	
	@Test (priority=7)
	public void  accountingLogin() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		LoginPage lp= new LoginPage(driver);
		
		pau.waitForPageLoaded();
		pau.goToSampleLoginClickable();
		logger.info("AssociateForms form is displayed");
		
		lp.clickAccountingUser();
		logger.info("Logged in as: Accounting User message is displayed");
		logger.info("Associate Forms Portal Screen is displayed");
		
		boolean isPageHeader = psu.verifyHeaderTaskbox();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Taskbox Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Taskbox Header is not displayed");
		}
	}
	
	@Test (priority=8)
	public void  accountingDetails1() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		sf.btnPickUpClickable();
		logger.info("User is taken to SHARP Request form");
		
		sf.paymentPendingTagDisplayed();
		logger.info("Payment Pending tag is displayed");
		
		sf.txtStatusChanged3Displayed();
		logger.info("\"Status changed\" text is displayed");
		
		sf.txtPaymentPendingDisplayed();
		logger.info("\"Payment Pending\" text is displayed");
		
		sf.btnMarkAsCompleteClickable();
		logger.info("\"parkindustries-tst.outsystemsenterprise.com says\" \"Are you sure you want to Mark as Complete? This action cannot be undone.\" message is displayed");
		
		//Switching to Alert        
        Alert alert = driver.switchTo().alert();
        //Accepting alert		
        alert.accept();
        logger.info("Case Marked as Complete\" message is displayed");
        
        sf.paymentCompletedTagDisplayed();
		logger.info("Payment Pending tag is updated to Payment - Completed");
		
		sf.txtStatusChangedByAccountingUserDisplayed();
		logger.info("\"Status changed by Accounting User\" text is displayed");
		
		sf.txtPaymentCompletedDisplayed();
		logger.info("\"Payment - Completed\" text is displayed");

	}
	
}
