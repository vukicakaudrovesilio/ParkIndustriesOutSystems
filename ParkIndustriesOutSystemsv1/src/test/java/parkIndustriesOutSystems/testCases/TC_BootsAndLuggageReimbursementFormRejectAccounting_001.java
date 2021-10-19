package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.BootsAndLuggageReimbursementForm;
import parkIndustriesOutSystems.pageObjects.LoginPage;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;
import parkIndustriesOutSystems.pageObjects.ParkSupervisorUser;

public class TC_BootsAndLuggageReimbursementFormRejectAccounting_001 extends BaseClass {

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
	public void  clickBootsandLuggageReimbursement() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.clickBootsandLuggageReimbursement();
		logger.info("Boots and Luggage Reimbursement Form is displayed");
		
	}
	
	@Test (priority=2)
	public void  bootsLuggageRequestForm() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.newRequestClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		balrf.createdDisplayed();
		logger.info("\"Created\" tag is displayed");
		
		balrf.txtNewRequestByParkAssociateUserDisplayed();
		logger.info("\"New request by Park Associate User\" text is displayed");
		
		balrf.createdDisplayed();
		logger.info("\"Created\" text is displayed");
	}
	
	@Test (priority=3)
	public void  enterDetails() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.yearInput1();
		logger.info("2021 entered");
		
		balrf.selectLuggageType();
		logger.info("Luggage is selected");
		
		balrf.enterUSDRequest();
		logger.info("value of 1 is entered");
		
		logger.info("File Selection window opens");
		
		WebElement upload = driver.findElement(By.xpath("//input[contains(@type,'file')]"));
		upload.sendKeys(getFile());
		logger.info("File Selected");
		logger.info("File uploaded");
	}
	
	@Test (priority=4)
	public void  saveSubmit() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.saveSubmitClickable();
		logger.info("\"Form Submitted!\" message is displayed");
	}
	
	@Test (priority=5)
	public void  bootsLuggageConfirmation() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.txtStatusChanged1Displayed();
		logger.info("\"Status changed\" text is displayed");
		
		balrf.txtSubmittedDisplayed();
		logger.info("\"Submitted\" text is displayed");
		
		balrf.tagSubmittedDisplayed();
		logger.info("Submitted tag is displayed");
	}
	
	@Test (priority=6)
	public void  parkSupervisorLogin() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		LoginPage lp= new LoginPage(driver);
		
		pau.waitForPageLoaded();
		pau.goToSampleLoginClickable();
		logger.info("AssociateForms form is displayed");
		
		lp.clickParkSupervisorUser();
		logger.info("\"Logged in as: Park Supervisor User\" message appears");
		logger.info("Associate Forms Portal Screen is displayed");
		
		boolean isPageHeader = psu.verifyHeaderTaskbox();
		if(isPageHeader == true) 
		{
			logger.info("Taskbox Header is displayed");
		}
		else
		{
			logger.info("Taskbox Header is not displayed");
		}
	}
	
	@Test (priority=7)
	public void  parkSupervisorApprovalProcess1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.lbtnBootsLuggageReimbursementClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		balrf.txtStatusChanged1Displayed();
		logger.info("\"Status changed\" text is displayed");
		
	}
	
	@Test (priority=8)
	public void  parkSupervisorApprovalProcess2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnApproveClickable();
		boolean isPageHeader = balrf.verifyHeaderConfirmApproval();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Confirm Approval header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Confirm Approval header is not displayed");
		}
	}
	
	@Test (priority=9)
	public void  parkSupervisorApprovalProcess3() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.txtLuggagePSDisplayed();
		logger.info("\"Luggage\" text is displayed");
		
		balrf.txtTotalRequestedPSDisplayed();
		logger.info("\"Total requested: $5.00\" text is displayed");
		
		balrf.txtTotalApprovedPSDisplayed();
		logger.info("\"Total approved: $0.00\" text is displayed");
		
		balrf.txtCalenderYearReimbursementAllowedPSDisplayed();
		logger.info("\"Calendar Year\" text is displayed");
		
		balrf.txtAmountPSDisplayed();
		logger.info("\"Reimbursement Allowed $200.00 (Remaining: $30.00) text is displayed");
		
		balrf.txtAmountRequestedPSDisplayed();
		logger.info("\"Amount requested is under the remaining allowed amount.\" text is displayed");
		
		balrf.txtAddCommentPSDisplayed();
		logger.info("\"Add Comment\" text is displayed");
		
		balrf.inputAddCommentPSDisplayed();
		logger.info("Add Comment field is displayed");
		
		balrf.btnCancelPSDisplayed();
		logger.info("Cancel Button is displayed");
		
		balrf.btnApprovePSDisplayed();
		logger.info("Approve Button is displayed");
		
		balrf.btnCancelPSClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
	}
	
	@Test (priority=10)
	public void  parkSupervisorApprovalProcess4() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnApproveClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		boolean isPageHeader = balrf.verifyHeaderConfirmApproval();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Confirm Approval header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Confirm Approval header is not displayed");
		}
		
		balrf.enterApproved();
		logger.info("Approved is entered");
		
	}
	
	@Test (priority=11)
	public void  parkSupervisorApprovalProcess5() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnApprovePSClickable();
		logger.info("\"Form Approved!\" message is displayed");
		
		balrf.txtStatusChangedByParkSupervisorUserDisplayed();
		logger.info("\"Status changed by Park Supervisor User\" text is displayed");
		
		balrf.txtApprovedBySupervisorDisplayed();
		logger.info("\"Approved by Supervisor\" text is displayed");
		
		balrf.txtApprovedDisplayed();
		logger.info("\"Approved\" text is displayed");
		
		balrf.tagApprovedBySupervisorDisplayed();
		logger.info("Approved by Supervisor tag is displayed");
	}
	
	@Test (priority=12)
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
		if(isPageHeader == true) 
		{
			logger.info("Taskbox Header is displayed");
		}
		else
		{
			logger.info("Taskbox Header is not displayed");
		}
	}
	
	@Test (priority=13)
	public void  hrDetails1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnPickUpClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		balrf.txtStatusChanged2Displayed();
		logger.info("\"Status changed\" text is displayed");
		
		balrf.txtHRReviewDisplayed();
		logger.info("\"HR Review\" text is displayed");
		
	}
	
	@Test (priority=14)
	public void  hrDetails2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.lbtnSetApprovedAmountToClickable();
		
		boolean column = balrf.locateSetApprovedAmountToOptions();
		if(column == true)
		{
			logger.info("\"Full Amount Requested\" option is displayed");
			logger.info("\"Remaining Allowed for Calendar Year\" option is displayed");
			logger.info("\"Clear (Set to $0.00)\" option is displayed");
		}
		else
		{
			logger.info("Set Approved Amount To Options are not displayed correctly");
		}
	}
	
	@Test (priority=15)
	public void  hrDetails3() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.lbtnSetApprovedAmountToClickable();
		logger.info("\"Full Amount Requested\" option is displayed");
		balrf.lbtnRemainingAllowedForCalendarYearClickable();
		logger.info("USD Approved is set to $1.00");
		logger.info("\"Approved Amounts Updated!\" message is displayed");
	}
	
	@Test (priority=16)
	public void  hrConfirmationApproval1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnApproveClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		boolean isPageHeader = balrf.verifyHeaderConfirmApproval();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Confirm Approval header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Confirm Approval header is not displayed");
		}
	}
	
	@Test (priority=17)
	public void  hrConfirmationApproval2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.enterApproved();
		logger.info("Approved is entered");
		
		balrf.btnApproveHRClickable();
		logger.info("\"Form Approved\" message is displayed");
	}
	
	@Test (priority=18)
	public void  hrConfirmationApproval3() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.tagApprovedByHRDisplayed();
		logger.info("Approved by HR tag is displayed");
		
		balrf.txtStatusChangedByHumanResourcesUserDisplayed();
		logger.info("\"Status changed by Human Resources User\" text is displayed");
		
		balrf.txtApprovedByHRDisplayed();
		logger.info("\"Approved by HR\" text is displayed");
		
		balrf.txtApprovedDisplayed();
		logger.info("\"Approved\" text is displayed");
	}
	
	@Test (priority=19)
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
		if(isPageHeader == true) 
		{
			logger.info("Taskbox Header is displayed");
		}
		else
		{
			logger.info("Taskbox Header is not displayed");
		}
	}
	
	@Test (priority=20)
	public void  accountingDetails1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnPickUpClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		balrf.reimbursementPendingTagDisplayed();
		logger.info("Reimbursement Pending tag is displayed");
		
		balrf.txtStatusChanged3Displayed();
		logger.info("\"Status changed\" text is displayed");
		
		balrf.txtReimbursementPendingDisplayed();
		logger.info("\"Reimbursement Pending\" text is displayed");
	}
	
	@Test (priority=21)
	public void  accountingDetails2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnRejectReturnHRClickable();
		logger.info("Confirm Return to HR form is displayed");
		
		balrf.txtConfirmReturnToHRDisplayed();
		logger.info("\"Confirm Return to HR\" text is displayed");
		
		balrf.txtAddCommentPSDisplayed();
		logger.info("\"Add Comment *\" text is displayed");
		
		balrf.inputAddCommentPSDisplayed();
		logger.info("Add Comment field is displayed");
		
		balrf.btnCancelPSDisplayed();
		logger.info("Cancel Button is displayed");
		
		balrf.btnReturnToHRDisplayed();
		logger.info("Return to HR Button is displayed");
	}
	
	@Test (priority=22)
	public void  accountingDetails3() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnCancelPSClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
	}
	
	@Test (priority=23)
	public void  accountingDetails4() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnRejectReturnHRClickable();
		logger.info("Confirm Return to HR form is displayed");
		
		balrf.enterRejected();
		logger.info("Reject is entered");
		
	}
	
	@Test (priority=24)
	public void  accountingDetails5() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnReturnToHRClickable();
		balrf.tagReturnToHRDisplayed();
		logger.info("Returned to HR tag is displayed");
		
		balrf.txtStatusChangedByAccountingUserDisplayed();
		logger.info("\"Status changed by Accounting User\" text is displayed");
		
		balrf.txtReturnedToHRDisplayed();
		logger.info("\"Returned to HR\" text is displayed");
		
		balrf.txtRejectedAccountingCommentsDisplayed();
		logger.info("\"Reject\" text is displayed");
	}
	
	@Test (priority=25)
	public void  hrLogin2() throws InterruptedException, IOException 
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
		if(isPageHeader == true) 
		{
			logger.info("Taskbox Header is displayed");
		}
		else
		{
			logger.info("Taskbox Header is not displayed");
		}
	}
	
	@Test (priority=26)
	public void  hrDetails4() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnPickUpClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		balrf.txtStatusChanged2Displayed();
		logger.info("\"Status changed\" text is displayed");
		
		balrf.txtHRReviewDisplayed();
		logger.info("\"HR Review\" text is displayed");
		
	}
}
