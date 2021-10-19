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

public class TC_VolunteerTrackingFormRejectSupervisor_001 extends BaseClass {

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
	
	@Test (priority=12)
	public void  clickVolunteerGrant() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.clickVolunteerGrant();
		vf.tagSubmittedDisplayed();
		logger.info("Submitted tag is displayed");
		
		vf.txtStatusChangedDisplayed();
		logger.info("\"Status changed\" text is displayed");
		
		vf.txtSubmittedDisplayed();
		logger.info("\"Submitted\" text is displayed");

	}
	
	@Test (priority=21)
	public void  hrConfirmationRejection1() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.btnRejectClickable();
		logger.info("Confirm Rejection form is displayed");
		
		boolean isPageHeader = vf.verifyHeaderConfirmRejection();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Confirm Rejection header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Confirm Rejection header is not displayed");
		}
	}
	
	@Test (priority=22)
	public void  supervisorConfirmationRejection4() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.enterReject();
		logger.info("Reject is entered");
		
		vf.btnReject2Clickable();
		logger.info("\"parkindustries-tst.outsystemsenterprise.com says\" \"Are you sure you want to submit? You will not be able to make any changes afterwards.\" message is displayed");
		
		//Switching to Alert        
        Alert alert = driver.switchTo().alert();
        //Accepting alert		
        alert.accept(); 
		logger.info("\"Form Rejected\" message is displayed");
	}
	
	@Test (priority=23)
	public void  supervisorConfirmationRejection5() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.txtStatusChangedByHumanResourcesUserDisplayed();
		logger.info("\"Status changed by Human Resources User\" text is displayed");
		
		vf.txtRejectedHRDisplayed();
		logger.info("\"Rejected\" text is displayed");
		
		vf.txtRejectHRDisplayed();
		logger.info("\"Reject\" text is displayed");
		
	}
}
