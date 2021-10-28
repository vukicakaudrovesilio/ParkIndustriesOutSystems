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

public class TC_BootsAndLuggageReimbursementFormSkipSupervisor_001 extends BaseClass {

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
	
	@Test (priority=7)
	public void  hrDetails1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		pau.myRequestsClickable();
		logger.info("Human Resources User's Requests form is displayed");
		
		balrf.clickBootsandLuggageReimbursement();
		logger.info("Boots & Luggage Reimbursement Form form is displayed");
		
	}
	
	@Test (priority=8)
	public void  hrDetails2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.lbtnCaseNumberClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		balrf.tagSubmittedDisplayed();
		logger.info("Submitted tag is displayed");
		
		balrf.txtStatusChanged1Displayed();
		logger.info("\"Status changed\" text is displayed");
		
		balrf.txtSubmittedDisplyed();
		logger.info("\"Submitted\" text is displayed");
	}
	
	@Test (priority=9)
	public void  hrDetails3() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnSkipSupervisorReviewClickable();
		logger.info("Confirm To Skip Supervisor form is displayed");
		
		balrf.txtConfirmToSkipSupervisorDisplayed();
		logger.info("\"Confirm To Skip Supervisor\" text is displayed");
		
		balrf.txtAddCommentPSDisplayed();
		logger.info("\"Add Comment *\" text is displayed");
		
		balrf.inputSkipSupervisorCommentDisplayed();
		logger.info("Add Comment field is displayed");
		
		balrf.btnCancelPSDisplayed();
		logger.info("Cancel Button is displayed");
		
		balrf.btnSkipSupervisorDisplayed();
		logger.info("Skip Supervisor Button is displayed");
	}
	
	@Test (priority=10)
	public void  hrDetails4() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnCancelPSClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
	}
	
	@Test (priority=11)
	public void  hrDetails5() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnSkipSupervisorReviewClickable();
		logger.info("Confirm To Skip Supervisor form is displayed");
		
		balrf.enterSkipSupervisor();
		logger.info("Skip Supervisor is entered");
	}
	
	@Test (priority=12)
	public void  hrDetails6() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnSkipSupervisorClickable();
		balrf.tagApprovedBySupervisorDisplayed();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		balrf.txtStatusChangedByHumanResourcesUserDisplayed();
		logger.info("\"Status changed by Human Resources User\" text is displayed");
		
		balrf.txtApprovedBySupervisorDisplayed();
		logger.info("\"Approved by Supervisor\" text is displayed");
		
		balrf.txtSkipSupervisorDisplayed();
		logger.info("\"Skip Supervisor\" text is displayed");
	}
	
	@Test (priority=13)
	public void  hrDetails7() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.clickheaderAssociateFormsPortal();
		
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
	
	@Test (priority=14)
	public void  hrDetails8() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnPickUpClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		balrf.tagHRReviewDisplayed();
		logger.info("HR Review tag is displayed");
		
		balrf.txtStatusChanged2Displayed();
		logger.info("\"Status changed\" text is displayed");
		
		balrf.txtHRReviewDisplayed();
		logger.info("\"HR Review\" text is displayed");
	}
	
	@Test (priority=15)
	public void  hrDetails9() throws InterruptedException, IOException 
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
	
	@Test (priority=16)
	public void  hrDetails10() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.lbtnSetApprovedAmountToClickable();
		balrf.lbtnFullAmountRequestedClickable();
		logger.info("USD Approved is set to $1.00");
		logger.info("\"Approved Amounts Updated!\" message is displayed");
	}

	@Test (priority=17)
	public void  hrConfirmationApproval1() throws InterruptedException, IOException 
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
	
	@Test (priority=18)
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
	
	@Test (priority=19)
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
	
	@Test (priority=20)
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
	
	@Test (priority=21)
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
		
		balrf.btnMarkAsCompleteClickable();
		logger.info("\"parkindustries-tst.outsystemsenterprise.com says\" \"Are you sure you want to Mark as Complete? This action cannot be undone.\" message is displayed");
		
		//Switching to Alert        
        Alert alert = driver.switchTo().alert();
        //Accepting alert		
        alert.accept();
        logger.info("Case Marked as Complete\" message is displayed");
        
        balrf.reimbursedCompletedTagDisplayed();
		logger.info("Reimbursement - Completed tag is displayed");
		
		balrf.txtStatusChangedByAccountingUserDisplayed();
		logger.info("\"Status changed by Accounting User\" text is displayed");
		
		balrf.txtReimbursedCompletedDisplayed();
		logger.info("\"Reimbursement - Completed\" text is displayed");

	}
}
