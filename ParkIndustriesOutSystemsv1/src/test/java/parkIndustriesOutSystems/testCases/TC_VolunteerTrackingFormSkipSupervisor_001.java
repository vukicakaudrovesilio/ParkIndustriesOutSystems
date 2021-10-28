package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.BootsAndLuggageReimbursementForm;
import parkIndustriesOutSystems.pageObjects.LoginPage;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;
import parkIndustriesOutSystems.pageObjects.ParkSupervisorUser;
import parkIndustriesOutSystems.pageObjects.VolunteerForm;

public class TC_VolunteerTrackingFormSkipSupervisor_001 extends BaseClass {

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
	public void  clicVolunteerForm() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.clickVolunteerForm();
		logger.info("Volunteer Tracking form is displayed");
		
	}
	
	@Test (priority=2)
	public void  volunteerTrackingRequestForm() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.newRequestClickable();
		logger.info("Volunteer Tracking Request form is displayed");
		
		balrf.createdDisplayed();
		logger.info("\"Created\" tag is displayed");
		
		balrf.txtNewRequestByParkAssociateUserDisplayed();
		logger.info("\"New request by Park Associate User\" text is displayed");
		
		balrf.createdDisplayed();
		logger.info("\"Created\" text is displayed");
	}
	
	@Test (priority=3)
	public void  enterDetails1() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.fiscalYearInput();
		logger.info("Year entered");
		
		vf.volunteeringQuarterClickable();
		vf.fourthQuarterClickable();
		logger.info("Quarter selected");
		
	}
	
	@Test (priority=4)
	public void  enterDetails2() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.addAgencyCommitteeClickable();
		logger.info("Add Description form is displayed");
		
		vf.agencyOrParkIndustriesCommitteeInput2();
		logger.info("Park Industries Committee is entered");
		
		vf.volunteeringActivityInput2();
		logger.info("Training is entered");
		
		vf.dateStartInput2();
		logger.info("Date is entered");
		
		vf.dateEndInput2();
		logger.info("Date is entered");
		
		vf.companyTimeHoursInput2();
		logger.info("50 is entered");
		
		vf.personalTimeHoursInput2();
		logger.info("50 is entered");
		
		vf.saveCloseClickable();
		logger.info("\"Changes Saved!\" message is displayed");
	}
	
	@Test (priority=5)
	public void  enterDetails3() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.saveSubmitClickable();
		logger.info("\"parkindustries-tst.outsystemsenterprise.com says\" \"Are you sure you want to submit? You will not be able to make any changes afterwards.\" message is displayed");
		
		//Switching to Alert        
        Alert alert = driver.switchTo().alert();
        //Accepting alert		
        alert.accept();
       
	}
	
	@Test (priority=6)
	public void  enterDetails4() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.close2Clickable();
		logger.info("Eligible Agencies for Volunteer Grant form is displayed");
		
		vf.tagSubmittedDisplayed();
		logger.info("Submitted tag is displayed");
		
		vf.txtStatusChangedDisplayed();
		logger.info("\"Status changed\" text is displayed");
		
		vf.txtSubmittedDisplayed();
		logger.info("\"Submitted\" text is displayed");
		
		vf.txtEligibleAgenciesForVolunteerGrantDisplayed();
		logger.info("\"Volunteer Grant Created\" message is displayed");
	}
	
	@Test (priority=7)
	public void  clickCreateVolunteerGrant() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.btnCreateVolunteerGrant2Clickable();
		logger.info("\"Volunteer Grant Created\" message is displayed");
		
		boolean isPageHeader = vf.verifyHeaderVolunteerGrantRequest();
		if(isPageHeader == true) 
		{
			logger.info("Volunteer Grant Request form is displayed");
		}
		else
		{
			logger.info("Volunteer Grant Request form is not displayed");
		}
	}
	
	@Test (priority=7)
	public void  volunteerGrantRequestForm() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.tagCreatedDisplayed();
		logger.info("Created tag is displayed");
		
		vf.txtNewRequestByParkAssociateUserDisplayed();
		logger.info("\"New request by Park Associate User\" text is displayed");
		
		vf.txtCreatedDisplayed();
		logger.info("\"Created\" text is displayed");
	}
	
	@Test (priority=8)
	public void  enterDetails5() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.inputAddress();
		logger.info("4283 Express Lane is entered");
		
		vf.inputAssociateCity();
		logger.info("Sarasota is entered");
		
		vf.inputAssociateState();
		logger.info("Florida is entered");
		
		vf.inputAssociateZip();
		logger.info("34249 is entered");
		
		vf.inputDirectorsName();
		logger.info("Santiago Gangotena is entered");
		
		vf.inputAgencyPhoneNumber();
		logger.info("9415386941 is entered");
		
		vf.inputAgencyTaxExcemptCode();
		logger.info("161007 is entered");
		
		vf.inputAgencyAddress();
		logger.info("4283 Express Lane is entered");
		
		vf.inputAgencyCity();
		logger.info("Sarasota is entered");
		
		vf.inputAgencyState();
		logger.info("Florida is entered");
		
		vf.inputAgencyZip();
		logger.info("34249 is entered");
		
	}
	
	@Test (priority=9)
	public void  clickSaveSubmit() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.saveSubmit2Clickable();
		logger.info("\"parkindustries-tst.outsystemsenterprise.com says\" \"Are you sure you want to submit? You will not be able to make any changes afterwards.\" message is displayed");
		
		//Switching to Alert        
        Alert alert = driver.switchTo().alert();
        //Accepting alert		
        alert.accept(); 
	}
	
	@Test (priority=10)
	public void  clickSaveSubmitComments() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.tagSubmittedDisplayed();
		logger.info("Submitted tag is displayed");
		
		vf.txtStatusChangedDisplayed();
		logger.info("\"Status changed\" text is displayed");
		
		vf.txtSubmittedDisplayed();
		logger.info("\"Submitted\" text is displayed");

	}
	
	@Test (priority=11)
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
	
	@Test (priority=12)
	public void  hrDetails1() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		pau.myRequestsClickable();
		logger.info("Human Resources User's Requests form is displayed");
		
		vf.clickVolunteer2Form();
		logger.info("Volunteer Tracking form is displayed");
		
	}
	
	@Test (priority=13)
	public void  hrDetails2() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.lbtnCaseNumberClickable();
		logger.info("Volunteer Tracking Request form is displayed");
	
	}
	
	@Test (priority=14)
	public void  hrDetails3() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.lbtnParkIndustriesCommitteeClickable();
		logger.info("Volunteer Grant Request form is displayed");
	
	}
	
	@Test (priority=15)
	public void  hrDetails4() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.btnSkipSupervisorReviewClickable();
		logger.info("Confirm to Skip Supervisor form is displayed");
		
		vf.txtConfirmToSkipSupervisorDisplayed();
		logger.info("\"Confirm to Skip Supervisor\" text is displayed");
		
		vf.txtAddCommentDisplayed();
		logger.info("\"Add Comment *\" text is displayed");
		
		vf.inputAddCommentDisplayed();
		logger.info("Add Comment * field is displayed");
		
		vf.btnCancelPSDisplayed();
		logger.info("Cancel Button is displayed");
		
		vf.btnSkipSupervisorClickable();
		logger.info("Skip Supervisor button is displayed");
	
	}
	
	@Test (priority=16)
	public void  hrDetails5() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.btnCancelPSClickable();
		logger.info("Volunteer Grant Request form is displayed");
		
		vf.btnSkipSupervisorReviewClickable();
		logger.info("Confirm to Skip Supervisor form is displayed");
	}
	
	@Test (priority=17)
	public void  hrDetails6() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.enterApprovedHR();
		logger.info("Approved is entered");
		
		vf.btnSkipSupervisorClickable();
		logger.info("Volunteer Grant Request form is displayed");
		
	}
	
	@Test (priority=18)
	public void  hrDetails7() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.tagApprovedBySupervisorDisplayed();
		logger.info("Approved by Supervisor tag is displayed");
		
		balrf.txtStatusChangedByHumanResourcesUserDisplayed();
		logger.info("\"Status changed by Human Resources User\" text is displayed");
		
		balrf.txtApprovedByHRDisplayed();
		logger.info("\"Approved by Supervisor\" text is displayed");
		
		balrf.txtApprovedDisplayed();
		logger.info("\"Approved\" text is displayed");
		
		balrf.clickheaderAssociateFormsPortal();
		logger.info("Associate Forms Portal form is displayed");
	}
	
	@Test (priority=19)
	public void  hrDetails8() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnPickUpClickable();
		logger.info("Volunteer Grant Request form is displayed");
		
		balrf.tagApprovedByHRDisplayed();
		logger.info("HR Review tag is displayed");
		
		balrf.txtStatusChanged2Displayed();
		logger.info("\"Status changed\" text is displayed");
		
		balrf.txtHRReviewDisplayed();
		logger.info("\"HR Review\" text is displayed");
	}
	
	@Test (priority=20)
	public void  hrConfirmationApproval1() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.btnApproveClickable();
		
		boolean isPageHeader = vf.verifyHeaderConfirmApproval();
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
	
	@Test (priority=21)
	public void  hrConfirmationApproval2() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.enterApproved();
		logger.info("Approved is entered");
		
		vf.btnApprovePSClickable();
		logger.info("\"Form Submitted!\" message is displayed");
	}
	
	@Test (priority=22)
	public void  hrConfirmationApproval3() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.tagApprovedByHRDisplayed();
		logger.info("Approved by HR tag is displayed");
		
		vf.txtStatusChangedByHumanResourcesUserDisplayed();
		logger.info("\"Status changed by Human Resources User\" text is displayed");
		
		vf.txtApprovedByHRDisplayed();
		logger.info("\"Approved by HR\" text is displayed");
		
		vf.txtApprovedDisplayed();
		logger.info("\"Approved\" text is displayed");
	}
	
	@Test (priority=23)
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
	
	@Test (priority=24)
	public void  accountingDetails1() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.btnPickUpClickable();
		logger.info("Volunteer Grant Request form is displayed");
		
		vf.tagCheckRequestPendingDisplayed();
		logger.info("Check Request Pending tag is displayed");
		
		vf.txtStatusChanged2Displayed();
		logger.info("\"Status changed\" text is displayed");
		
		vf.txtCheckRequestPendingDisplayed();
		logger.info("\"Check Request Pending\" text is displayed");
		
		vf.txtCheckRequestPendingAddressDisplayed();
		logger.info("4283 Express Lane is entered");
		
		vf.inputCheckRequestPendingPayableTo();
		logger.info("Agency is entered");
	}
	
	@Test (priority=25)
	public void  accountingDetails2() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.checkRequestPendingVendorDropDownClickable();
		vf.checkRequestPendingVendorAlClickable();
		logger.info("12540 - Al's Fan Balancing Services is selected");
		
		vf.checkRequestPendingPaymentTargetDateInput();
		logger.info("Date is entered");
				
	}
	
	@Test (priority=26)
	public void  clickSaveMarkAsComplete() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.btnSaveMarkAsCompleteClickable();
		logger.info("\"parkindustries-tst.outsystemsenterprise.com says\" \"Are you sure you want to submit? You will not be able to make any changes afterwards.\" message is displayed");
		
		//Switching to Alert        
        Alert alert = driver.switchTo().alert();
        //Accepting alert		
        alert.accept();
        logger.info("Check Request Completed! message is displayed");
        
	}
	
	@Test (priority=27)
	public void  accountingDetails3() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.tagCompletedDisplayed();
		logger.info("Completed tag is displayed");
		
		vf.txtStatusChangedByAccountingUserDisplayed();
		logger.info("\"Status changed by Accounting User\" text is displayed");
		
		vf.txtCompletedDisplayed();
		logger.info("\"Completed\" text is displayed");
	}
}
